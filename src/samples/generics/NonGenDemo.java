package samples.generics;

// Продемонстрировать необобщенный класс
public class NonGenDemo {

    public static void main(String[] args) {

        NonGen iOb;

        iOb = new NonGen(88);
        iOb.showType();

        int v = (Integer) iOb.getOb();
        System.out.println("Значение: " + iOb.getOb() + "\n");

        NonGen strOb = new NonGen("Тест без обобщений");
        strOb.showType();

        String str = (String) strOb.getOb();
        System.out.println("Значение: " + str);

    }

}
