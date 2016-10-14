package com.wifiwireless.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CustomerDetails")
public class CustomerDetails extends PL4Base implements Serializable{
	

	@Column(name = "company")
	private String company;
	@Column(name = "first_name")
	private String first_name;
	@Column(name = "last_name")
	private String last_name;
	@Column(name = "email")
	private String email;	
	@Column(name = "phone")
	private String phone;
	@Column(name = "form_fields")
	private String formfields;
	@Column(name = "date_created")
	private String date_created;
	@Column(name = "date_modified")
	private String date_modified;
	@Column(name = "store_credit")
	private String storecredit;
	@Column(name = "registration_ip_address")
	private String registrationipaddress;
	@Column(name = "customer_group_id")
	private String customergroupid;
	@Column(name = "notes")
	private String notes;
	@Column(name = "tax_exempt_category")
	private String taxexemptcategory;
	@Column(name = "reset_pass_on_login")
	private String resetpassonlogin;
	@Column(name = "accepts_marketing")
	private String acceptsmarketing;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFormfields() {
		return formfields;
	}
	public void setFormfields(String formfields) {
		this.formfields = formfields;
	}
	public String getDate_created() {
		return date_created;
	}
	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}
	public String getDate_modified() {
		return date_modified;
	}
	public void setDate_modified(String date_modified) {
		this.date_modified = date_modified;
	}
	public String getStorecredit() {
		return storecredit;
	}
	public void setStorecredit(String storecredit) {
		this.storecredit = storecredit;
	}
	public String getRegistrationipaddress() {
		return registrationipaddress;
	}
	public void setRegistrationipaddress(String registrationipaddress) {
		this.registrationipaddress = registrationipaddress;
	}
	public String getCustomergroupid() {
		return customergroupid;
	}
	public void setCustomergroupid(String customergroupid) {
		this.customergroupid = customergroupid;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getTaxexemptcategory() {
		return taxexemptcategory;
	}
	public void setTaxexemptcategory(String taxexemptcategory) {
		this.taxexemptcategory = taxexemptcategory;
	}
	public String getResetpassonlogin() {
		return resetpassonlogin;
	}
	public void setResetpassonlogin(String resetpassonlogin) {
		this.resetpassonlogin = resetpassonlogin;
	}
	public String getAcceptsmarketing() {
		return acceptsmarketing;
	}
	public void setAcceptsmarketing(String acceptsmarketing) {
		this.acceptsmarketing = acceptsmarketing;
	}
	
	
}
