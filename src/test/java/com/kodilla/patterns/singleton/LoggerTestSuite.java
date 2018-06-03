package com.kodilla.patterns.singleto
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeClass
    public static void openLogFile() {
        logger.getInstance().open();
    }

    @AfterClass
    public static void closeLogFile() {
        logger.getInstance().close();
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        logger.getInstance().log("User logged in");
        //Then
        Assert.assertEquals("User logged in", logger.getInstance().getLastLog());
    }

    @Test
    public void testGetLastLogwhenTwiceLogged() {
        //Given
        //When
        logger.getInstance().log("User logged in");
        logger.getInstance().log("What do you want to do?");
        //Then
        Assert.assertEquals("What do you want to do?", logger.getInstance().getLastLog());
    }
}
