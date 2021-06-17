package se.lexicon.data;

import se.lexicon.model.Todo;

public class TodoItems {

    private static Todo[] todos = new Todo[0];

    public int size() {
        int antalTodos = todos.length;
        return antalTodos;
    }

    public Todo[] findAll(){}

    public Todo findById(int todoId) {}

    public void clear() {}

/*    10. Add the following methods to TodoItems class
    a. public Todo[] findByDoneStatus(boolean doneStatus)
- Returns array with objects that has a matching done status.
    b. public Todo[] findByAssignee(int personId)
- Returns array with objects that has an assignee with a personId matching.
    c. public Todo[] findByAssignee(Person assignee)
- Returns array with objects that has sent in Person.
            d. public Todo[] findUnassignedTodoItems()
- Returns an array of objects that does not have an assignee set.

*/

    // När allt annat är klart:
    // Lägg till Functionality to remove object from array. (not nulling) First: you need to find the correct array
    // index of the object. Second: You need to rebuild array by excluding the object on found index.


}
