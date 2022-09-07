import ru.netology.Person;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        Queue<Person> qRide = new LinkedList<>(generateClients());
        while (!qRide.isEmpty()) {
            for (Person person : qRide) {
                System.out.println(person.getName() + " " + person.getSurname() + " rode the attraction! Tickets left " + person.getTickets());
            }
            Person first = qRide.poll();
            first.ride();
            if (first.getTickets() > 0) qRide.add(first);
            System.out.println();
        }
    }

    protected static List<Person> generateClients() {
        List<Person> clients = new LinkedList<>();
        clients.add(new Person("Harry", "Potter", 22));
        clients.add(new Person("Ron", "Weasley", 5));
        clients.add(new Person("Hermione", "Granger", 17));
        clients.add(new Person("Snape", "Severus", 25));
        clients.add(new Person("Albus", "Dumbledore", 20));
        return clients;
    }
}


