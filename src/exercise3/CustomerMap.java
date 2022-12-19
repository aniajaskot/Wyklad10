package exercise3;

import java.util.*;

public class CustomerMap {
    public static void main(String[] args) {

        Map<Long, Customer> customerMap = new HashMap<>();

        customerMap.put(1L, new Customer(1L, "Jan", "Kowalski", "022 022 022"));
        customerMap.put(5L, new Customer(5L, "Maria", "Kowalska", "022 022 023"));
        customerMap.put(3L, new Customer(3L, "Wojciech", "Abacki", "022 023 023"));

        Set<Long> keySet = customerMap.keySet();
        System.out.println(keySet);

        Collection<Customer> values = customerMap.values();
        System.out.println(values);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj id");
        long id = scanner.nextLong();
        scanner.close();

        boolean containsKey = customerMap.containsKey(id);
        if(containsKey){
            Customer customer = customerMap.get(id);
            System.out.println(customer);
        } else {
            System.out.println("Nie znaleziono klienta o podanym id");
        }

    }
}
