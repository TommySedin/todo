package se.adopi.edu.todo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int todoid;

	@Column(length=50, nullable=true)
	private String description;

	@Column
	private boolean done;

	public int getTodoid() { return todoid; }
	public void setTodoid(int todoid) { this.todoid = todoid; }
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }
	public boolean isDone() { return done; }
	public void setDone(boolean done) { this.done = done; }
}
