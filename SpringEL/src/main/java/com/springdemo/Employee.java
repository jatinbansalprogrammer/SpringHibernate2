package com.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("1")
	private int id;
	@Value("Priya")
	private String name;
	@Value("#{T(com.springdemo.Address).state}")
	private String empState;
	@Value("#{address}")
	private Address Address;
	@Value("#{T(com.springdemo.Address).getFAddress()}")
	private String fullAddress;
	@Value("#{T(com.springdemo.Address).state=='Odisha'?true:false}")
	private boolean SouthIndian;
	@Value("#{medicalInsurance.insuredAmount == 10000}")
	private boolean insuranceAmountEqualto10000;
	@Value("#{medicalInsurance.insuredAmount != 10000}")
	private boolean insuranceAmountNotequalto10000;
	@Value("#{medicalInsurance.insuredAmount lt 10000}")
	private boolean insuranceAmountlessthan10000;
	@Value("#{medicalInsurance.insuredAmount le 10000}")
	private boolean insuranceAmountlessthanOrequalto10000;
	@Value("#{medicalInsurance.insuredAmount gt 10000}")
	private boolean insuranceAmountgreaterthan10000;
	@Value("#{medicalInsurance.insuredAmount ge 10000}")
	private boolean insuranceAmountgreaterthanorequalto10000;
	@Value("#{medicalInsurance.insuredAmount==10000 and medicalInsurance.insurancePolicyNumber==3}")
	private boolean testAndCondition;
	@Value("#{medicalInsurance.insuredAmount==10000 or medicalInsurance.insurancePolicyNumber==3}")
	private boolean testOrCondition;
	@Value("#{medicalInsurance.insuredAmount!=10000}")
	private boolean testNotCondition;
	@Value("#{medicalInsurance.insuredAmount + medicalInsurance.bonusAmount}")
	private int testadd;
	@Value("#{medicalInsurance.insuredAmount - medicalInsurance.bonusAmount}")
	private int testsubtract;
	@Value("#{medicalInsurance.insuredAmount * medicalInsurance.bonusAmount}")
	private int testMultiplication;
	@Value("#{medicalInsurance.insuredAmount / medicalInsurance.bonusAmount}")
	private int testDivision;
	@Value("#{medicalInsurance.insuredAmount % medicalInsurance.bonusAmount}")
	private int testModulous;
	@Value("#{medicalInsurance.insuredAmount ^ medicalInsurance.bonusAmount}")
	private long testExponentialpower;
	@Value("#{addressInfo.addressList[2]}")
	private String firstAddress;
	@Value("#{addressInfo.addressList[1]}")
	private String secondAddress;
	//private String emailRegex = "^([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-\.]+)\.([a-zA-Z]{2,5})$ " ;
	
	
	public Employee() {
		System.out.println("employee");
	}
	
	public Employee(Address address) {
		this.Address=address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpState() {
		return empState;
	}
	public void setEmpState(String empState) {
		this.empState = empState;
	}

	public Address getAddress() {
		return Address;
	}
	
	public void setAddress(Address address) {
		Address = address;
	}
	
	public String getFullAddress() {
		return fullAddress;
	}
	
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	public void setSouthIndian(boolean southIndian) {
		SouthIndian = southIndian;
	}
	

	public boolean isInsuranceAmountEqualto10000() {
		return insuranceAmountEqualto10000;
	}

	public void setInsuranceAmountEqualto10000(boolean insuranceAmountEqualto10000) {
		this.insuranceAmountEqualto10000 = insuranceAmountEqualto10000;
	}

	public boolean isInsuranceAmountNotequalto10000() {
		return insuranceAmountNotequalto10000;
	}

	public void setInsuranceAmountNotequalto10000(boolean insuranceAmountNotequalto10000) {
		this.insuranceAmountNotequalto10000 = insuranceAmountNotequalto10000;
	}

	public boolean isInsuranceAmountlessthan10000() {
		return insuranceAmountlessthan10000;
	}

	public void setInsuranceAmountlessthan10000(boolean insuranceAmountlessthan10000) {
		this.insuranceAmountlessthan10000 = insuranceAmountlessthan10000;
	}

	public boolean isInsuranceAmountlessthanOrequalto10000() {
		return insuranceAmountlessthanOrequalto10000;
	}

	public void setInsuranceAmountlessthanOrequalto10000(boolean insuranceAmountlessthanOrequalto10000) {
		this.insuranceAmountlessthanOrequalto10000 = insuranceAmountlessthanOrequalto10000;
	}

	public boolean isInsuranceAmountgreaterthan10000() {
		return insuranceAmountgreaterthan10000;
	}

	public void setInsuranceAmountgreaterthan10000(boolean insuranceAmountgreaterthan10000) {
		this.insuranceAmountgreaterthan10000 = insuranceAmountgreaterthan10000;
	}

	public boolean isInsuranceAmountgreaterthanorequalto10000() {
		return insuranceAmountgreaterthanorequalto10000;
	}

	public void setInsuranceAmountgreaterthanorequalto10000(boolean insuranceAmountgreaterthanorequalto10000) {
		this.insuranceAmountgreaterthanorequalto10000 = insuranceAmountgreaterthanorequalto10000;
	}

	public boolean isSouthIndian() {
		return SouthIndian;
	}
	
	public boolean isTestAndCondition() {
		return testAndCondition;
	}

	public void setTestAndCondition(boolean testAndCondition) {
		this.testAndCondition = testAndCondition;
	}

	public boolean isTestOrCondition() {
		return testOrCondition;
	}

	public void setTestOrCondition(boolean testOrCondition) {
		this.testOrCondition = testOrCondition;
	}

	public boolean isTestNotCondition() {
		return testNotCondition;
	}

	public void setTestNotCondition(boolean testNotCondition) {
		this.testNotCondition = testNotCondition;
	}
	
	public int getTestadd() {
		return testadd;
	}

	public void setTestadd(int testadd) {
		this.testadd = testadd;
	}

	public int getTestsubtract() {
		return testsubtract;
	}

	public void setTestsubtract(int testsubtract) {
		this.testsubtract = testsubtract;
	}

	public int getTestMultiplication() {
		return testMultiplication;
	}

	public void setTestMultiplication(int testMultiplication) {
		this.testMultiplication = testMultiplication;
	}

	public int getTestDivision() {
		return testDivision;
	}

	public void setTestDivision(int testDivision) {
		this.testDivision = testDivision;
	}

	public int getTestModulous() {
		return testModulous;
	}

	public void setTestModulous(int testModulous) {
		this.testModulous = testModulous;
	}

	public long getTestExponentialpower() {
		return testExponentialpower;
	}

	public void setTestExponentialpower(long testExponentialpower) {
		this.testExponentialpower = testExponentialpower;
	}

	public String getFirstAddress() {
		return firstAddress;
	}

	public void setFirstAddress(String firstAddress) {
		this.firstAddress = firstAddress;
	}

	public String getSecondAddress() {
		return secondAddress;
	}

	public void setSecondAddress(String secondAddress) {
		this.secondAddress = secondAddress;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", empState=" + empState + ", Address=" + Address
				+ ", fullAddress=" + fullAddress + ", SouthIndian=" + SouthIndian + ", insuranceAmountEqualto10000="
				+ insuranceAmountEqualto10000 + ", insuranceAmountNotequalto10000=" + insuranceAmountNotequalto10000
				+ ", insuranceAmountlessthan10000=" + insuranceAmountlessthan10000
				+ ", insuranceAmountlessthanOrequalto10000=" + insuranceAmountlessthanOrequalto10000
				+ ", insuranceAmountgreaterthan10000=" + insuranceAmountgreaterthan10000
				+ ", insuranceAmountgreaterthanorequalto10000=" + insuranceAmountgreaterthanorequalto10000
				+ ", testAndCondition=" + testAndCondition + ", testOrCondition=" + testOrCondition
				+ ", testNotCondition=" + testNotCondition + ", testadd=" + testadd + ", testsubtract=" + testsubtract
				+ ", testMultiplication=" + testMultiplication + ", testDivision=" + testDivision + ", testModulous="
				+ testModulous + ", testExponentialpower=" + testExponentialpower + ", firstAddress=" + firstAddress
				+ ", secondAddress=" + secondAddress + "]";
	}
	
	

	
}
