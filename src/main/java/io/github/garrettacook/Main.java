package io.github.garrettacook;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ObjectMapper mapper = new ObjectMapper();

        try (InputStream inputStream = Main.class.getResourceAsStream("/test.json")) {

            JsonNode node = mapper.readTree(inputStream);
            System.out.println(node);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}