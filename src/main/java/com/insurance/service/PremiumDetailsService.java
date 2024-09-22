package com.insurance.service;

import java.util.List;

import com.insurance.model.PremiumDetails;

public interface PremiumDetailsService {

	public PremiumDetails savePremium(PremiumDetails premiumDetails);

	public PremiumDetails UpdatePremium(PremiumDetails premiumDetails);

	public PremiumDetails getPremiumDetailsById(Integer id);

	public List<PremiumDetails> getAllPremiumList(PremiumDetailsService premiumDetailsService);

	public String deletePremiumById(Integer id);
}
