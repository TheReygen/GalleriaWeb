package it.uniroma3.GalleriaWeb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Amministratore {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String user;
	private String password;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Amministratore(){
	}
	public boolean checkPassword(String password){
		return this.password.equals(password);
	}
}
