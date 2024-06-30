import static print_module.print_library.println;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Intro_To_Basics
 */
public class Intro_To_Basics {

    public static void main(String[] args) {
        
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
    }
}