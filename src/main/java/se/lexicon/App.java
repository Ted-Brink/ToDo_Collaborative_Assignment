package se.lexicon;

import se.lexicon.data.TodoItems;
import se.lexicon.model.Person;
import se.lexicon.model.Todo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Person hej = new Person("kalle,", "Karlsson");
        Person hej1 = new Person("kalle", "Anka");
        Person hej2 = new Person("Musse", "Pigg");


        System.out.println(hej.getFirstName());
        System.out.println(hej1.getPersonID());
        System.out.println(hej2.getPersonID());


        Todo clean = new Todo("städa garaget");

        TodoItems storage = new TodoItems();

//        storage.add(clean);

    }
}
