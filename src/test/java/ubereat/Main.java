package ubereat;

import java.text.SimpleDateFormat;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ubereat.config.AppConfig;
import ubereat.repository.IArticle;
import ubereat.repository.IClient;
import ubereat.repository.ICommande;
import ubereat.repository.ILivreur;
import ubereat.repository.IRestaurant;
import ubereat.repository.IRestaurateur;
import ubereat.repository.ITypePlat;
import ubereat.repository.ITypeResto;
import ubereat.repository.IUtilisateur;


public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext spring = new AnnotationConfigApplicationContext(AppConfig.class);


		IArticle articleRepo = spring.getBean(IArticle.class);
		IClient clientRepo = spring.getBean(IClient.class);
		ICommande commandeRepo = spring.getBean(ICommande.class);
		ILivreur livreurRepo = spring.getBean(ILivreur.class);
		IRestaurant restaurantRepo = spring.getBean(IRestaurant.class);
		IRestaurateur restaurateurRepo = spring.getBean(IRestaurateur.class);
		ITypePlat typePlatRepo = spring.getBean(ITypePlat.class);
		ITypeResto typeRestoRepo = spring.getBean(ITypeResto.class);
		IUtilisateur utilisateurRepo = spring.getBean(IUtilisateur.class);

		spring.close();
	}

}
