package controller;

import Service.Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
public class CarController {
    private static final String EN ="CARS";
    private static final String RU ="Ã¿ÿ»Õ€";
    Service service = new Service();
    @GetMapping(value ="/cars")
    public String printCars(ModelMap model, @RequestParam("locale") String locale) {
        if(locale!=null){
            if(locale.equals("en")){
                model.addAttribute("locale",EN);
            }
            else{
                model.addAttribute("locale",RU);
            }
        }
        else{
            model.addAttribute("locale",EN);
            List<String> listOfCars = new ArrayList<>();
            listOfCars = service.getCar();
            model.addAttribute("listOfCars",listOfCars);
            return "cars";
        }

        List<String> listOfCars = new ArrayList<>();
        listOfCars = service.getCar();
        model.addAttribute("listOfCars",listOfCars);
        return "cars";
    }
}
