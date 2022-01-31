package com.demo.jpaSetMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.jpaSetMapping.entity.Address;
import com.demo.jpaSetMapping.entity.Employee;

public class SetMapping 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("collection_type");  
	    EntityManager em=emf.createEntityManager();  
	    em.getTransaction().begin();  
	    
	   Address address =new Address(400605, "Nashik", "Maharashtra");
	   Employee e = new Employee("Sam");
	   e.getAddress().add(address);
	   
	   Address a1 =new Address(400401, "Pune", "Maharashtra");   
	   Employee e1= new Employee("Jayesh");
	   e1.getAddress().add(a1);
	   
	   Address a2 =new Address(403331, "Pune", "Maharashtra");
	   Employee e2 = new Employee("Virat");
	   e2.getAddress().add(a2);
	   
	    em.persist(e);
		em.persist(e1);  
		em.persist(e2);  	      
		em.getTransaction().commit();  
		  
		em.close();  
		emf.close();
    }
}