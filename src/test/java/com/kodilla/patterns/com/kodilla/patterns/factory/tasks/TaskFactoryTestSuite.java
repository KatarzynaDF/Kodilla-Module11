package com.kodilla.patterns.com.kodilla.patterns.factory.tasks;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.createTask(TaskFactory.SHOPPING_TASK);
        //Then
        Assert.assertEquals("Shopping task is processing - buy:" + "bread" + 3.0 + "pcs", shoppingTask.executeTask());
        Assert.assertEquals("FoodList", shoppingTask.getTaskName());
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.createTask(TaskFactory.PAINTING_TASK);
        //Then
        Assert.assertEquals("Painting task is processing - paint:" + "walls" + "with" + "white", paintingTask.executeTask());
        Assert.assertEquals("TheWall", paintingTask.getTaskName());
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingtask = factory.createTask(TaskFactory.DRIVING_TASK);
        //Then
        Assert.assertEquals("Driving task is processing - drive to:" + "Warszawa" + "using" + "car", drivingtask.executeTask());
        Assert.assertEquals("BuisnessTrip", drivingtask.getTaskName());
        Assert.assertEquals(true, drivingtask.isTaskExecuted());
    }

}