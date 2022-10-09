package pro.sky.skyproemployeebook;

import org.springframework.stereotype.Service;
import pro.sky.skyproemployeebook.exception.EmployeeAlreadyAddedException;
import pro.sky.skyproemployeebook.exception.EmployeeNotFoundException;
import pro.sky.skyproemployeebook.exception.EmployeeStorageIsFullException;

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
                throw new EmployeeAlreadyAddedException("Такой сотрудник уже есть ");
            }
        }
        if (employees.size() == 10) {
            throw new EmployeeStorageIsFullException("Массив переполнен");
        }else {
        employees.add(employee);
        String addEmpl = employee.toString();
        return addEmpl;
        }
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
        throw new EmployeeNotFoundException("Сотрудник не найден") ;

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
        throw new EmployeeNotFoundException("Сотрудник не найден") ;
    }
}



