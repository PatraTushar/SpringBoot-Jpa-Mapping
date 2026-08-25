package Mapping.OneToOne.Service;


import Mapping.OneToOne.Entity.Address;
import Mapping.OneToOne.Entity.Employee;
import Mapping.OneToOne.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EmployeeOperations {


    @Autowired
    EmployeeRepository employeeRepository;

    public void addEmployee() {

        Address address = new Address();
        address.setCity("Rajasthan");
        address.setPinCode(123456);
        address.setCountry("India");


        Employee emp = new Employee();

        emp.setEmpName("shweta");
        emp.setGender("Female");
        emp.setAddress(address);

        employeeRepository.save(emp);
    }


    // Delete employeeId

    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }


    // Find/Load
    public void getEmployeeInformation(Integer id) {
        Optional<Employee> emp = employeeRepository.findById(id);
        if (emp.isPresent()) {
            Employee e = emp.get();
            System.out.println("Employee Information" + e);
        }
    }


}
