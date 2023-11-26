package web;
import entities.Compte;
import entities.EtatCompte;
import entities.TypeCompte;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import repositories.CompteRepository;
import java.util.Date;
@SpringBootApplication
@EnableJpaRepositories(basePackages = "repositories") // Active la configuration des dépôts JPA
@EntityScan(basePackages = "entities") // Active la recherche des entités JPA
public class AfraLsi3SoaTp6Application {

	public static void main(String[] args) {
		SpringApplication.run(AfraLsi3SoaTp6Application.class, args);
	}
      @Bean
       public CommandLineRunner start(CompteRepository compteRepository){

		return args -> {
			compteRepository.save(new Compte(null, 2000, new Date(), TypeCompte.COURANT, EtatCompte.ACTIVE));
			compteRepository.save(new Compte(null, 20000, new Date(), TypeCompte.EPARGNE, EtatCompte.ACTIVE));
			compteRepository.save(new Compte(null, 200000, new Date(), TypeCompte.COURANT, EtatCompte.ACTIVE));

			compteRepository.findAll().forEach(c->{c.getSolde();});

		};
	}
}
