import java.util.Scanner;

public class assignment1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = sc.nextInt();
        System.out.println("Enter 2st number:");
        int num2 = sc.nextInt();

        System.out.println("\n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Module \n6.Exist");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();

        int Ans;

        switch (choice) {
            case 1:
                System.out.println("sum of two number is:" + (num1 + num2));
                break;

            case 2:
                System.out.println("subtraction of two number is:" + (num1 - num2));
                break;

            case 3:
                System.out.println("multiplicatin of two number is:" + (num1 * num2));
                break;

            case 4:
                System.out.println("Division of two number is:" + (num1 / num2));
                break;

            case 5:
                System.out.println("module of two number is:" + (num1 % num2));
                break;

            default:
                System.out.println("Exist");

        }

    }
}