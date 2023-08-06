/*
Write a program to print City named Dhaka where cities are Dhaka, USA, Canada,
Barisal (use if -else if statement)
 */

public class IfElse {

    public static void main(String[] args){

        String city = "D" ;

        if (city == "D"){
            System.out.println("Dhaka");
        }
        else if (city == "C"){
            System.out.println("Canada");
        }
        else if (city == "U"){
            System.out.println("USA");
        }
        else if(city == "B"){
            System.out.println("Barisal");
        }
        else {
            System.out.println("Another city");
        }
    }
}
