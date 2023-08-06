// 1. Write a program for Method Overloading

public class MethodOverloading {
    int a ;
    int b ;

    void sub () {
        a = 10;
        b = 5;
        System.out.println(a-b);
    }
    void sub(int x,int y){
    this.a = x ;
    this.b = y;
    System.out.println(a-b);
    }

    void sub (int x,double y ,double z) {
        System.out.println(x-y-z);
    }

    public static void main(String[] args) {

        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.sub();
        methodOverloading.sub(50,40);
        methodOverloading.sub(10,2,2.5);
    }

}
