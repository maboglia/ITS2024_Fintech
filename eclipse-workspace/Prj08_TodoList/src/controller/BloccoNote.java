package controller;

import java.util.ArrayList;

import model.Todo;

public class BloccoNote {

	//aggregatore di todo
	private ArrayList<Todo> todoList;
	private String nomeBlocco;
	
	public BloccoNote(String nomeBlocco) {
		this.todoList = new ArrayList<Todo>();
		this.nomeBlocco = nomeBlocco;
	}
	
	public void addTodo(Todo t) {
		todoList.add(t);
	}
	
	public void addTodo(String desc) {
		Todo t = new Todo(desc);
		todoList.add(t);
	}
	
	public ArrayList<Todo> getTodoList() {
		//filtro
		return todoList;
	}
	
	public ArrayList<Todo> getAll() {
		return getTodoList();
	}
	
	public Todo getById(int id) {
		
		for (Todo t : todoList) {
			if (t.getId() == id) {
				return t;
			}
		}
		
		return null;
		
	}
	
	
}
