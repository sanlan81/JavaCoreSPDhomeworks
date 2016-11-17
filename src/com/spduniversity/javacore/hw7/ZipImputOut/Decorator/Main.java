package com.spduniversity.javacore.hw7.ZipImputOut.Decorator;

public class Main {
    public static void main(String[] args) {
        String scanDir = args[0];

        FinderInterface[] finders = {
                createFinder(scanDir, "jpg|jpeg|png|bmp|gif", "pictures.zip"),
                createFinder(scanDir, "wm|wav|mp3", "music.zip"),
                createFinder(scanDir, "avi|mp4|flv|mpeg|vob", "videos.zip")
        };

        for (FinderInterface finder : finders) {
            finder.find(scanDir);
        }
    }

    private static FinderInterface createFinder(String scanDir, String pattern, String outputFileName) {
        return new LoggingFinder(
                new CompressingFinder(
                        new FilteringFinder(
                                new Finder(),
                                pattern
                        ),
                        scanDir,
                        outputFileName
                )
        );
    }
}
