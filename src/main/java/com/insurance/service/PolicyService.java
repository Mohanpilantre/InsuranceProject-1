package com.insurance.service;

import java.util.List;

import com.insurance.model.Policy;

public interface PolicyService {

	public Policy savePolicy(Policy policy);

	public Policy updatePolicy(Policy policy);

	public List<Policy> getAllPolicy(Policy policy);

	public Policy getPolicyById(Integer id);

	public String deletePolicyById(Integer id);

}
