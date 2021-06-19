package se.lexicon.model;


public class Person {
    final int personId;
    String firstName;
    String lastName;

    Person(final int personId, String firstName, String lastName) {
      this.personId = personId;
      this.firstName = firstName;
      this.lastName = lastName;
      }
      public int getPersonID() {
        return personId;
    }
    public void setPersonID(int personID) {
       // this.personId = personId;               // Tror inte det ska var någon metod här eftersom personId är final
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}


