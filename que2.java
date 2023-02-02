

import java.util.Scanner;

public class que2 {

  private static Scanner sc;

  public static void main(String[] args) {

    sc = new Scanner(System.in);

    System.out.print("Please Enter Any Number to find Square Root = ");
    double num = sc.nextDouble();

    double temp, squareroot;

    squareroot = num / 2;

    do {
      temp = squareroot;
      squareroot = (temp + (num / temp)) / 2;
    } while ((temp - squareroot) != 0);

    System.out.println("\nThe Square Root of a Number without sqrt = " + squareroot);
  }
}
