import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numm2 = scanner.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        scanner.close();
        double result;

        switch(operator) {
            case '+':
                result = num1 + numm2;
                break;
            default:
                System.out.println("Operaçaão válida.");
                return;
        }

        System.out.println(num1+" "+operator+" "+numm2+": "+result);
    }
}