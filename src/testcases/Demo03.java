package testcases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface TodoService {
	public List<String> getTodos(String user);

	public List<String> deleteTodos(String todo);
}

class TodoServiceStub implements TodoService {
	List<String> list = Arrays.asList("Use Core Java", "Use Spring Core", "Use Hibernate", "Use Spring MVC");

	@Override
	public List<String> getTodos(String user) {
		return list;
	}

	@Override
	public List<String> deleteTodos(String todo) {
		// TODO Auto-generated method stub
		List<String> newList = list;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == todo) {
				list.remove(i);
			}
		}
		return newList;
	}
}

class TodoBussiness {
	public TodoService doService;

	public TodoBussiness(TodoService doService) {
		// TODO Auto-generated constructor stub
		this.doService = doService;
	}

	public List<String> getTodosForSpring(String user) {

		List<String> retrieveTodos = new ArrayList<String>();
		List<String> todos = doService.getTodos(user);

		for (String todo : todos) {
			if (todo.contains(user)) {
				retrieveTodos.add(todo);
			}
		}
		return retrieveTodos;
	}
}

class TodoBusiness {
	public TodoService doService;

	public TodoBusiness(TodoService doService) {
		this.doService = doService;
	}

	public List<String> getTodosForHibernate(String user) {
		List<String> hibList = new ArrayList<String>();
		List<String> combined = doService.getTodos(user);

		for (String todo : combined) {
			if (todo.contains("Hibernate")) {
				hibList.add(todo);
			}
		}
		return hibList;
	}

	public void deleteTodoNotRelatedToHibernate(String name) {
		List<String> combined = doService.getTodos(name);

		for (String todo : combined) {
			if (!todo.contains("Hibernate")) {
				doService.deleteTodos(todo);
			}
		}
//		return combined;
	}
}

public class Demo03 {

}
