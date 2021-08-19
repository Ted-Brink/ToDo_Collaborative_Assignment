package se.lexicon.dao;

import se.lexicon.model.Person;
import se.lexicon.model.Todo;
import java.util.Collection;

public interface TodoItems {

    Todo create(Todo todo);

    Collection<Todo> findAll();

    Todo findById(int todoId);

    Collection<Todo> findByDoneStatus(boolean doneStatus);

    Collection<Todo> findByAssignee(int personId);

    Collection<Todo> findByAssignee(Person person);

    Collection<Todo> findByUnassignedToDoItems();

    Todo update(Todo todo);

    boolean deleteById(int todoId);







}
