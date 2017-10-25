package se.adopi.edu.todo;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TodoBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@EJB
	private TodoFacade todoEJB;
	
	private List<Todo> todos;
	
	public List<Todo> getTodos() {
		if (todos == null) {
			todos = todoEJB.findAll();
		}
		return todos;
	}
	public void setTodos(List<Todo> todos) {
		this.todos = todos;
	}
}
