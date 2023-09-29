package com.example.smthtasksspringmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.LinkedHashSet;
import java.util.Set;

@Controller
public class MVController {

    Set<Record> sales = new LinkedHashSet<>();
    Set<Employee> employees = new LinkedHashSet<>();



    @GetMapping("shows")
    public String getShows(Model model) {
        model.addAttribute("bb", new Show("Breaking Bad", "Ozymandias", "10.0"));
        model.addAttribute("aot1", new Show("Attack on Titan", "Hero", "9.9"));
        model.addAttribute("aot2", new Show("Attack on Titan", "Perfect Game", "9.9"));
        model.addAttribute("sw", new Show("Star Wars: The Clone Wars", "Victory and Death", "9.9"));
        model.addAttribute("mr", new Show("Mr. Robot", "407 Proxy Authentication Required", "9.9"));
        return "shows";
    }

    @GetMapping("conditionals")

    public String getConditionals(Model model) {
        model.addAttribute("cond", 150);
        model.addAttribute("product", "chair");
        return "conditionals";
    }

    @GetMapping("signs")
    public String getSigns(Model model) {
        model.addAttribute("sign", 100);
        return "signs";
    }

    @GetMapping("dealer")
    public String getDeal(Model model) {
        model.addAttribute("budget", 1500);
        model.addAttribute("make", "ford");
        model.addAttribute("toyota", new Car("Toyota Corolla", 5000));
        model.addAttribute("volkswagen", new Car("Volkswagen Jetta", 6000));
        model.addAttribute("ford", new Car("Ford Escape", 7000));
        model.addAttribute("honda", new Car("Honda Civic", 8000));
        return "dealer";
    }

    @GetMapping("view")
    public String getView(Model model) {
        model.addAttribute("menu", "We sell chocolate rice cakes bubble tea");
        return "view";
    }

    @GetMapping("name")
    public String getName(Model model) {
        model.addAttribute("myName", "Ilya");
        return "name";
    }

    @GetMapping("home")
    public String getHome() {
        return "home";
    }

    @GetMapping("away")
    public String getAway() {
        return "away";
    }

    @GetMapping("employee")
    public String getEmployee(Model model) {
        employees.add(new Employee("Jim Halpert", 32, "Salesman"));
        employees.add(new Employee("Andy Bernard", 38, "Salesman"));
        employees.add(new Employee("Pam Beesly", 32, "Receptionist"));
        employees.add(new Employee("Michael Scott", 49, "Regional Manager"));
        employees.add(new Employee("Ryan Howard", 28, "Temp"));
        employees.add(new Employee("Angela Martin", 35, "Accountant"));
        employees.add(new Employee("Dwight Schrute", 37, "Assistant to the Regional Manager"));

        model.addAttribute("employees", employees);
        return "employee";
    }

    @GetMapping("sales")
    public String getSales(Model model) {
        sales.add(new Record("Chair", 20.99, 5.99));
        sales.add(new Record("Table", 40.99, 8.99));
        sales.add(new Record("Couch", 100.99, 105.99));
        sales.add(new Record("Fridge", 200.99, 59.99));
        sales.add(new Record("Bed", 150.99, 205.99));

        model.addAttribute("sales",sales);

        return "sales";
    }
}
