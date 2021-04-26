package ru.gb.lesson1;

public interface Participants {

    /**
     * Выводит на экран, что участник бежит и делает проверку на то что пробежит ли участник эту дистанцию
     *
     * @param distance - дистанция, которая будет задана в объекте класса Treadmill
     * @return true, если участник пробежит дистанцию, false если нет
     */
    boolean run(double distance);

    /**
     * Выводит на экран, что участник прыгает и делает проверку на то что перепрыгнет ли участник эту высоту
     *
     * @param height - высота, которая будет задана в объекте класса Wall
     * @return true, если участник перепрыгнет высоту, false если нет
     */
    boolean jump(double height);

    /**
     * @return имя участника
     */
    String getName();
}
