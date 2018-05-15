package org.jsmart.zerocode.parallel;

import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.Assert.*;

public class ExecutorServiceRunnerTest {

    @Test
    public void testLongDivision() {
        int rampUpPeriod = 1;
        int numberOfThreads = 5;

        Double delayBetweenTwoThreadsInMilliSecs = (Double.valueOf(rampUpPeriod)/Double.valueOf(numberOfThreads)) * 1000L;

        System.out.println("delay1: " + delayBetweenTwoThreadsInMilliSecs.longValue());
        System.out.println("delay2: " + (1D/5D));
    }

    @Test
    public void testLocalDateTime_now() {
        for(int i = 0; i < 10; i++){
            System.out.println("now: " + LocalDateTime.now());
            System.out.println("UUID: " + UUID.randomUUID());
        }
    }
}