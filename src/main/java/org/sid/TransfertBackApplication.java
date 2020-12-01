package org.sid;

import org.sid.dao.EmetteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TransfertBackApplication implements CommandLineRunner {

    @Autowired
    EmetteurRepository emetteurRepository;

    public static void main(String[] args) {

    SpringApplication.run(TransfertBackApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       /*Client em = clientRepository.save(new Client("Mbow", "Cheikh", "772554433", "1234587"));
       Client re = clientRepository.save(new Client("Diop", "Mor", "773349843", null));
       envoieRepository.save(new Envoie(new Date(), 5000.0, em, re));*/
    }
}
