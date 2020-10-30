package com.contacts.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contacts.demo.Bean.ContactBean;


public interface ContactsDAO extends JpaRepository<ContactBean, Long>{
//
//	List<ContactBean> findByName (String name); 
//	List<ContactBean> findByEmail (String email); 
//	List<ContactBean> findByPhoneNum (String phoneNum); 
//	List<ContactBean> findByCompany (String company);
	
}
