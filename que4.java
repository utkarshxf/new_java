import java.util.Scanner;
public class que4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the value of n : ");
    int n = sc.nextInt();
    int sum = 0;
    for (int i = 0; i <= n; i++) {

      if (i % 3 == 0) {
        sum = sum + i;
      }

    }
    System.out.print("" + sum);
  }
}
