package web.controller;

import Car.Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    Service service = new Service();
    @GetMapping(value = "/cars")
    public String printCars(ModelMap model) {
        List<String> listOfCars = new ArrayList<>();
        listOfCars = service.getCar();
        model.addAttribute("listOfCars",listOfCars);
        return "cars";
    }
}
