package com.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MedicalInsurance {
	
	@Value("#{3}")
	private int insurancePolicyNumber;
	@Value("#{3000}")
	private int insuredAmount;
	@Value("#{7000}")
	private int bonusAmount;
	
	public MedicalInsurance() {
		System.out.println();
	}
	
	public int getInsurancePolicyNumber() {
		return insurancePolicyNumber;
	}
	public void setInsurancePolicyNumber(int insurancePolicyNumber) {
		this.insurancePolicyNumber = insurancePolicyNumber;
	}
	public int getInsuredAmount() {
		return insuredAmount;
	}
	public void setInsuredAmount(int insuredAmount) {
		this.insuredAmount = insuredAmount;
	}
	public int getBonusAmount() {
		return bonusAmount;
	}
	public void setBonusAmount(int bonusAmount) {
		this.bonusAmount = bonusAmount;
	}

	@Override
	public String toString() {
		return "MedicalInsurance [insurancePolicyNumber=" + insurancePolicyNumber + ", insuredAmount=" + insuredAmount
				+ ", bonusAmount=" + bonusAmount + "]";
	}
	
}
