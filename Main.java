package com.lab2;

class SuperDepartment {
    public String departmentName() {
        return "Super Department";
    }

    public String getTodaysWork() {
        return "No Work as of now";
    }

    public String getWorkDeadline() {
        return "Nil";
    }

    public String isTodayAHoliday() {
        return "Today is not a holiday";
    }
}

class AdminDepartment extends SuperDepartment {
    @Override
    public String departmentName() {
        return "Admin Department";
    }

    @Override
    public String getTodaysWork() {
        return "Complete your documents submission";
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }
}

class HrDepartment extends SuperDepartment {
    @Override
    public String departmentName() {
        return "HR Department";
    }

    @Override
    public String getTodaysWork() {
        return "Fill today timesheet and mark your attendance";
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String doActivity(String activity) {
        return activity;
    }
}

class TechDepartment extends SuperDepartment {
    @Override
    public String departmentName() {
        return "Tech Department";
    }

    @Override
    public String getTodaysWork() {
        return "Complete coding of Module 1";
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String getTechStackInformation() {
        return "Core Java";
    }
}

public class Main {
    public static void main(String[] args) {
        AdminDepartment adminDepartment = new AdminDepartment();
        System.out.println("Welcome to " + adminDepartment.departmentName());
        System.out.println(adminDepartment.getTodaysWork());
        System.out.println(adminDepartment.getWorkDeadline());
        System.out.println(adminDepartment.isTodayAHoliday());

        System.out.println();

        HrDepartment hrDepartment = new HrDepartment();
        System.out.println("Welcome to " + hrDepartment.departmentName());
        System.out.println(hrDepartment.doActivity("team Lunch"));
        System.out.println(hrDepartment.getTodaysWork());
        System.out.println(hrDepartment.getWorkDeadline());
        System.out.println(hrDepartment.isTodayAHoliday());

        System.out.println();

        TechDepartment techDepartment = new TechDepartment();
        System.out.println("Welcome to " + techDepartment.departmentName());
        System.out.println(techDepartment.getTodaysWork());
        System.out.println(techDepartment.getWorkDeadline());
        System.out.println(techDepartment.getTechStackInformation());
        System.out.println(techDepartment.isTodayAHoliday());
    }
}

