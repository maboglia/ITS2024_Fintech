package test;

import java.util.ArrayList;

import controller.BloccoNote;
import model.Todo;

public class BloccoNoteTest {

	public static void main(String[] args) {

		BloccoNote bloccoBlu = new BloccoNote("Lavoro"); 
		BloccoNote bloccoRosso = new BloccoNote("Spese"); 
		BloccoNote bloccoVerde = new BloccoNote("Invitati");
		
		bloccoBlu.addTodo("java");
		bloccoBlu.addTodo("php");
		bloccoBlu.addTodo("database");
		bloccoBlu.addTodo("eclipse");
		
		bloccoBlu
			.getAll()
			.stream()
			.filter(t -> t.getId() > 2)
			.forEach(t -> System.out.println(t));
		

	}

}
