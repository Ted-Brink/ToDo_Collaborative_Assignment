package se.lexicon.data;

public class TodoSequencer {

    private static int todoId;

    static int nextTodoId() {
        ++todoId;
        return todoId;
    }

    void reset() {
        todoId = 0;
    }



}