package net.rits.shopping_backend.Dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class user {

	 @Id
	 private int id;
	 @Column(name="first_name")
	 private String firstname;
	 @Column(name="last_name")
	 private String lastname;
	 private String role;
	 private boolean enabled;
	 private String  password;
	 private String email;
	 private String contact;
	 
	 
	 
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirst_name(String first_name) {
		this.firstname = first_name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLast_name(String last_name) {
		this.lastname = last_name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	 
	 
	 
}
