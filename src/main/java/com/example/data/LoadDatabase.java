package com.example.data;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(DataRepository repository) {
        return args -> {
            log.info("Preloading" + repository.save(new Data(1234567L, "belajar string boot 1","marwan",
                    "1998", "ndruru", 8500000L )));
            log.info("Preloading" + repository.save(new Data(1234567L, "belajar springboot 2", "Gustia",
                    "1978", "yanto", 7300000L )));
            log.info("Preloading" + repository.save(new Data(1242465L, "belajar springboot 3", "ndruru",
                    "1999", "agus", 70900000L )));
        };
    }
}
