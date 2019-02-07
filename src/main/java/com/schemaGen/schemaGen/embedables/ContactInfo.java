package com.schemaGen.schemaGen.embedables;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class ContactInfo {
	
	@Column(name = "firstName", columnDefinition="VARCHAR(20)")
	private String firstName;
	 
	@Column(name = "middleName", columnDefinition="TEXT")
	private String middleName;
	
	@Column(name = "lastName", columnDefinition="VARCHAR(255)")
	private String lastName;
}
