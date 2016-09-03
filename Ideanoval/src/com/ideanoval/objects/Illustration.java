package com.ideanoval.objects;

public class Illustration {

	private int id = -1;
	private String filepath = null;
	private int weight = -1;
	private String format = null;
	private String resolution = null;
	private int id_Idea = -1;
	

//constructors
	// WITH "id" field
	public Illustration(int id, String filepath, int weight, String format, String resolution, int id_Idea) {
		super();
		this.id = id;
		this.filepath = filepath;
		this.weight = weight;
		this.format = format;
		this.resolution = resolution;
		this.id_Idea = id_Idea;
	}
	// WITHOUT "id" field
	public Illustration(String filepath, int weight, String format, String resolution, int id_Idea) {
		super();
		this.filepath = filepath;
		this.weight = weight;
		this.format = format;
		this.resolution = resolution;
		this.id_Idea = id_Idea;
	}
	

//	getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public int getId_Idea() {
		return id_Idea;
	}
	public void setId_Idea(int id_Idea) {
		this.id_Idea = id_Idea;
	}
	
	
// toString
	@Override
	public String toString() {
		return "Illustration [id=" + id + ", filepath=" + filepath + ", weight=" + weight + ", format=" + format
				+ ", resolution=" + resolution + ", id_Idea=" + id_Idea + "]";
	}
	
	
	
	
	
	

}
