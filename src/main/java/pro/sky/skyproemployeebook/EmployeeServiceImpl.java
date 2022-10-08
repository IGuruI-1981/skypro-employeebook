package pro.sky.skyproemployeebook;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> employees = new ArrayList<>(List.of( new Employee("Иванов", "Виктор"),
                                                        new Employee("Иванова", "Евгения"),
                                                        new Employee("Васильев","Илья")));

    public String hello() {
        return "HelloSkyPRO";
    }
    
    public String allEmployee() {
       return  employees.toString();
    }

//    @Override
//    public Employee addEmployee(String surname, String name) {
//        return null;
//    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void deleteEmployee(String firstName, String lastName) {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("employees.get(i) = " + employees.get(i));
        }
    }
}

//   public static void searchEmployee(String firstName, String lastName) throws EmployeeNotFoundException {
//
//    }



