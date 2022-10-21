import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<Person>();
        person.add(new Person("Petr", "Petrov", 19));
        person.add(new Person("Kir", "Persivalin", 20));
        //person.add(new Person("Ivan", "Ivanov", 20));
        //person.add(new Person("Albert", "Gor", 20));
        System.out.println(person);
        for (Person p : person) {
            System.out.println(p.getSurname());
        }

        Collections.sort(person,
                 new PersonComparator());
        //for (Person p : person) {
            //System.out.println(p.getSurname());
        //}

        //System.out.println(person.get(0).getSurname());
    }
}