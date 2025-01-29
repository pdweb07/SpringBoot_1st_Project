package com.example.Newtask.model;

public class Player {

	int playerId;
	String playerName;
	int age;

	String playerRole;

	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int playerId, String playerName, int age, String playerRole) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.age = age;
		this.playerId = playerId;
		this.playerRole = playerRole;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", age=" + age + ", playerId=" + playerId
				+ ", playerRole=" + playerRole + "]";
	}

	/**
	 * @return the playerId
	 */
	public int getPlayerId() {
		return playerId;
	}

	/**
	 * @param playerId the playerId to set
	 */
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	/**
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	


	/**
	 * @return the playerRole
	 */
	public String getPlayerRole() {
		return playerRole;
	}

	/**
	 * @param playerRole the playerRole to set
	 */
	public void setPlayerRole(String playerRole) {
		this.playerRole = playerRole;
	}

}
