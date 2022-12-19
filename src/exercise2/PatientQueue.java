package exercise2;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    public static void main(String[] args) {
        Queue<Patient> patients = new LinkedList<>();

        patients.offer(new Patient("Jan", "Kowalski", "123456789"));
        patients.offer(new Patient("Maria", "Zawadzka", "567891234"));
        patients.offer(new Patient("Wojciech", "Abacki", "987654321"));

        while (!patients.isEmpty()){
            Patient patient = patients.poll();
            System.out.println(patient + " proszony do gabinetu");
            System.out.println(patient + " obsłużony");

            System.out.println("W kolejce zostało " + patients.size() + " osób");
        }

        System.out.println("Brak osób w kolejce");
    }
}
