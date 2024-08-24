//take two number from user as a input and add them

import java.util.Scanner;

public class AddNumbers {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        System.out.println("sum by adding two numbers :- " + (num + num1));
    }
}
