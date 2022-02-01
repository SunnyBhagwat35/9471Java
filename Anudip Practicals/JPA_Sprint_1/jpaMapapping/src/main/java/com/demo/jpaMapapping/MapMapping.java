package com.demo.jpaMapapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.jpaMapMapping.entity.Address;
import com.demo.jpaMapMapping.entity.Employee;

public class MapMapping {
    public static void main( String[] args ){
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("collection_type");  
	    EntityManager em=emf.createEntityManager();  
	    em.getTransaction().begin();  
	    
	   Address address =new Address(400605, "Nashik", "Maharashtra");
	   Employee e = new Employee("Sam");
	   e.getAddress().put(1, address);
	   
	   Address a1 =new Address(400401, "Pune", "Maharashtra");   
	   Employee e1= new Employee("Jayesh");
	   e1.getAddress().put(2, a1);
	   
	   Address a2 =new Address(403331, "Pune", "Maharashtra");
	   Employee e2 = new Employee("Virat");
	   e2.getAddress().put(3, a2);
//	   e2.getAddress().
	   
	   
	   
	    em.persist(e);
		em.persist(e1);  
		em.persist(e2);  	      
		em.getTransaction().commit();  
		  
		em.close();  
		emf.close();
    }
}