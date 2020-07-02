package Car;

public class Car {
    public String model;
    public String name;
    public String HorsePower;

    public Car(String model, String name, String horsePower) {
        this.model = model;
        this.name = name;
        HorsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHorsePower() {
        return HorsePower;
    }

    public void setHorsePower(String horsePower) {
        HorsePower = horsePower;
    }

    public Car() {
    }
}
