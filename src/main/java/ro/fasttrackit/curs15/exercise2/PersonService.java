package ro.fasttrackit.curs15.exercise2;

import org.assertj.core.api.ListAssert;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class PersonService {

    private final List<Person> persons;

    public PersonService(Collection<Person> persons){
        this.persons = persons == null
                ? new ArrayList<>()
                : new ArrayList<>(persons);
    }

    public void addPerson(Person person){
        this.persons.add(person);
    }

    public List<Person> getPersons() {
        return new ArrayList<>(persons);
    }
    public List<Person> removePersonId(int searchId){
        List<Person> result = new ArrayList<>();
        if(searchId != 0) {

            for (Person person : persons) {
                if (Objects.equals(person.getId(), searchId)) {
                    result.remove(person);
                }
            }
        }
        return result;
    }
    public List<Person> getPersonsOlderThan(int ageLimit){
        List<Person> result = new ArrayList<>();
        if(ageLimit> 0 && ageLimit<120) {
            for (Person person : persons){
                if(person.getAge()==ageLimit){
                    result.add(person);
                }
            }
        }else {
            result.addAll(this.persons);
        }
        return result;
    }
}
