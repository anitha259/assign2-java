import java.util.Scanner;

public class sumofnumbers2 {
  public static void main(String[] args) {
    int x, y, sum;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number:");
    x = sc.nextInt();
    System.out.print("Enter the second number:");
    y = sc.nextInt();
    sum = sum(x, y);
    System.out.println("the sum of number x and y is:" + sum);
  }

  public static int sum(int a, int b) {
    int sum = a + b;
    return sum;
  }

}
