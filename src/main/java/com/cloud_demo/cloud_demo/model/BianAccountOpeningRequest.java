package com.cloud_demo.cloud_demo.model;

public class BianAccountOpeningRequest {
	
	private String _rev;
	private String _id;

	private String accountNumber;
	private String accountName;
	private String branchCode;
	private String branchName;
	private String taxIdentificationNumber;
	private String accountPurpose;
	private String  address;
	
	public String get_rev() {
		return _rev;
	}

	public void set_rev(String _rev) {
		this._rev = _rev;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getTaxIdentificationNumber() {
		return taxIdentificationNumber;
	}

	public void setTaxIdentificationNumber(String taxIdentificationNumber) {
		this.taxIdentificationNumber = taxIdentificationNumber;
	}

	public String getAccountPurpose() {
		return accountPurpose;
	}

	public void setAccountPurpose(String accountPurpose) {
		this.accountPurpose = accountPurpose;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BianAccountOpeningRequest(String _rev, String _id, String accountNumber, String accountName,
			String branchCode, String branchName, String taxIdentificationNumber, String accountPurpose,
			String address) {
		super();
		this._rev = _rev;
		this._id = _id;
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.branchCode = branchCode;
		this.branchName = branchName;
		this.taxIdentificationNumber = taxIdentificationNumber;
		this.accountPurpose = accountPurpose;
		this.address = address;
	}

	@Override
	public String toString() {
		return "BianAccountOpeningRequest [_rev=" + _rev + ", _id=" + _id + ", accountNumber=" + accountNumber
				+ ", accountName=" + accountName + ", branchCode=" + branchCode + ", branchName=" + branchName
				+ ", taxIdentificationNumber=" + taxIdentificationNumber + ", accountPurpose=" + accountPurpose
				+ ", address=" + address + "]";
	}
	

	


}
