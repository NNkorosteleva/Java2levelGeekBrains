package ru.gb.lesson1;

public class Treadmill implements Obstacles {
    private double distance;

    public Treadmill() {
        this.distance = 1;
    }

    public Treadmill(double distance) {
        this.distance = distance;
    }

    public boolean canDo(Participants participants) {
        if (participants.run(this.distance)) {
            System.out.println(participants.getName() + " успешно пробежал через препятствие");
            return true;
        } else {
            System.out.println(participants.getName() + " не смог пробежать через препятствие");
            return false;
        }
    }
}
