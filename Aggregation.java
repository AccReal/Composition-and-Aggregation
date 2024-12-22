// Класс Address может существовать независимо от Employee.
class Address {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}

// Класс Employee использует объект Address. Это пример агрегации.
class Employee {
    private String name;
    private Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address; // Ссылка на существующий объект Address.
    }

    public void showDetails() {
        System.out.println("Employee name: " + name);
        System.out.println("City: " + address.getCity());
    }
}

// Тестовый класс
public class Main {
    public static void main(String[] args) {
        Address address = new Address("New York");
        Employee employee = new Employee("John Doe", address);
        employee.showDetails();
    }
}
