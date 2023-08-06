// 2. Write a program for Inheritance feature using Single Inheritance

public class InheritanceTest {
    public static void main(String[] args) {

        Bike bike = new Bike() ;

        bike.horn();
        bike.engine();
        System.out.println("Brand Name: " + bike.brand);
        System.out.println("Model Name: " + bike.model);

    }
}
