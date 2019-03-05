package projet_collaboratif;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjetCollaboratifApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetCollaboratifApplication.class, args);
		
	}
	
//	@Bean
//    public EntityManager entityManagerFactory(){
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
//		EntityManager em = factory.createEntityManager();
//        return em;
//    }
}
