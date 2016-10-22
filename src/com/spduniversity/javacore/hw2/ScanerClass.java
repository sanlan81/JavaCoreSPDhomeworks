package com.spduniversity.javacore.hw2;

import java.util.Scanner;
import java.util.regex.MatchResult;

class ScanerClass {

    private static String[] myData = {
            "58.27.82.161--[05/Feb/2016:21:29:16 +0200]\"GET/HTTP/1.1\" 200 285",
            "204.45.234.40--[18/Feb/2016:07:35:36 +0200]\"favicon.ico/HTTP/1.1\" 404 1189",
            "56.67.156.56--[11/Jun/2016:01:10:15 +0200]\"GET/login HTTP/1.1\" 200 14304",
            "213.177.76.35--[02/Jul/2016:11:38:00 +0200]\"GET/login HTTP/1.1\" 500 1898"};

    public static void main(String[] args){


        String pattern = "(\\d+[.]\\d+[.]\\d+[.]\\d+)--\\D(\\d{2}/\\w+/\\d{4})\\D(\\d+[:]\\d+[:]\\d+)" +
                "\\s\\D\\d+\\D+\\w+[.]?\\w+/\\w+\\s?\\w+?/\\d+[.]\\d+\\D+\\s\\d+\\s\\d+";

        Scanner scanner = null;

        for (String s : myData) {
            scanner = new Scanner(s);
            scanner.useDelimiter("\\s*,\\s*");
            scanner.hasNext(pattern);
            scanner.next(pattern);

            MatchResult match = scanner.match();

            String ip = match.group(1);
            String date = match.group(2);
            String time = match.group(3);

            System.out.format("Threat on %s at %s  from %s\n", date, time, ip);
        }
    }
}


