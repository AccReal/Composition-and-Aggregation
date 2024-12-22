// Класс Engine является частью Car. Это пример композиции.
class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

// Класс Car владеет объектом Engine.
class Car {
    private String model;
    private Engine engine;

    public Car(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType); // Создание нового объекта Engine.
    }

    public void showDetails() {
        System.out.println("Car model: " + model);
        System.out.println("Engine type: " + engine.getType());
    }
}

// Тестовый класс
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla Model S", "Electric");
        car.showDetails();
    }
}
