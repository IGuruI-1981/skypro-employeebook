package pro.sky.skyproemployeebook;

public interface EmployeeService {

    String hello();

    String allEmployee();

//    Employee addEmployee(String surname, String name);

    void addEmployee(Employee employee);

    void deleteEmployee(String firstName, String lastName);

}
