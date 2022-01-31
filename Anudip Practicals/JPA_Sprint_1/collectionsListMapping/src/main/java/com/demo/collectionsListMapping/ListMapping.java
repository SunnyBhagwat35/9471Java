package com.demo.collectionsListMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.collectionsListMapping.entity.Address;
import com.demo.collectionsListMapping.entity.Employee;

public class ListMapping 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("collection_type");  
	    EntityManager em=emf.createEntityManager();  
	    em.getTransaction().begin();  
	    
	   Address address =new Address(400603, "Thane", "Maharashtra");
	   Employee e = new Employee("Sunny");
	   e.getAddress().add(address);
	   
	   Address a1 =new Address(400601, "Mumabai", "Maharashtra");   
	   Employee e1= new Employee("John");
	   e1.getAddress().add(a1);
	   
	   Address a2 =new Address(400001, "Colaba", "Maharashtra");
	   Employee e2 = new Employee("Sunny");
	   e2.getAddress().add(a2);
	   
	    em.persist(e);
		em.persist(e1);  
		em.persist(e2);  	      
		em.getTransaction().commit();  
		  
		em.close();  
		emf.close();
    }
}
