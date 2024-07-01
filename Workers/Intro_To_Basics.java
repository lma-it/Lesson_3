package Workers;
import static print_module.print_library.println;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Collections;

/**
 * Intro_To_Basics
 */
public class Intro_To_Basics {

    public static void main(String[] args) {
        /**
         * Реализация примера, в котором создается экземпляр foo абстрактного класса Foo и дальнейшее переопределение логики абстрактных методов m1 и m2.
         */
        Foo foo = new Foo() {

            @Override
            public void m1() {
                println("m1");
            }

            @Override
            public void m2() {
                println("m2");
            }
        };


        foo.m1();

        /**
         * Реализация примера, в котором создается экземпляр foo1 абстрактного класса Foo и дальнейшее переопределение логики абстрактных методов m1 и m2.
         */
        Foo foo1 = new Foo() {

            @Override
            public void m1() {
                println(">>>m1");
            }

            @Override
            public void m2() {
                println(">>>m2");
            }
        };

        foo1.m1();


        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(12);
        nums.add(123);
        nums.add(1234);
        nums.add(12345);

        Iterator<Integer> iter = nums.iterator();
        
        while (iter.hasNext()) {
            println(iter.next());
        }

        Worker worker = new Worker("Имя",
                                "Фамилия",
                                23,
                                4567);

        Iterator<String> components = worker;

        while(components.hasNext()){
            println(worker.next());
        }

        Random rand = new Random();

        List<Worker> bd = new ArrayList<>();
        for(int i = 0; i <  5; i++){
            bd.add(new Worker("Name_" + i, 
                              "LastName_" + i, 
                              rand.nextInt(18, 30), 
                              rand.nextInt(5000, 10000)));
        }

        println(bd);

        Collections.sort(bd);
        Collections.reverse(bd);
        println(bd);

        List<Worker> bd2 = new ArrayList<>();
        for(int i = 0; i <  5; i++){
            bd2.add(new Worker("Name_" + i, 
                              "LastName_" + i, 
                              rand.nextInt(18, 30), 
                              rand.nextInt(5000, 10000)));
        }

        println("Ниже применение SalaryComparator к нашему списку <Worker>: ");

        println(bd2);
        bd2.sort(new SalaryComparator());
        println(bd2);

        // Сортировка с использование лямбда выражения в качестве агрумента Comparator для метода sort(Comparator<? super Worker> c)
        // bd.sort((w1, w2) -> Integer.compare(w1.age, w2.age));

        // Сортировка с использование лямбда выражения в качестве агрумента Comparator для метода sort(Comparator<? super Worker> c)
        bd.sort((w1, w2) -> Integer.compare(w1.salary, w2.salary));
        println("Отсортированный bd с помощью лямбда (w1, w2) -> Integer.compare(w1.age, w2.age) выражения, которое сортирует по зарплате");
        println(bd);

    }
}