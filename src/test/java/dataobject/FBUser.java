package dataobject;

import java.util.Map;

public class FBUser {
	
	private String firstName;
	
	private String surName;
	
	private String mobileNumber;
	
	private String password;
	
	private String day;
	
	private String month;
	
	private String year;
	
	private String gender;
	
	public FBUser() {
		super();
	}

	public FBUser(String firstName, String surName, String mobileNumber, String password, String day, String month,
			String year, String gender) {
		super();
		this.firstName = firstName;
		this.surName = surName;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.day = day;
		this.month = month;
		this.year = year;
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
		result = prime * result + ((month == null) ? 0 : month.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((surName == null) ? 0 : surName.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FBUser other = (FBUser) obj;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (mobileNumber == null) {
			if (other.mobileNumber != null)
				return false;
		} else if (!mobileNumber.equals(other.mobileNumber))
			return false;
		if (month == null) {
			if (other.month != null)
				return false;
		} else if (!month.equals(other.month))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (surName == null) {
			if (other.surName != null)
				return false;
		} else if (!surName.equals(other.surName))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}
	
	
	public static FBUser createFBUser(Map<String, String> entry) {
		FBUser fbUser = new FBUser();
		fbUser.setFirstName(entry.get("firstName"));
		fbUser.setSurName(entry.get("surName"));
		fbUser.setMobileNumber(entry.get("mobileNumber"));
		fbUser.setPassword(entry.get("password"));
		fbUser.setDay(entry.get("day"));
		fbUser.setMonth(entry.get("month"));
		fbUser.setYear(entry.get("year"));
		fbUser.setGender(entry.get("gender"));
		return fbUser;
	}


	@Override
	public String toString() {
		return "FBUser [firstName=" + firstName + ", surName=" + surName + ", mobileNumber=" + mobileNumber
				+ ", password=" + password + ", day=" + day + ", month=" + month + ", year=" + year + ", gender="
				+ gender + "]";
	}

}
