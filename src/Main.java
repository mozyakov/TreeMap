import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>(Arrays.asList(
                new Person("Petr", "la-Petrov", 16),
                new Person("Albert", "Van-Der-fon-Gor", 15),
                new Person("Kir", "Der-fon-Persi", 15),
                new Person("Ivan", "la-Ivanov", 15)
        ));

        Collections.sort(person, new PersonComparator());
        for (Person person1 : person) {  //вывод отсортированного списка
            System.out.println(person1);
        }
        System.out.println(person); //ещё раз вывожу отсортированный список
    }
}