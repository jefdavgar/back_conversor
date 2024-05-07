import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Api {
    public static double convertidor(String tipoMoneda, String tipoMonedaCambio) throws IOException, InterruptedException {
        double valorMoneda = 0;
        Scanner scanner = new Scanner(System.in);

        // Construir la dirección URL basada en el tipo de moneda seleccionada
        String direccion = "https://v6.exchangerate-api.com/v6/7cbd61f1929ac8e596c48715/latest/" + tipoMoneda;

        // Crear un cliente HTTP y realizar la solicitud
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Ingrese el valor que desea convertir: ");
        valorMoneda = scanner.nextDouble();
        // Obtener la respuesta JSON de la API
        String json = response.body();
        Gson gson = new Gson();
        Modelo miModelo = gson.fromJson(json, Modelo.class);
        double finalConversion = miModelo.getValorMoneda(tipoMonedaCambio)*valorMoneda;
        System.out.println("El valor "+valorMoneda+" ["+tipoMoneda+"] corresponde al valor final de =>> "+finalConversion+" ["+tipoMonedaCambio+"]" );
        return 1.0;
    }
}

