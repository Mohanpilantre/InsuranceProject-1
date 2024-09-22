package com.insurance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Policy;
import com.insurance.repository.PolicyRepository;
import com.insurance.service.PolicyService;

@Service
public class PolicyServiceImpl implements PolicyService {

	@Autowired
	PolicyRepository policyRepository;

	@Override
	public Policy savePolicy(Policy policy) {
		Policy pol = policyRepository.save(policy);
		return pol;
	}

	@Override
	public Policy updatePolicy(Policy policy) {
		Policy po = policyRepository.save(policy);
		return po;
	}

	@Override
	public List<Policy> getAllPolicy(Policy policy) {
		List<Policy> list = policyRepository.findAll();
		return list;
	}

	@Override
	public Policy getPolicyById(Integer id) {
		Policy policy = policyRepository.findPolicyById(id);
		return policy;
	}

	@Override
	public String deletePolicyById(Integer id) {
		policyRepository.deleteById(id);
		return "Policy Deleted Successfully....";
	}

}
