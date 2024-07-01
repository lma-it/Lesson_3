package Beverage;
import java.util.Iterator;


public class Coffee extends Beverage{

    
    @Override
    public Iterator<Ingridient> iterator() {

        Iterator<Ingridient> it = new Iterator<Ingridient>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Ingridient next() {
                return components.get(index++);
            }
        };

        return it;
    }
}
