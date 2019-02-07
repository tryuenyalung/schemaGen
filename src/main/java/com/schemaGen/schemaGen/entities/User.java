package com.schemaGen.schemaGen.entities;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.schemaGen.schemaGen.embedables.ContactInfo;

import lombok.Data;

@Data
@Table(name="userTable")
@Entity
public class User {

	@Id
	@Column(name = "id", columnDefinition="bigint", length=20)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Embedded
	private ContactInfo contact;

	
}
