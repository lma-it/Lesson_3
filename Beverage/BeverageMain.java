package Beverage;
import static print_module.print_library.println;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import Workers.*;
// import java.util.Iterator;

public class BeverageMain {
    public static void main(String[] args) {
        println("Hello");

        Coffee latte = new Coffee();
        latte.addComponent(new Water("Вода"));
        latte.addComponent(new Beans("Зерна"));
        latte.addComponent(new Milk("Молоко"));


        // Абстрактный класс Beverage имплементирован от Iterable и теперь не работает запись ниже, хотя когда был имплементирован от Iterator, то все работало юез проблем.
        // Iterator<Ingridient> iterator = latte;
        // while(iterator.hasNext()){
        //     println(iterator.next());
        // }

        // После того как Beverage имплементирован от Iterable и теперь код ниже работает как положено.
        for (var ingridient : latte) {
            println(ingridient);
        }
        
        Random rand = new Random();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            numbers.add(rand.nextInt(1, 20));
        }

        println(numbers);
        Collections.sort(numbers);
        println(numbers);



    }
}
