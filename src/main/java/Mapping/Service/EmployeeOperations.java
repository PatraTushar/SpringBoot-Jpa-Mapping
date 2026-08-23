package Mapping.Service;


import Mapping.Entity.Address;
import Mapping.Entity.Employee;
import Mapping.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeOperations {


    @Autowired
    EmployeeRepository employeeRepository;

    public void  addEmployee(){

        Address address=new Address();
        address.setCity("Hyderabad");
        address.setPinCode(500341);
        address.setCountry("India");


        Employee emp=new Employee();
        emp.setEmpName("Dilip");
        emp.setGender("Male");
        emp.setAddress(address);

        employeeRepository.save(emp);
    }


}
