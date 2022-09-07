package ru.netology;

public class Person {
    private String name;
    private String surname;
    private Integer tickets;

    public Person(String name, String surname, Integer tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getTickets() {
        return tickets;
    }

    public void ride() {
        this.tickets--;
    }
}
