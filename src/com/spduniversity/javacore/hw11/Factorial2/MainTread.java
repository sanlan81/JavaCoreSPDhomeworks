package com.spduniversity.javacore.hw11.Factorial2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class MainTread implements Runnable {
    private List<BigInteger> arr = new ArrayList<>();
    private List<Long> arrTime = new ArrayList<>();

    private BigInteger bigItBigIntegerB = BigInteger.valueOf(0);
    private long longTime = 0;


    @Override
    public void run() {
        mainThread();

        for (BigInteger anArr : arr) {
            bigItBigIntegerB = bigItBigIntegerB.add(anArr);
        }

        for (Long everyThreadTime : arrTime) {
            longTime = longTime + everyThreadTime;

        }
        System.out.println(Thread.currentThread().getName() + "" +
                "" + bigItBigIntegerB + "\n Total time " + longTime +" ms");
    }

    private synchronized void mainThread() {
        Factorial factorial;
        Thread thread[] = new Thread[100];

        for (int i = 0; i < thread.length; i++) {
            long startTime = System.currentTimeMillis();
            factorial = new Factorial(i +1 , startTime);
            thread[i] = new Thread(factorial);
            thread[i].setName("Thread number : " + i);

            thread[i].start();
            try {
                thread[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    private class Factorial implements Runnable {
        private final long startTime;
        private int numberFactorial = 0;

        Factorial(int number, long startTime) {
            this.startTime = startTime;
            this.numberFactorial = number;
        }

        private List<BigInteger> arrayList = new ArrayList<>();

        {
            arrayList.add(BigInteger.valueOf(1));
        }

        synchronized BigInteger getFactorial() {

            if (numberFactorial < 0) throw new IllegalArgumentException("Number must be not minus");
            for (int size = arrayList.size(); size <= numberFactorial; size++) {
                BigInteger lastfact = arrayList.get(size - 1);
                BigInteger nextfact = lastfact.multiply(BigInteger.valueOf(size));

                arrayList.add(nextfact);
            }
            long timeSpent = System.currentTimeMillis() - startTime;

            System.out.println("Current " + Thread.currentThread().getName() +
                    " finished works with result. " + arrayList.get(numberFactorial) +
                    "\n" + "Time of work  Current  Thread " + timeSpent + " ms \n");

            arrTime.add(timeSpent);

            arr.add(arrayList.get(numberFactorial));//Added to my Array

            return arrayList.get(numberFactorial);
        }

        public void run() {
            getFactorial();

        }
    }
}

