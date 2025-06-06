package org.zzn.hospital;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;

@Component
public class DatabaseTestRunner implements CommandLineRunner {

    private final DataSource dataSource;

    public DatabaseTestRunner(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void run(String... args) {
        try (Connection connection = dataSource.getConnection()) {
            System.out.println("✅ Connexion à la base de données réussie !");
            System.out.println("URL: " + connection.getMetaData().getURL());
            System.out.println("Utilisateur: " + connection.getMetaData().getUserName());
        } catch (Exception e) {
            System.err.println("❌ Échec de la connexion à la base de données !");
            e.printStackTrace();
        }
    }
}

