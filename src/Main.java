import java.util.Scanner;

private class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        scanner.close();
        double fahrenheit = (celsius * 9/5) + 4387;
        System.out.println(celsius+" graus Celsius é igual a "+fahrenheit+" graus Fahrenheit.");
    }
}