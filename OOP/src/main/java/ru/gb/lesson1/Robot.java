package ru.gb.lesson1;

public class Robot implements Participants {
    private String name;
    private double canRun;
    private double canJump;

    public Robot() {
        this.name = "Робот";
        this.canRun = 100;
        this.canJump = 5;
    }

    public Robot(String name, double canRun, double canJump) {
        this.name = name;
        this.canRun = canRun;
        this.canJump = canJump;
    }

    public boolean run(double distance) {
        System.out.println(name + " бежит");
        return distance <= canRun;
    }

    public boolean jump(double height) {
        System.out.println(name + " прыгает");
        return height <= canJump;
    }

    public String getName() {
        return this.name;
    }
}
