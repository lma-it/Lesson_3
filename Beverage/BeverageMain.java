package Beverage;
import static print_module.print_library.println;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
// import java.util.Iterator;

public class BeverageMain {
    public static void main(String[] args) {
        println("Hello");

        Coffee latte = new Coffee();
        latte.addComponent(new Water("Вода"));
        latte.addComponent(new Beans("Зерна"));
        latte.addComponent(new Milk("Молоко"));
        latte.addComponent(new Milk("Молоко1"));


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

        // Пример сортировки с помощью лямбда выражения, которое сортирует список по четности и нечетности, и все четные и нечетные числа выводит в порядке возрастания-0ф Э
        
        println(numbers);
        // numbers.sort((x, y) -> x % 2);
        numbers.sort((x, y) -> {
            if (x % 2 == y % 2) {
                // Если оба числа четные или оба нечетные, сравниваем их напрямую
                return Integer.compare(x, y);
            } else {
                // Если одно число четное, а другое нечетное, сначала четное, затем нечетное
                return Integer.compare(x % 2, y % 2);
            }
        });
        
        println(numbers);

        List<? super Beverage> list = new ArrayList<>();


    }
}
