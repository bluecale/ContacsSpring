package com.contacts.demo.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class ContactBean {

	private String name;
	private String email;
	private String phoneNum;
	private String company;
	private String picPath;
	private String notes;
	
	private boolean fav;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
}
