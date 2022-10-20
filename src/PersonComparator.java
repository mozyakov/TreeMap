import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int len1 = p1.getSurname().split(" ").length;
        int len2 = p2.getSurname().split(" ").length;
        if(len1 != len2) {
            return Integer.compare(len1, len2);
        }
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}
