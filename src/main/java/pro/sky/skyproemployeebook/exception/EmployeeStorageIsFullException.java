package pro.sky.skyproemployeebook.exception;

public class EmployeeStorageIsFullException extends RuntimeException{           //массив сотрудников переполнен
    public EmployeeStorageIsFullException(String message) {
        super(message);
    }
}
