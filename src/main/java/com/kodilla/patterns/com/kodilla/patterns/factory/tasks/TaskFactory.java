package com.kodilla.patterns.com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING_TASK=";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";

    public final Task createTask(final String taskType) {
        switch (taskType) {
            case SHOPPING_TASK:
                return new ShoppingTask("FoodList", "bread", 3);
            case PAINTING_TASK:
                return new PaintingTask("TheWall", "white", "walls");
            case DRIVING_TASK:
                return new DrivingTask("BuisnessTrip", "Warszawa", "car");
            default:
                return null;
        }
    }
}