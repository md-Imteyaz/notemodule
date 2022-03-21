package com.Notes.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.ComponentScan;
@ComponentScan
@Entity
public class Note {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	private String Name;
	private String Contact;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getContact() {
		return Contact;
	}

	public void setContact(String contact) {
		Contact = contact;
	}

	public Note(int id, String name, String contact) {
		super();
		this.id = id;
		Name = name;
		Contact = contact;
	}

	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Note [id=" + id + ", Name=" + Name + ", Contact=" + Contact + "]";
	}

}
