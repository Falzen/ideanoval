package com.ideanoval.objects;

public class Survey {

	private int id = -1;
	private String question = null;
	private int durationInDays = -1;
	private boolean isActive = false;
	private int id_idea = -1;

//constructors
	// WITH "id" field
	public Survey(int id, String question, int durationInDays, boolean isActive, int id_idea) {
		super();
		this.id = id;
		this.question = question;
		this.durationInDays = durationInDays;
		this.isActive = isActive;
		this.id_idea = id_idea;
	}

	// WITHOUT "id" field
	public Survey(String question, int durationInDays, boolean isActive, int id_idea) {
		super();
		this.question = question;
		this.durationInDays = durationInDays;
		this.isActive = isActive;
		this.id_idea = id_idea;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public int getDurationInDays() {
		return durationInDays;
	}
	public void setDurationInDays(int durationInDays) {
		this.durationInDays = durationInDays;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public int getId_idea() {
		return id_idea;
	}
	public void setId_idea(int id_idea) {
		this.id_idea = id_idea;
	}

	@Override
	public String toString() {
		return "Survey [id=" + id + ", question=" + question + ", durationInDays=" + durationInDays + ", isActive="
				+ isActive + ", id_idea=" + id_idea + "]";
	}
	
	
	
	

}
