import java.util.Scanner;

class Grade{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your grade:");
        int a = Sc.nextInt();
        if (a<0){
            System.out.print("Invalid input");
        }
        else{
            if (a>90){
                System.out.print("GRADE:0");
            }
            else if(a>=80&&a<90 ){
                System.out.print("GRADE:A");
            }
            else if(a>=70&&a<80){
                System.out.print("GRADE:B");
            }else if(a>=60&&a<70 ){
                System.out.print("GRADE:C");
            }
            else if(a>=50&&a<60){
                System.out.print("GRADE:D");
            }
            else if(a>=40&&a<50){
                System.out.print("GRADE:E");
            }
            else if(a<40){
                System.out.print("FAIL");
            }
        }
    }
}

