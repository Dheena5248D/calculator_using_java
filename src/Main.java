import java.util.Scanner;
public class Main {

    public static float  calculator(){
        float output = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("a calculator project using java");
        System.out.println("enter the 1st number");
        float n1 = scanner.nextFloat();
        System.out.println("enter the 2nd number");
        float n2 = scanner.nextFloat();
     System.out.println("enter the number for your operation you want to perform");
     System.out.println("1.addition 2.substraction 3.multiplication 4.division 5.modules");
     int operationInt = scanner.nextInt();

        output = switch (operationInt) {
            case 1 -> n1 + n2;
            case 2 -> n1 - n2;
            case 3 -> n1 * n2;
            case 4 -> n1 / n2;
            case 5 -> n1 % n2;
            default -> output;
        };
return output;
}
    public static void main(String[] args) {

float output =calculator();
System.out.println(output);
    }
}