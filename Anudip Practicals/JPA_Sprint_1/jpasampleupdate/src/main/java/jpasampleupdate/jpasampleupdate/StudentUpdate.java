package jpasampleupdate.jpasampleupdate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpasampleupdate.jpasampleupdate.entity.StudentEntity;

public class StudentUpdate {
    public static void main( String[] args ){
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");  
	        EntityManager em = emf.createEntityManager();  
	          
	        em.getTransaction().begin();
	    		      
	        StudentEntity s = em.find(StudentEntity.class,101);  
            System.out.println("Before Updation");  
	        System.out.println("Student id = "+s.getS_id());  
	        System.out.println("Student Name = "+s.getS_name());  
	        System.out.println("Student Age = "+s.getS_age()); 
	        System.out.println("-------------------------------");
	          
	        s.setS_age(22);  
          
	        System.out.println("After Updation");  
            System.out.println("Student id = "+s.getS_id());  
            System.out.println("Student Name = "+s.getS_name());  
	        System.out.println("Student Age = "+s.getS_age());  
    }   
	    	
}