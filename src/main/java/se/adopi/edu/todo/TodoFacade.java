package se.adopi.edu.todo;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

@Stateless
public class TodoFacade {
	@PersistenceContext(unitName="todo")
	private EntityManager em;

	public List<Todo> findAll() {
		CriteriaBuilder cb = em.getCriteriaBuilder();

		CriteriaQuery<Todo> cq = cb.createQuery(Todo.class);
		cq.select(cq.from(Todo.class));
		return em.createQuery(cq).getResultList();
	}
}





