package Workers;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Worker>{

    @Override
    public int compare(Worker o1, Worker o2) {
        // return Integer.compare(o1.salary, o2.salary); // Здесь сортировка идет от меньшего к большему.
        return Integer.compare(o1.salary, o2.salary) * -1; // Если добавить * -1, то сортровка будет от большего к меньшему
    }
    
}
