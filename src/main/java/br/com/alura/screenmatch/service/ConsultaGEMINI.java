package br.com.alura.screenmatch.service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

public class ConsultaGEMINI {
    public static String obterTraducao(String texto) {
        // The client gets the API key from the environment variable `GEMINI_API_KEY`.
        // O cliente obtém a chave da API através da variável de ambiente `GEMINI_API_KEY`.
        Client client = Client.builder().apiKey(System.getenv("GEMINI_API_KEY")).build();

        GenerateContentResponse response =
                client.models.generateContent(
                        "gemini-2.5-flash",
                        "Retorne o seguinte texto traduzido para português brasileiro: " + texto,
                        null);

        return response.text();
    }
}
