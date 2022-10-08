package pro.sky.skyproemployeebook;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> employees = new ArrayList<>(List.of(new Employee("Иванов", "Виктор"),
            new Employee("Иванова", "Евгения"),
            new Employee("Васильев", "Илья")));

    public String hello() {
        return "HelloSkyPRO";
    }

    public String allEmployee() {
        return employees.toString();
    }

    @Override
    public String addEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        for (Employee employee1 : employees) {
            if (employee1.equals(employee)) {
                String addEmpl = "Такой сотрудник существует";
                return addEmpl;
            }
        }
        employees.add(employee);
        String addEmpl = employee.toString();
        return addEmpl;
    }

    @Override
    public String removeEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        for (Employee employee1 : employees) {
            if (employee1.equals(employee)) {
                employees.remove(employee1);
                String removeEmpl = employee.toString();
                return removeEmpl;
            }
        }
        String removeEmpl = "Такой сотрудник в базе отсутствует";
        return removeEmpl;
    }

    @Override
    public String findEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        for (Employee employee1 : employees) {
            if (employee1.equals(employee)) {
                String findEmpl = employee.toString();
                return findEmpl;
            }
        }
        String findEmpl = "Такого сотрудника нет";
        return findEmpl;
    }
}



