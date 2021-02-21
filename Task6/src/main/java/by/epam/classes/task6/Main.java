package by.epam.classes.task6;

/*
 6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
заданное количество часов, минут и секунд.
 */
public class Main {
    public static void main(String[] args) {

        Time time = new Time(10, 12, 49);

        time.changeHours(12);
        time.changeMinutes(25);
        time.changeSeconds(32);

        time.print();

        time.addSeconds(70002);
        time.print();

        time.addMinutes(10000);
        time.print();

        time.addHours(209);
        time.print();
    }
}
