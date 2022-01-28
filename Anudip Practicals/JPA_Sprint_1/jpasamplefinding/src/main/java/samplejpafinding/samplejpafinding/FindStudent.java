package samplejpafinding.samplejpafinding;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import samplejpafinding.samplejpafinding.entity.StudentEntity;

public class FindStudent 
{
    public static void main( String[] args )
    {
    	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");  
	        EntityManager em=emf.createEntityManager();  
	          
	        em.getTransaction().begin(); 
	        StudentEntity s = em.find(StudentEntity.class,101);    
	                  
	        if(s != null) {
	        	System.out.println("Student id = "+s.getS_id());  
		        System.out.println("Student Name = "+s.getS_name());  
		        System.out.println("Student Age = "+s.getS_age()); 
	        }
	        else {
	        	System.out.println("------Not Found------");
	        }
	            
	        em.getTransaction().commit();  
	          
	        emf.close();  
	        em.close(); 
    }
}
