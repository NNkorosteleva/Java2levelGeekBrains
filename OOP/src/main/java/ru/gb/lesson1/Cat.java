package ru.gb.lesson1;

public class Cat implements Participants {
    private String name;
    private double canRun;
    private double canJump;

    public Cat() {
        this.name = "Мурка";
        this.canRun = 10;
        this.canJump = 2;
    }

    public Cat(String name, double canRun, double canJump) {
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
