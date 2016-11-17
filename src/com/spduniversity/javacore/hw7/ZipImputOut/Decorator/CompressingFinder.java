package com.spduniversity.javacore.hw7.ZipImputOut.Decorator;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

class CompressingFinder extends AbstractFinderDecorator {
    private String outputDir;
    private String outputFileName;

    CompressingFinder(FinderInterface decoratedFinder, String outputDir, String outputFileName) {
        super(decoratedFinder);
        this.outputDir = outputDir;
        this.outputFileName = outputFileName;
    }

    @Override
    public File[] find(String scanDir) {
        return compress(super.find(scanDir));
    }

    private File[] compress(File[] files) {
        String outputFilePath = outputDir + File.separator + outputFileName;
        ZipOutputStream zipOutputStream;

        byte[] buffer = new byte[4096];
        int bytesRead;

        try {
            zipOutputStream = new ZipOutputStream(new FileOutputStream(new File(outputFilePath)));
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());

            return files;
        }

        for (File file : files) {
            try {
                ZipEntry zipEntry = new ZipEntry(file.getName());
                FileInputStream fileInputStream = new FileInputStream(file);
                zipOutputStream.putNextEntry(zipEntry);

                while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                    zipOutputStream.write(buffer, 0, bytesRead);
                }

                zipOutputStream.closeEntry();
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        try {
            zipOutputStream.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return files;
    }
}
