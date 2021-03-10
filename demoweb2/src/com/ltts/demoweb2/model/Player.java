package com.ltts.demoweb2.model;

import java.sql.Date;

public class Player {

	private int playerId;
	private String playerName;
	private String country;
	private Date dateOfBirth;
	private String email;
	private int age;
	
	
	public Player() {
		super();
	}
	
	
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	

	public Player(int playerId, String playerName, String country, Date dateOfBirth, String email, int age) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.country = country;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", country=" + country + ", dateOfBirth="
				+ dateOfBirth + ", email=" + email + ", age=" + age + "]";
	}






//	@Override
//	public String toString() {
//		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", country=" + country + ", dateOfBirth="
//				+ dateOfBirth + "]";
//	}
	
	
}
