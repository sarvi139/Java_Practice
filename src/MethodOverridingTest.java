//2. Write a program for Method Overriding

public class MethodOverridingTest {
    public static void main(String[] args) {
        School st1 = new School() ;
        School st2 = new College();

        st1.currentStatus();
        st2.currentStatus();
    }
}
