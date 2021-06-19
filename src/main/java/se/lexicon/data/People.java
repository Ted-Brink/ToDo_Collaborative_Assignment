package se.lexicon.data;

import se.lexicon.model.Person;

 class People {
   private static Person[] personer = new Person[0];

   public int size() {
       //int antalPerson = personer.length;
       return personer.length;
   }

   public Person[] findAll() {}

    public Person findById(int personId) {}

    // Metod skapa ny Person




    public void clear() {              // static??? clear Person Array
       personer = new Person[0];
    }



    // När allt annat är klart:
    // Lägg till Functionality to remove object from array. (not nulling) First: you need to find the correct array
    // index of the object. Second: You need to rebuild array by excluding the object on found index.


}



}
