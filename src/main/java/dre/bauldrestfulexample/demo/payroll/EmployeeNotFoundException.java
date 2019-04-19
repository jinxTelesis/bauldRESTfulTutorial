package dre.bauldrestfulexample.demo.payroll;

public class EmployeeNotFoundException extends RuntimeException {

    EmployeeNotFoundException(Long id){
        super("Could not find employee " + id);
    }
}
