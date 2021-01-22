package samples.generics;

// Класс Non Gen - функциональный эквивалент класса Gen без обобщений
public class NonGen {

    private Object ob;

    NonGen(Object ob) {
        this.ob = ob;
    }

    Object getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Объект ob относится к типу " + ob.getClass().getName());
    }

}
