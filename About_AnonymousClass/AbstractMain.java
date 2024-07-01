package About_AnonymousClass;
import static print_module.print_library.println;

public class AbstractMain implements MyInterface{
    public static void main(String[] args) {

        AbstractMain abstractMain = new AbstractMain();

        var myMar = abstractMain.abstractFoo();
        myMar.setValue(19);
        myMar.setName("My Name");
        println(myMar.getValue());
        println(myMar.getName());
    }

    @Override
    public MyAbstract abstractFoo() {

        MyAbstract myAbstract = new MyAbstract() {

            int value;
            String name;
            
            @Override
            public int getValue() {
                return value;
            }

            @Override
            public void setValue(int value) {
                this.value = value;
            }

            @Override
            public void setName(String name) {
                this.name = name;
            }

            @Override
            public String getName() {
                return name;
            }
        };
        return myAbstract;
    }

    {
        // MyAbstract myAbstract = new MyAbstract() {
        //     int value;
        //     String name;
        //     @Override
        //     public int getValue() {
        //         return value;
        //     }

        //     @Override
        //     public void setValue(int value) {
        //         this.value = value;
        //     }

        //     @Override
        //     public void setName(String name) {
        //         this.name = name;
        //     }

        //     @Override
        //     public String getName() {
        //         return name;
        //     }
        // };
    }
}
