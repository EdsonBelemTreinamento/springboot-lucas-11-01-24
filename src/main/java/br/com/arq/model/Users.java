package br.com.arq.model;

import java.time.LocalDate;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="users")
public class Users {

	 private String id;
	 
	 private String name;
	 
	 private String email;
	 
	 private String password;
	 
	 private String status;
	 
	 private LocalDate dateCreated;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}
 
	
	
}
