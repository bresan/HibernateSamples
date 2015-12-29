package br.com.bresan.hibernate.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.bresan.hibernate.models.User;

public class JPATest {

	public static void main(String[] args) {
		
		User user = new User();
		user.setName("Rodrigo Vicente");
		user.setAge(19);
		user.setAddress("Campinas, SP");
		user.setEmail("bresan@mail.com");
		
		EntityManager entityManager = JPAUtils.getEntityManager();
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(user);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
	}
}
