import java.util.Scanner;


public class que6 {
  public static void main(String[] args) {
    int intArray[];
    intArray = new int[5];
    double avg = 0;
    Scanner sc = new Scanner(System.in);
    for (int i = 0;i<5;i++) {
      int b = i+1;
      System.out.print("enter the num of "+ b  + " subject: ");
      intArray[i] = sc.nextInt();
    }

     int high=intArray[0];
       for(int i=0;i<5;i++)
       {
        avg=avg+intArray[0];
        if(high<intArray[i])
        high=intArray[i];
       }
       avg=avg/5.0;
       System.out.println("average marks is"+avg);
       System.out.println("highest marks is"+high);
       }

  }


