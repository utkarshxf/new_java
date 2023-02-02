import java.util.Scanner;

public class que5 {
  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n=sc.nextInt();
        int temp = n;
        int p = 0;
        while (n > 0) {
 
            int rem = n % 10;
            p = (p) + (rem * rem * rem);
            n = n / 10;
        }

        if (temp == p) {
            System.out.println("Yes. It is Armstrong No.");
        }
        else {
            System.out.println("No. It is not an Armstrong No.");
          }
        }
}
