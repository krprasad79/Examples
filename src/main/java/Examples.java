
 import java.util.Scanner;
import java.lang.Math;

public class Examples {
    private static int num;
    public boolean checkforPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the number to check for prime :");
        String in = scnr.nextLine();
        num = Integer.parseInt(in);
        Examples ex = new Examples();
        if(ex.checkforPrime(num)){
            System.out.println("Entered number is Prime");
        }
        else{
            System.out.println("Entered number is not Prime");
        }

    }
}
