public class Person {
    private String name;
    private Address address;

    public Person() {
        this.address = new Address();
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}
