package samples.enums;

public class EnumDemo {
    public static void main(String[] args) {

        Apple ap, ap2, ap3;

        // Получить все порядковые значения с помощью метода ordinal()
        // ordinal() - возвращает значение, обозначающее позиции константы
        System.out.println("Все константы сортов яблок и их порядковые значения: ");
        for (Apple a : Apple.values()) {
            System.out.println(a + " " + a.ordinal());
        }

        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;

        System.out.println();

        /*
        compareTo() - сравнивает порядковые значения двух констант одного типа
        Возвращает отрицательно значение, если сравниваемая константа стоит на позиции < передаваемой
        Возвращает ноль, если сравниваемая константа стоит на той же позиции, что и передаваемая
        Возвращает положительное число, если сравниваемая константа стоит на позиции > передаваемой
         */
        /*
         equals() - сравнивает константу с любым объектом
         Вернет True, если объекты ссылаются на одну и туе кнстанту одного и тогоже перечисления
         */
        // Демонстрация работы методов compareTo() и equals()
        if (ap.compareTo(ap2) < 0) System.out.println(ap + " предшествует " + ap2);
        if (ap.compareTo(ap2) > 0) System.out.println(ap2 + " предшествует " + ap);
        if (ap.compareTo(ap3) == 0) System.out.println(ap + " равно " + ap3);

        System.out.println();

        if (ap.equals(ap2)) System.out.println("Ошибка!");
        if (ap.equals(ap3)) System.out.println(ap + " равно " + ap3);
        if (ap == ap3) System.out.println(ap + " == " + ap3);

    }
}
