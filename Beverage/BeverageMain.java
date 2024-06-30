package Beverage;
import static print_module.print_library.println;
import java.util.Iterator;

public class BeverageMain {
    public static void main(String[] args) {
        println("Hello");

        Beverage latte = new Coffee();
        latte.addComponent(new Water("Вода"));
        latte.addComponent(new Beans("Зерна"));
        latte.addComponent(new Milk("Молоко"));


        Iterator<Ingridient> iterator = latte;
        while(iterator.hasNext()){
            println(iterator.next());
        }

    }
}
