package com.web.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "blogPost")
public class BlogPost {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String blogTitle;
	@Lob
	private String blogContent; // Database datatype as CLOB
	private Date postedOn;
	@ManyToOne
	private User postedBy;
	private boolean approvalStatus;
	private int likes;
	private int disLikes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTtile(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getBlogContent() {
		return blogContent;
	}

	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}

	public Date getPostedOn() {
		return postedOn;
	}

	public void setPostedOn(java.util.Date date) {
		this.postedOn = date;
	}

	public User getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(User postedBy) {
		this.postedBy = postedBy;
	}

	public boolean isApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(boolean approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getDislikes() {
		return disLikes;
	}

	public void setDislikes(int disLikes) {
		this.disLikes = disLikes;
	}

}


		