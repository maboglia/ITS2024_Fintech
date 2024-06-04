package com.maboglia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pokemon {

	@Id
	private String name;
	
	private String img;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	
}
