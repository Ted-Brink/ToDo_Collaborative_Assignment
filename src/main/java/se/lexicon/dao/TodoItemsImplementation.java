package se.lexicon.dao;

import se.lexicon.model.Person;
import se.lexicon.model.Todo;

import java.util.Collection;

public class TodoItemsImplementation implements TodoItems{

    @Override
    public Todo create(Todo todo) {
        return null;
    }

    @Override
    public Collection<Todo> findAll() {
        return null;
    }

    @Override
    public Todo findById(int todoId) {
        return null;
    }

    @Override
    public Collection<Todo> findByDoneStatus(boolean doneStatus) {
        return null;
    }

    @Override
    public Collection<Todo> findByAssignee(int personId) {
        return null;
    }

    @Override
    public Collection<Todo> findByAssignee(Person person) {
        return null;
    }

    @Override
    public Collection<Todo> findByUnassignedToDoItems() {
        return null;
    }

    @Override
    public Todo update(Todo todo) {
        return null;
    }

    @Override
    public boolean deleteById(int todoId) {
        return false;
    }
}
