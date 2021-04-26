package ru.gb.lesson1;

public interface Obstacles {

    /**
     * Делает проверку на то, что может ли участник преодолеть данное препятствие
     *
     * @param participants объект участника (человек, кошка или робот)
     * @return true если участник преодолел препятствие, false если нет
     */
    boolean canDo(Participants participants);
}
