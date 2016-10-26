package com.wifiwireless.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.wifiwireless.interfaces.CustomerDaoInterface;
import com.wifiwireless.model.CustomerDetails;
import com.wifiwireless.model.MessageReciepts;
import com.wifiwireless.model.NumberDetails;

@Stateless
public class CustomerDao extends WifiDao implements Serializable,CustomerDaoInterface {
	
	EntityManager em = null;

	/**
	 * Default constructor.
	 */
	public String checkNumber(String extension,String secret) {
		em = getEm();
		//System.out.println("Username"+username+"   Password"+Passkey);
		try {

			String qlString = "SELECT number FROM CustomerDetails number  "
					+ "WHERE  number.extension=:extension and number.secret=:secret";

			TypedQuery<CustomerDetails> query = em.createQuery(qlString,
					CustomerDetails.class);

			query.setParameter("extension", extension);
			query.setParameter("secret", secret);
			if (query.getResultList().size() > 0){
				
				return "exist";
			}
				else{
					
					return "";
				}
			// if(query.getResultList()!=null && query.getResultList().size()>0)
			}
			
		 catch (Exception exception) {
			 exception.printStackTrace();
			System.out.println(exception);
			//LOG.error(exception);
		} finally {

			em.close();
		}
		return "";

	}
	public void addCustomer(ArrayList<CustomerDetails> customer) {
		em = getEm();

		try {
			em.getTransaction().begin();
			for(CustomerDetails cus:customer)
			{
				em.persist(cus);
			}
			
			em.getTransaction().commit();
		} catch (Exception exception) {
			exception.printStackTrace();
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
			

		} finally {

			em.close();
		}

	}
	public void updateCustomer(ArrayList<CustomerDetails> customer) {
		em = getEm();

		try {
			
			em.getTransaction().begin();
			for(CustomerDetails cus:customer)
			em.merge(cus);
			em.getTransaction().commit();
		
		} catch (Exception exception) {
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
			//LOG.error(exception.getMessage());

		} finally {

			em.close();
		}

	}
	
	public void updateCustomer(CustomerDetails customer) {
		em = getEm();

		try {
			
			em.getTransaction().begin();
			em.merge(customer);
			em.getTransaction().commit();
		
		} catch (Exception exception) {
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
			//LOG.error(exception.getMessage());

		} finally {

			em.close();
		}

	}
	public List<CustomerDetails> getAllCustomers() {
		// TODO Auto-generated method stub
		em = getEm();
		List<CustomerDetails> customerDetailsList=null;
		
		String qlString = "SELECT customerDetails FROM CustomerDetails customerDetails";
			
        try{
        	TypedQuery<CustomerDetails> query = em.createQuery(qlString,CustomerDetails.class);
        	customerDetailsList = query.getResultList();
        
        }catch(Exception e){
        	e.printStackTrace();
        	System.out.println("Execption while retrieviing customers : "+e);
        }finally {
			em.close();
		}
	
		return customerDetailsList;
	}
	
	public CustomerDetails getCustomerDetailsByUsername(String username) {
		em = getEm();
		CustomerDetails customerDetails = null;
		try {

			String qlString = "SELECT number FROM CustomerDetails number  "
					+ "WHERE  number.extension=:extension";

			TypedQuery<CustomerDetails> query = em.createQuery(qlString,
					CustomerDetails.class);

			query.setParameter("extension", username);
			
			customerDetails = query.getSingleResult();
		
		}catch (Exception exception) {
			 exception.printStackTrace();
			System.out.println(exception);
			//LOG.error(exception);
		} finally {

			em.close();
		}
		return customerDetails;
	}
	
	
}
