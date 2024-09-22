package com.insurance.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "policy")
public class Policy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="policy_id")
	private int id;
	private String policyType;

//	@ManyToOne
//	@JoinColumn(name = "userId", insertable = false, updatable = false)
	private Integer userId;

//	@OneToMany(cascade = CascadeType.ALL)
//	private List<PremiumDetails> premiumDetailsList;

	@OneToOne(targetEntity = PremiumDetails.class, cascade = CascadeType.ALL)
	private PremiumDetails premiumDetailsList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public PremiumDetails getPremiumDetailsList() {
		return premiumDetailsList;
	}

	public void setPremiumDetailsList(PremiumDetails premiumDetailsList) {
		this.premiumDetailsList = premiumDetailsList;
	}

}
