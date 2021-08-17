package se.lexicon.model;

import se.lexicon.data.PersonSequencer;

public class Person {
    private final int personId;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.personId = PersonSequencer.nextPersonId();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getPersonID() {
        return personId;
    }

   // Ta bort onödiga set and get

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

    @Override
    public String toString() {      // Används för test, kan ta bort.
        return "Person{" +
                "personId=" + personId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}