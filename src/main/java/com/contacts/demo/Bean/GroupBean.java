package com.contacts.demo.Bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class GroupBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long groupId;
	
	private List<Long>usersIds;
}