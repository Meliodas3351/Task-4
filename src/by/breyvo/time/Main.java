package by.breyvo.time;

public class Main {
    public static void main(String[] args) {
        //Метод creatThe Time - для ввода времени с консоли
        //set... для изменения определенныхкомпонентов
        //plusTime для прибавления времени к нашему
        //Все методы предусматривают вывод времени в консоль
        Service service = new Service();
        service.creatTheTime();
        service.setHours(12);
        service.setMinutes(54);
        service.setSeconds(0);
        service.plusTime(3, 6, 59);
    }
}
