package com.kodilla.patterns.com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    final String taskName;
    final String where;
    final String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        return "Driving task is processing - drive to:" + where + "using" + using;
    }

    @Override
    public String getTaskName() {
        return taskName;

    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}
