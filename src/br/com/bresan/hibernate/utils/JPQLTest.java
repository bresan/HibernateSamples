package br.com.bresan.hibernate.utils;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.bresan.hibernate.models.User;

public class JPQLTest {
	
	public static void main(String[] args) {
		
		EntityManager manager = JPAUtils.getEntityManager();
		Query createdQuery = manager.createQuery("select u from User u where u.id = :userId");
		
		createdQuery.setParameter("userId", 1);
		
		List<User> userList = createdQuery.getResultList();
		
		for (User user : userList) {
			System.out.println(user.getName());
		}
	}

}
