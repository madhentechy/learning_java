import java.util.Scanner;

class Addnum {
    public static void main(String args[]){
    Scanner Sc = new Scanner(System.in);
    System.out.print("Enter your two numbers");
    int a = Sc.nextInt();
    int b = Sc.nextInt();
    int c = Sc.nextInt();
    int d = Sc.nextInt();
    int e = a+b+c+d;
    System.out.print("Total is:"+e);
    }

}
