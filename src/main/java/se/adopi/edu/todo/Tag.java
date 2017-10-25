package se.adopi.edu.todo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class Tag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int tagid;
	
	@Column(name="tagname")
	private String name;

	@ManyToMany(mappedBy="tags")
	private List<Todo> todos;

	public int getTagid() { return tagid; }
	public void setTagid(int tagid) { this.tagid = tagid; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public List<Todo> getTodos() { return todos; }
	public void setTodos(List<Todo> todos) { this.todos = todos; }

	
}
