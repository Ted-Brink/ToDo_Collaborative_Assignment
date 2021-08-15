package se.lexicon;

import se.lexicon.model.Person;

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
        System.out.println("hej = " + hej);

    }
}
