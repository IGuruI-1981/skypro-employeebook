package pro.sky.skyproemployeebook;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee/")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }




 @GetMapping(path = "/hello")
    public String hello() {
        return employeeService.hello();
    }

    @GetMapping(path = "/allEmployee")                                         //все сотрудники
    public String allEmployee() {
     return employeeService.allEmployee();
    }

    @GetMapping(path = "/add")                                         //добавление сотрудника
    public String addEmployee(@RequestParam("firstName") String firstName,
                              @RequestParam("lastName") String lastName) {
        Employee employee = new Employee(firstName, lastName);
        employeeService.addEmployee(employee);
        return "Employee added" ;
    }

    @GetMapping(path = "/delete")                                      // удаление сотрудника
    public String deleteEmployee(@RequestParam("firstName") String firstName,
                                 @RequestParam("lastName") String lastName) {
     employeeService.deleteEmployee(firstName, lastName);

        return "Employee deleted";
    }

//    @GetMapping(path = "/search")                                         // поиск сотрудника
//    public String addEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
//        return employeeService.searchEmployee(firstName, lastName);
//    }


}
