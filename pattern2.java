import java.util.Scanner;

public static void sumOfOddNumber(int n){
    int m;
    for(m=1; m<=n; m+=2){
        System.out.println(m);
    }
}


public class pattern2 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        sumOfOddNumber(n);

        // System.out.print("Enter Number : ");
        // int num1 = num.nextInt();
        // System.out.print("Enter Number : ");
        // int num2 = num.nextInt();
        // System.out.print("Enter Number : ");
        // int num3 = num.nextInt();
        // System.out.print("The Average of the number is ");
        // System.out.println((num1+num2+num3)/3);        

    }
}
