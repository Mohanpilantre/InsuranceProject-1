package com.insurance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.PremiumDetails;
import com.insurance.repository.PremiumDetailsRepository;
import com.insurance.service.PremiumDetailsService;

@Service
public class PremiumDetailsServiceImpl implements PremiumDetailsService {

	@Autowired
	PremiumDetailsRepository premiumDetailsRepository;

	@Override
	public PremiumDetails savePremium(PremiumDetails premiumDetails) {
		PremiumDetails pDetails = premiumDetailsRepository.save(premiumDetails);
		return pDetails;
	}

	@Override
	public PremiumDetails UpdatePremium(PremiumDetails premiumDetails) {
		PremiumDetails pDetails = premiumDetailsRepository.save(premiumDetails);
		return pDetails;
	}

	@Override
	public PremiumDetails getPremiumDetailsById(Integer id) {
		PremiumDetails premiumDetails = premiumDetailsRepository.findPremiumDetailsById(id);
		return premiumDetails;
	}

	@Override
	public List<PremiumDetails> getAllPremiumList(PremiumDetailsService premiumDetailsService) {
		List<PremiumDetails> list = premiumDetailsRepository.findAll();
		return list;
	}

	@Override
	public String deletePremiumById(Integer id) {
		premiumDetailsRepository.deleteById(id);
		return "Premium card deleted successfully..";
	}

}
