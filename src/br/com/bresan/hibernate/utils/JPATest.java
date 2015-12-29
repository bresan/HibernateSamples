package br.com.bresan.hibernate.utils;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.bresan.hibernate.models.Debt;
import br.com.bresan.hibernate.models.TypeCash;
import br.com.bresan.hibernate.models.User;

public class JPATest {

	public static void main(String[] args) {
		
		User user = new User();
		/*user.setName("Rodrigo Vicente");
		user.setAge(19);
		user.setAddress("Campinas, SP");
		user.setEmail("bresan@mail.com");*/
		
		EntityManager entityManager = JPAUtils.getEntityManager();
		
		entityManager.getTransaction().begin();
		
		user = entityManager.find(User.class, 1);
		
		Debt debt = new Debt();
		debt.setDescription("Debt description");
		debt.setTypeCash(TypeCash.CREDIT_CARD);
		debt.setUser(user);
		debt.setValue(new BigDecimal("10.2"));
		
		entityManager.persist(debt);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
	}
}
