package com.spduniversity.javacore.hw12.ArrayURLemptyFolder;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    private static void copy(String[] urls, Path dst) {
        int THREADS = 3;
        ExecutorService pool = Executors.newFixedThreadPool(THREADS);
        List<Callable<Object>> list = new ArrayList<>();
        try {
            for (int i = 0; i < urls.length; ++i) {
                final String url = urls[i];
                final Path dstPath = dst.resolve(i + ".html");

                list.add(() -> {
                    download(url, dstPath);
                    return null;
                });
            }

            System.out.println("Downloading ... ");
            List<Future<Object>> listInvokeAll = pool.invokeAll(list);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            pool.shutdown();
            System.out.println("\nEnd download !");
        }
    }

    private static long download(String url, Path dst) {

        try {
            URI u = URI.create(url);
            try (InputStream in = u.toURL().openStream()) {

                Files.copy(in, dst, StandardCopyOption.REPLACE_EXISTING);
            }
            System.out.printf("\nFrom %s to  %s %nFile %s size %s bytes. \n"
                    , url, dst.toFile().getAbsolutePath(),dst.toFile().getName(), dst.toFile().length());

            return dst.toFile().length();
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static void main(String[] args) throws Exception {
        String urls[] = {"https://gitlab.com",
                "https://www.facebook.com",
                "https://www.yandex.ua/?clid=1923019",
                "https://www.youtube.com/watch?v=e27kNp8-ks8&t=15s"};
        copy(urls, Paths.get(""));
    }
}


