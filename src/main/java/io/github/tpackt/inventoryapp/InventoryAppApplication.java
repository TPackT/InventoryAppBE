package io.github.tpackt.inventoryapp;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventoryAppApplication {

    public static void main(String[] args) {

        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
        String dbUrl = dotenv.get("DB_URL");
        String dbUser = dotenv.get("DB_USERNAME");
        String dbPass = dotenv.get("DB_PASSWORD");

        System.setProperty("DB_URL", dbUrl);
        System.setProperty("DB_USERNAME", dbUser);
        System.setProperty("DB_PASSWORD", dbPass);

        SpringApplication.run(InventoryAppApplication.class, args);
    }

}
