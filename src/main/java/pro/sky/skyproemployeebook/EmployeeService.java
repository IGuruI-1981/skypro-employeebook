package pro.sky.skyproemployeebook;

public interface EmployeeService {

    String hello();

    String allEmployee();

    String addEmployee(String firstName, String lastName);

    String removeEmployee(String firstName, String lastName);

    String findEmployee(String firstName, String lastName);
}
