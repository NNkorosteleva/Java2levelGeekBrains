package ru.gb.lesson1;

public class Wall implements Obstacles {
    private double height;

    public Wall() {
        this.height = 1;
    }

    public Wall(double height) {
        this.height = height;
    }

    public boolean canDo(Participants participants) {
        if (participants.jump(this.height)) {
            System.out.println(participants.getName() + " успешно прыгнул через препятствие");
            return true;
        } else {
            System.out.println(participants.getName() + " не смог прыгнуть через препятствие");
            return false;
        }
    }
}
