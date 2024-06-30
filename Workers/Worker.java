package Workers;
import java.util.Iterator;

public class Worker implements Comparable<Worker>, Iterator<String>{
    protected String name;
    protected String lastName;
    protected int age;
    protected int salary;

    public Worker(String name, String lastName, int age, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String fullName(){
        return String.format("%s %s", name, lastName);
    }

    int index;


    // Данная реализация необходима для испоьзования интерфейса Iterator в пользовательском классе.
    // Для этого мы переопределяем необходимые методы и реализуем их логику в соответствии с нашим пользовательским классом.
    @Override
    public boolean hasNext() {
        return index++ < 4;
    }

    @Override
    public String next() {
        switch (index) {
            case 1:
                return String.format("Name: %s", name);
            case 2:
                return String.format("lastName: %s", lastName);
            case 3:
                return String.format("age: %d", age);
            default:
                return String.format("salary: %d", salary);
        }
    }

    @Override
    public int compareTo(Worker o) {

        // Пример записи ветвления без использования фигурных скобок.

        if (this.age > o.age)
            return 1;
        else if (this.age < o.age)
            return -1;
        else
            return 0;

    }

    @Override
    public String toString() {
        return String.format("%s %s age: %d salary: %d", name, lastName, age, salary);
    }
}
