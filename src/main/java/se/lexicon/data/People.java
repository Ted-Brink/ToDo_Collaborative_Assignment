package se.lexicon.data;

import se.lexicon.model.Person;
import java.util.Arrays;

class People {
    private  Person[] personer = new Person[0];   // Array för lagring av Person

    public int size() {                                 // Antal moduler i Arrayen
        return personer.length;
    }

    public Person[] findAll() {                          // Returnerar en Array med alla Personobjekt.
        Person[] personLista = Arrays.copyOf(personer, personer.length);
        return personLista;
    }

    public Person findById(int personId) {  //return the person that has a matching personId as the passed in parameter.
        for (int i = 0; i < personer.length; i++) {
            if (personId == personer[i].getPersonID())
                return personer[i];
        }
        return null;
    }

    // Metod skapa ny Person

    public  boolean skapaNyPerson(Person nyPerson) {              // behöver det vara en boolean retur???

        // Utökning av Array
        Person[] expandedArray = Arrays.copyOf(personer, personer.length + 1);

        // Lägg till Person i utökad Array.
        expandedArray[expandedArray.length - 1] = nyPerson;

        // Byt ut den utökade Array mot orginalArray som nu blir utökad
        personer = expandedArray;

        System.out.println("Person tilllagd");
        return true;
    }

    public void clearPersoner() {              //  clear Person Array
        personer = new Person[0];
    }

    // När allt annat är klart:
    // Lägg till Functionality to remove object from array. (not nulling) First: you need to find the correct array
    // index of the object. Second: You need to rebuild array by excluding the object on found index.
}




