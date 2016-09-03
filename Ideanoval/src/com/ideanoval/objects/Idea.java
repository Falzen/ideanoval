package com.ideanoval.objects;

import java.util.Date;

public class Idea {

	private int id = -1;
	private String title = null;
	private String description = null;
	private Date publicationDate = null;
	private int id_category = -1;
	private int id_user = -1;
	private int id_illustration = -1;
	private boolean isActive = false;
	

//constructors
	// WITH "id" field
	public Idea(int id, String title, String description, Date publicationDate, int id_category, int id_user,
			int id_illustration, boolean isActive) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.publicationDate = publicationDate;
		this.id_category = id_category;
		this.id_user = id_user;
		this.id_illustration = id_illustration;
		this.isActive = isActive;
	}
	// WITHOUT "id" field
	public Idea(String title, String description, Date publicationDate, int id_category, int id_user,
			int id_illustration, boolean isActive) {
		super();
		this.title = title;
		this.description = description;
		this.publicationDate = publicationDate;
		this.id_category = id_category;
		this.id_user = id_user;
		this.id_illustration = id_illustration;
		this.isActive = isActive;
	}


	
	
//	getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}
	public int getId_category() {
		return id_category;
	}
	public void setId_category(int id_category) {
		this.id_category = id_category;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public int getId_illustration() {
		return id_illustration;
	}
	public void setId_illustration(int id_illustration) {
		this.id_illustration = id_illustration;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
// toString
	@Override
	public String toString() {
		return "Idea [id=" + id + ", title=" + title + ", description=" + description + ", publicationDate="
				+ publicationDate + ", id_category=" + id_category + ", id_user=" + id_user + ", id_illustration="
				+ id_illustration + ", isActive=" + isActive + "]";
	}
	



	
	
	
	
	
	
	
	
	
	
	
	
}

