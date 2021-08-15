package se.lexicon.data;

import se.lexicon.model.Todo;
import java.util.Arrays;

public class TodoItems {

    private  Todo[] todos = new Todo[0];

    public int size() {
        return todos.length;
    }

    public Todo[] findAll() {
        Todo[] todoLista = Arrays.copyOf(todos, todos.length);
        return todoLista;
    }

    public Todo findById(int todoId) {
        for (int i = 0; i < todos.length; i++) {
            if (todoId == todos[i].getTodoId())
                return todos[i];
        }
        return null;
    }

    public void clear() {       // Clear Todo Array
        todos = new Todo[0];
    }
}

/*
    // - Returns array with objects that has a matching done status
    public Todo[] findByDoneStatus(boolean doneStatus) {

     for(int i = 0; i < todos.length; i++) {
            if(todos[i].isDone() == true){

            }
        return null;
        }

    public Todo[] findByAssignee(int personId) {       //- Returns array with objects that has an assignee with a personId matching.

       // finns metod att hämta Id i People-classen findById()

    }

    }

    public Todo[] findByAssignee(Person assignee) // - Returns array with objects that has sent in Person.

            d. public Todo[] findUnassignedTodoItems() // - Returns an array of objects that does not have an assignee set.




    // När allt annat är klart:
    // Lägg till Functionality to remove object from array. (not nulling) First: you need to find the correct array
    // index of the object. Second: You need to rebuild array by excluding the object on found index.

*/



