package br.com.bresan.hibernate.models;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPATest {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("usuariosmysql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		User user = new User();
		user.setName("Rodrigo Bresan");
		user.setAge(19);
		user.setAddress("Campinas, SP");
		user.setEmail("bresan@mail.com");
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(user);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
	}
}
