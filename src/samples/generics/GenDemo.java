package samples.generics;

// Продемонстрировать применение обобщенного класса
public class GenDemo {

    public static void main(String[] args) {

        Gen<Integer> iOb;

        iOb = new Gen<>(88);
        iOb.showType();

        int v = iOb.getOb();
        System.out.println("Значение: " + v + "\n");

        Gen<String> strOb = new Gen<>("Тест обобщений");
        strOb.showType();

        String str = strOb.getOb();
        System.out.println("Значение: " + str);

    }

}
