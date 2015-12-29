package br.com.bresan.hibernate.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtils {
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("usuariosmysql");
	
	public static EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
}
