//take two input from user and find larger from them

import java.util.Scanner;

public class FindLarger {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        if(num > num1){
            System.out.println("num is greater");
        } else {
            System.out.println("num1 is greater");
        }
    }
}
