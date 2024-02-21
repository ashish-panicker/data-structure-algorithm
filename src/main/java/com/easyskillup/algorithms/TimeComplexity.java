package com.easyskillup.algorithms;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.easyskillup.Executor;

public class TimeComplexity implements Executor {

    private Logger logger = Logger.getLogger(TimeComplexity.class.getName());

    private long findSum(long n) {
        return n * (n + 1) / 2;
    }

    private long findSumUsingLoop(long n) {
        long sum = 0;
        for (long i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public void execute() {
        double now = System.currentTimeMillis();
        logger.log(Level.INFO, "Sum of 9999999 = {0} [findSum]", findSum(9999999));
        logger.log(Level.INFO, "Time taken = {0} milliseconds.", (System.currentTimeMillis() - now));
        
        now = System.currentTimeMillis();
        logger.log(Level.INFO, "Sum of 9999999 = {0} [findSumUsingLoop]", findSumUsingLoop(9999999));
        logger.log(Level.INFO, "Time taken = {0} milliseconds.", (System.currentTimeMillis() - now));
    }

    public static void main(String[] args) {
        new TimeComplexity().execute();
    }
}
