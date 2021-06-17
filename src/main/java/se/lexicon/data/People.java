package se.lexicon.data;

import se.lexicon.model.Person;

public class People {
   private static Person[] personer = new Person[0];

   public int size() {
       int antalPerson = Personer.length;
       return antalPerson;
   }

   public Person[] findAll() {}

    public Person findById(int personId) {}

    // Metod skapa ny Person

    public void clear() {}


}
