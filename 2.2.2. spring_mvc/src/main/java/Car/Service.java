package Car;

import java.util.ArrayList;
import java.util.List;

public class Service {
    public List<String> getCar(){
        Car car = new Car();
        Car car1 = new Car();
        Car car2 = new Car();

        car.setHorsePower("200");
        car1.setHorsePower("150");
        car2.setHorsePower("300");

        car.setModel("Q7");
        car1.setModel("CLS 63");
        car2.setModel("E60");

        car.setName("AUDI");
        car1.setName("M");
        car2.setName("BMW");

        List<String> listOfCars = new ArrayList<>();
        listOfCars.add(car.getName()+car.getModel()+car.getHorsePower());
        listOfCars.add(car1.getName()+" " +car1.getModel() + " " +car1.getHorsePower());
        listOfCars.add(car2.getName()+" " +car2.getModel() +" " + car2.getHorsePower());
        return listOfCars;
    }
}
