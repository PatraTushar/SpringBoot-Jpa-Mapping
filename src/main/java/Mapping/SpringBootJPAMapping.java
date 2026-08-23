package Mapping;


import Mapping.Service.EmployeeOperations;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootJPAMapping {

    public static void main(String[] args) {

        ConfigurableApplicationContext container= SpringApplication.run(SpringBootJPAMapping.class);
        EmployeeOperations e=container.getBean(EmployeeOperations.class);
        e.addEmployee();


    }
}
