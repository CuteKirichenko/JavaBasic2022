package oop.classes.anon;

/**
 * Интерфейс для мониторинга статуса
 */
public interface Monitoring {

    //Все переменные интерфейса всегда паблик и файнал - они доступны всем, их нельзя менять
    String SIGN = "Tetiana Kirichenko";

    //Схема метода по печати статуса в консоль
    void printStatus();
}
