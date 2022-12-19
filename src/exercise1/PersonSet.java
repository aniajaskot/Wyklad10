package exercise1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PersonSet {
    public static void main(String[] args) {

        Set<Person> people = new HashSet<>();
        people.add(new Person("Jan", "Kowalski", 20));
        people.add(new Person("Marian", "Kowalski", 21));
        people.add(new Person("Zbyszek", "Kowalski", 22));
        people.add(new Person("Jan", "Kowalski", 20));
        people.add(new Person("Zbyszek", "Kowalski", 25));

        for(Person person : people){
            System.out.println(person);
            // tak nie można
            // java.util.ConcurrentModificationException
//            if("Zbyszek".equals(person.getFirstName())){
//                people.remove(person);
//            }
        }

        System.out.println("-------");

        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            System.out.println(person);
            if("Zbyszek".equals(person.getFirstName())){
                iterator.remove();
            }
        }

        System.out.println("-------");

        for(Person person : people){
            System.out.println(person);
        }
    }
}
