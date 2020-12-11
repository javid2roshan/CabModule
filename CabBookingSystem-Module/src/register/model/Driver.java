package register.model;

import java.util.Scanner;

public class Driver {
	private static final long serialVersionUID = 1L;
	private String name;
	private String email;
	private String phoneNo;
	private String licenseNo;
	private String carNo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
	      //Regular expression to accept valid phone number
	      this.phoneNo = phoneNo;
	}
	public String getLicenseNo() {
		return licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public boolean validatePhoneNo(String phoneNo) {
		String regex = "\\d{10}";
	      //Matching the given phone number with regular expression
	      return phoneNo.matches(regex);
	}
	
	public boolean validateFields() {
		if(getName().isEmpty() || getEmail().isEmpty() || getPhoneNo().isEmpty() || getLicenseNo().isEmpty() || getCarNo().isEmpty())
			return false;
		else 
			return true;
	}
}

