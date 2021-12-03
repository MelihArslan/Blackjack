package nl.meliharslan.ewa.database;

import nl.meliharslan.ewa.database.service.BlckJGameService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseApplication implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(DatabaseApplication.class);
    @Autowired
    BlckJGameService service;

    public static void main(String[] args) {
        SpringApplication.run(DatabaseApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

    }
}

