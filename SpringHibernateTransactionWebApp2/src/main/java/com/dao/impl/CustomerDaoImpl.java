package com.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.interf.CustomerDao;
import com.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	@Override
	public List<Customer> getCustomer() {
		Session session=sessionFactory.getCurrentSession();
		Query<Customer> query=session.createQuery("From Customer", Customer.class);
		return query.getResultList();
	}

	@Override
	public void saveCustomer(Customer customer) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);
	}


	@Override
	public Customer getCustomer(int id) {
		Session session=sessionFactory.getCurrentSession();
		Customer customer=session.get(Customer.class, id);
		return customer;
		
	}
	
	public void deleteCustomer(int id){
		Session session=sessionFactory.getCurrentSession();
		Query<Customer> query=session.createQuery("delete from Customer c where c.customerId =:id");
		query.setParameter("id", id);
		query.executeUpdate();
	}

	@Override
	public void updateCustomer(int id) {
		// TODO Auto-generated method stub
		
	}


}
