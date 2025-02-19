package exercise3;

import java.util.ArrayList;
import java.util.Date;

public class PersonList {

    ArrayList<Person> people;

    public PersonList() {
        people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public boolean deletePersonById(String ID) {
        for (Person person : people) {
            if (person.ID.equals(ID)) {
                people.remove(person);
                return true;
            }
        }
        return false;
    }

    public void editPersonById(String ID, Person newPerson) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).ID.equals(ID)) {
                people.set(i, newPerson);
                return;
            }
        }
    }

    public void displayAll() {
        for (Person person : people) {
            person.displayInfo();
        }
    }
}
