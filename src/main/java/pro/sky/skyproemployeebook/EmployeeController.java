package pro.sky.skyproemployeebook;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private EmployeeService employeeService = new EmployeeService();


 @GetMapping
    public String hello() {
        return employeeService.hello();
    }

//    @GetMapping(path = "/employee")
//    public String helloCalculator() {
//        return calculatorService.helloCalculator();
//    }

    @GetMapping(path = "/employee/add")
    public String addEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        return employeeService.addEmployee(firstName, lastName);
    }

//    @GetMapping(path = "/employee/delete")
//    public String addEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
//        return employeeService.deleteEmployee(firstName, lastName);
//    }
//
//    @GetMapping(path = "/employee/search")
//    public String addEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
//        return employeeService.searchEmployee(firstName, lastName);
//    }


}
