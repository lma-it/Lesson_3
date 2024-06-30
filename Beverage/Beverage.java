package Beverage;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public abstract class Beverage implements Iterator<Ingridient>{

    List<Ingridient> components;
    int index;

    public Beverage() {
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(Ingridient component){
        components.add(component);
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Ingridient next() {
        return components.get(index++);
    }
}
