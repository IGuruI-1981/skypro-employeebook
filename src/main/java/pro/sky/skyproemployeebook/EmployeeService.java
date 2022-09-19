package pro.sky.skyproemployeebook;

import java.util.List;

public class EmployeeService  {
    List<Employee> employees = List.of( new Employee("Иванов", "Виктор"),
                                        new Employee("Иванова", "Евгения"),
                                        new Employee("Васильев","Илья"));

    public String hello() {
        return "HelloSkyPRO";
    }

    public String addEmployee(String firstName, String lastName) {
        ;
        return "Добавлен новый сотрудник - " + firstName + " " + lastName;
    }

//    public static void deleteEmployee(String firstName, String lastName) {
//
//    }
//
//    public static void searchEmployee(String firstName, String lastName) {
//
//    }

}


