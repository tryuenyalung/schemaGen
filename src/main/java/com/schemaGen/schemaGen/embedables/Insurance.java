package com.schemaGen.schemaGen.embedables;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Insurance {

	@Column(name="bldgPg_ins_insurer")
	private Boolean insurer;
	
	@Column(name="bldgPg_ins_broker")
	private Boolean broker;
	
	@Column(name="bldgPg_ins_policyNumber")
	private Boolean policyNumber;
	
	@Column(name="bldgPg_ins_policyPremium")
	private Boolean policyPremium;
	
	@Column(name="bldgPg_ins_policyExpiry")
	private Boolean policyExpiry;
}
