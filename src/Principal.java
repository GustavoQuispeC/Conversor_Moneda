

import com.conversormoneda.services.Convert;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Convert convert = new Convert();
        boolean salir = false;

        while (!salir) {
            System.out.println("*********************************************");
            System.out.println("Sea Bienvenido al Conversor de Monedas =]");
            System.out.println("1) Dólar => Peso Argentino");
            System.out.println("2) Peso Argentino => Dólar");
            System.out.println("3) Dólar => Real Brasileño");
            System.out.println("4) Real Brasileño => Dólar");
            System.out.println("5) Dólar => Peso Colombiano");
            System.out.println("6) Peso Colombiano => Dólar");
            System.out.println("7) Salir");
            System.out.println("*********************************************");
            System.out.print("Seleccione una opción válida: ");

            int opcion;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
                continue;
            }

            if (opcion == 7) {
                salir = true;
                System.out.println("Gracias por usar el conversor. ¡Hasta pronto!");
                break;
            }

            String moneda1 = "";
            String moneda2 = "";

            switch (opcion) {
                case 1 -> {
                    moneda1 = "USD";
                    moneda2 = "ARS";
                }
                case 2 -> {
                    moneda1 = "ARS";
                    moneda2 = "USD";
                }
                case 3 -> {
                    moneda1 = "USD";
                    moneda2 = "BRL";
                }
                case 4 -> {
                    moneda1 = "BRL";
                    moneda2 = "USD";
                }
                case 5 -> {
                    moneda1 = "USD";
                    moneda2 = "COP";
                }
                case 6 -> {
                    moneda1 = "COP";
                    moneda2 = "USD";
                }
                default -> {
                    System.out.println("Opción inválida. Intente de nuevo.");
                    continue;
                }
            }

            System.out.print("Ingrese el monto a convertir: ");
            double monto;
            try {
                monto = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un monto válido.");
                continue;
            }

            try {
                double resultado = convert.convert(moneda1, moneda2, monto);
                System.out.printf("El valor de %.2f %s corresponde a: %.2f %s%n", monto, moneda1, resultado, moneda2);
            } catch (Exception e) {
                System.out.println("Error al realizar la conversión: " + e.getMessage());
            }

            System.out.println();
        }

        scanner.close();
    }
}
