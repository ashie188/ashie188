import java.util.Scanner;

public class oldcalci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Square Root");
            System.out.println("7. Sine");
            System.out.println("8. Cosine");
            System.out.println("9. Tangent");
            System.out.println("10. Arc Sine");
            System.out.println("11. Arc Cosine");
            System.out.println("12. Arc Tangent");
            System.out.println("13. Logarithm (base 10)");
            System.out.println("14. Factorial");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            double result = 0;

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    result = num1 + num2;
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    break;
                case 4:
                    System.out.print("Enter dividend: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter divisor: ");
                    num2 = scanner.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Error! Division by zero.");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                case 5:
                    System.out.print("Enter base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    num2 = scanner.nextDouble();
                    result = Math.pow(num1, num2);
                    break;
                case 6:
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble();
                    if (num1 < 0) {
                        System.out.println("Error! Cannot calculate square root of a negative number.");
                        continue;
                    }
                    result = Math.sqrt(num1);
                    break;
                case 7:
                    system.out,print("enter the angle in radian");
                    num1 = scanner.nextdouble();
                    result = math.sin(num1);
                case 8:
                     system.out.print("enter the angle in radians");
                     num 1= scanner.nextdouble();
                     result = math.cos(num1);
                case 9:
                sysytem.out,print("enter the ")
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
                    continue;
            }

            System.out.println("Result: " + result);
        }
    }
}
