package com.contacts.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.contacts.demo.Bean.ContactBean;
import com.contacts.demo.DAO.ContactsDAO;

@Controller
public class ContactsController {
	
	private static final String LIST_NOT_LOADED = "Sorry, could not load the contacts";
	
	@Autowired
	private ContactsDAO contactsDAO;
	
	@RequestMapping(value="home")
	public String home(ModelMap model) {
		
		ContactBean bean = new ContactBean();
		bean.setName("JIANNY");
		contactsDAO.save(bean);
		try {
			List<ContactBean> contacts = contactsDAO.findAll();
		} catch(Exception e) {
			System.out.println(e);
			model.addAttribute("message", LIST_NOT_LOADED);
		}
		return "home";
	}
	
//	@RequestMapping(value="add")
	
	

}
