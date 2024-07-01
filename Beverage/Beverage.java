package Beverage;
import java.util.List;
import java.util.ArrayList;
// import java.util.Iterator;


public abstract class Beverage implements Iterable<Ingridient>{

    List<Ingridient> components;
    int index;

    public Beverage() {
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(Ingridient component){
        if(!(components.indexOf(component) != -1))
            components.add(component);
    }

    // Пример создания своего собственного итератора, в случае если класс имплементируется от Iterator, если от Iterable, то эти методы не нужны
    
    // @Override
    // public boolean hasNext() {
    //     return index < components.size();
    // }

    // @Override
    // public Ingridient next() {
    //     return components.get(index++);
    // }

    // abstract Iterator<Ingridient> iterator();
}
