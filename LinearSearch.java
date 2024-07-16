import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        var sc = new Scanner(System.in);
        System.out.println("Enter your elements you want in array");
        int noe = sc.nextInt();
        System.out.println("Enter your elements under: " + noe);

        for (int i = 0; i < noe; i++) {
            num.add(sc.nextInt());
        }
        System.out.print("Enter the target you wanna search: ");
        int target = sc.nextInt();

        int result = linearsearch(num, target);
        System.out.println(result);
    }

    static int linearsearch (ArrayList<Integer> num1,int target){

        if(num1.size() == 0){
            return -1;
        }

        for (int i = 0; i < num1.size(); i++) {
            if(num1.get(i) == target){
                return i;
            }
        }
        return -1;
        }
    }
