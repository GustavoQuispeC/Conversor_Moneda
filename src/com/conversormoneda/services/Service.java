package com.conversormoneda.services;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Service {
    private final String apiKey = "944831ecce805d2e861606d2";

    public double getExchangeRate(String fromCurrency, String toCurrency) throws Exception {
        String apiUrl = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + fromCurrency + "/" + toCurrency;

        // Crear cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        // Crear solicitud HTTP
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .GET()
                .build();

        // Enviar solicitud y obtener respuesta
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Verificar el estado de la respuesta
        if (response.statusCode() != 200) {
            throw new Exception("Error al conectarse a la API. Código: " + response.statusCode());
        }

        // Analizar el JSON de la respuesta
        JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();
        if (!jsonResponse.has("conversion_rate")) {
            throw new Exception("La respuesta de la API no contiene la tasa de conversión.");
        }

        return jsonResponse.get("conversion_rate").getAsDouble();
    }
}
