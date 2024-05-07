import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int numeroSeleccionado;
        boolean cerrarBucle = false;
        String tipoMoneda;
        do {
            System.out.println(
                    """
                    ************************************************
                    Sea bienvenido/a al Conversor de Moneda =]
                    
                    1) Dólar =>> Peso argentino
                    2) Peso argentino =>> Dólar
                    3) Dólar =>> Real brasileño
                    4) Real brasileño =>> Dólar
                    5) Dólar =>> Peso colombiano
                    6) Peso colombiano =>> Dólar
                    7) Salir
                    
                    Elija una opción válida:
                    ************************************************
                    """);
            numeroSeleccionado = scanner.nextInt();
            if (numeroSeleccionado > 0 && numeroSeleccionado < 7) {
                switch(numeroSeleccionado) {
                    case 1:
                        tipoMoneda = "USD";
                        Api.convertidor(tipoMoneda, "ARS");
                        break;
                    case 2:
                        tipoMoneda = "ARS";
                        Api.convertidor(tipoMoneda, "USD");
                        break;
                    case 3:
                        tipoMoneda = "USD";
                        Api.convertidor(tipoMoneda, "BRL");
                        break;
                    case 4:
                        tipoMoneda = "BRL";
                        Api.convertidor(tipoMoneda, "USD");
                        break;
                    case 5:
                        tipoMoneda = "USD";
                        Api.convertidor(tipoMoneda, "COP");
                        break;
                    case 6:
                        tipoMoneda = "COP";
                        Api.convertidor(tipoMoneda, "USD");
                        break;
                    default:
                        System.out.println("Opción no reconocida");
                }
            } else if (numeroSeleccionado == 7) {
                System.out.println("Nos vemos luego!");
                cerrarBucle = true;
            } else {
                System.out.println("Oh! Hay un error. Intentalo de nuevo");
            }
        } while (cerrarBucle == false);
    }
}