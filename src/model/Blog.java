package model;

import java.time.LocalDate;

// Type your code
public class Blog{
	private String title;
	private String description;
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
	public LocalDate getPostedOn() {
		return postedOn;
	}
	public void setPostedOn(LocalDate postedOn) {
		this.postedOn = postedOn;
	}
	private LocalDate postedOn;
	public Blog(String title,String description,LocalDate postedOn) {
		this.title=title;
		this.description=description;
		this.postedOn=postedOn;
	}

}