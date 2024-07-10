import java.util.Scanner;

class Factorial{
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int i = 1;
        System.out.print("Enter the number for factorial: ");
        int n = Sc.nextInt();
        if (n == 1 || n == 0) {
            System.out.print("Your factorial is 1 ");
        }
        else{
            int fact = 1;
            while (i <= n) {
                fact = fact * i;
                i = i + 1;
            }
            System.out.print("Factorial of "+n+" is "+fact);
        }
    }
}
