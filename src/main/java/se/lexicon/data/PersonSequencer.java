package se.lexicon.data;

public class PersonSequencer {

    private static int personId;


    static int nextPersonId() {
        ++personId;
        return personId;
    }

 //   static reset() {      Fungerar inte med static
 //       personId = 0;
 //   }

}
