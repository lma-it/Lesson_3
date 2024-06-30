package Beverage;
public abstract class Ingridient {
    public String brand;

    public Ingridient(String brand){
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;
    }
}
