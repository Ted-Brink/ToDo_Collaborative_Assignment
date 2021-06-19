package se.lexicon.data;

import se.lexicon.model.Person;

import java.util.Arrays;

class People {
   private static Person[] personer = new Person[0];   // Array för lagring av Person

   public int size() {
       return personer.length;
   }

   public Person[] findAll() {
       Person[] personLista = Arrays.copyOf(personer,personer.length);
       return personLista;
   }




/*
    public static String[] findAllTitles(){
        String[] songList = Arrays.copyOf(songTitles, songTitles.length);
        return songList;
    }

        */


    // public Person findById(int personId) {}  //////// GÖR METOD


    // Metod skapa ny Person

    public static boolean skapaNyPerson(Person nyPerson) { // behöver det vara en boolean retur???

        // Utökning av Array
        Person[] expandedArray = Arrays.copyOf(personer, personer.length + 1);

        // System.out.println("Arrays.toString(expandedArray) = " + Arrays.toString(expandedArray));  inget stringobjekt, fungerar inte på Person

        // Lägg till Person i utökad Array.
        expandedArray[expandedArray.length - 1] = nyPerson;

        // Byt ut den utökade Array mot orginalArray som nu blir utökad
        personer = expandedArray;

        System.out.println("Person tilllagd");
        //   System.out.println("Arrays.toString(personer) = " + Arrays.toString(songTitles)); Har ingen toStringmetod för Person-objekt
        return true;

    }


    public void clearPersoner(){              // static??? clear Person Array
       personer = new Person[0];
    }



    // När allt annat är klart:
    // Lägg till Functionality to remove object from array. (not nulling) First: you need to find the correct array
    // index of the object. Second: You need to rebuild array by excluding the object on found index.


}




