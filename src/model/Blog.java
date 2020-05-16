package model;

import java.time.LocalDate;

// Type your code

public class Blog{
	String title;
	String description;
	LocalDate postedOn;
	public String getBlogTitle() {
		return title;
	}
	public void setBlogTitle(String title) {
		this.title = title;
	}
	public String getBlogDescription() {
		return description;
	}
	public void setBlogDescription(String description) {
		this.description = description;
	}
	public LocalDate getDate() {
		return postedOn;
	}
	public void setDate(LocalDate postedOn) {
		this.postedOn = postedOn;
	}
	public Blog(String title, String description, LocalDate postedOn) {
		this.title = title;
		this.description = description;
		this.postedOn = postedOn;
	}
	
	
	
}