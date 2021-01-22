package samples.generics;


// Простой обобщенный класс.
// T - обозначает параметр типа,
// который будет заменен реальным
// типом при создании объекта типа Gen

public class Gen<T> {

    T ob; // Объявить объект типа T

    // Передать констркутору ссылку на объект типа T
    Gen(T ob) {
        this.ob = ob;
    }

    // Возвратить объект ob
    T getOb() {
        return ob;
    }

    // Показать тип T
    void showType() {
        System.out.println(" Типом T является " + ob.getClass().getName());
    }

}
