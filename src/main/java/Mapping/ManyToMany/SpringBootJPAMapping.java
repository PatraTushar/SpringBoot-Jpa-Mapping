package Mapping.ManyToMany;

import Mapping.ManyToMany.Service.EmployeeManagement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBootJPAMapping {

    public static void main(String[] args) {

        ConfigurableApplicationContext container= SpringApplication.run(SpringBootJPAMapping.class);
       EmployeeManagement e1= container.getBean(EmployeeManagement.class);
       e1.addEmployee();

    }
}
