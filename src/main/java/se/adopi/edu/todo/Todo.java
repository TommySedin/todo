package se.adopi.edu.todo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Todo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int todoid;

	@Column(length=50, nullable=true)
	private String description;

	@Column
	private boolean done;

	@ManyToMany
	@JoinTable(
			name="todo_tag",
			joinColumns={
					@JoinColumn(
							name="todoid",
							referencedColumnName="todoid")},
			inverseJoinColumns={
					@JoinColumn(
							name="tagid",
							referencedColumnName="tagid")}
	)
	private List<Tag> tags;

	public int getTodoid() { return todoid; }
	public void setTodoid(int todoid) { this.todoid = todoid; }
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }
	public boolean isDone() { return done; }
	public void setDone(boolean done) { this.done = done; }
	public List<Tag> getTags() { return tags; }
	public void setTags(List<Tag> tags) { this.tags = tags; }
}
