import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        int min;
        System.out.println("Enter num1");
        int n1 = scan.nextInt();
        min=n1;

        System.out.println("enter num2");
        int n2 = scan.nextInt();
        if(n1<min){
            min=n2;
        }

        System.out.println("Enter num3");
        int n3 = scan.nextInt();
        if(n3<min){
            min=n3;
        }
        System.out.println("Minimul number is " +min);
        scan.close();
    }
}
