package Mapping.OneToOne;


import Mapping.OneToOne.Service.EmployeeOperations;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootJPAMapping {

    public static void main(String[] args) {

        ConfigurableApplicationContext container= SpringApplication.run(SpringBootJPAMapping.class);
        EmployeeOperations e=container.getBean(EmployeeOperations.class);
     //   e.addEmployee();

       // e.deleteEmployee(1201);

        e.getEmployeeInformation(1001);


    }
}
