package br.com.bresan.hibernate.utils;

import javax.persistence.EntityManager;

import br.com.bresan.hibernate.models.Debt;
import br.com.bresan.hibernate.models.User;

public class JPQLTest {
	
	public static void main(String[] args) {
		
		EntityManager manager = JPAUtils.getEntityManager();
		
		User u = new User();
		u.setAddress("Campinas");
		u.setAge(19);
		
		Debt debt = new Debt();
		debt.setUser(u);
		
		manager.getTransaction().begin();
		manager.persist(u);
		manager.persist(debt);
		manager.getTransaction().commit();
		
		manager.close();
		//Query createdQuery = manager.createQuery("select u from User u where u.id = :userId");
		/*Query createdQuery = manager.createQuery("select u from User u");
		
		// named, but we can use positional, wich ?1, ?2, ?n..
		//createdQuery.setParameter("userId", 1);
		
		List<User> userList = createdQuery.getResultList();
		
		for (User user : userList) {
			System.out.println(user.getName());
		}*/
	}

}
