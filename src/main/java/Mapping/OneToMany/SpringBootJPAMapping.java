package Mapping.OneToMany;


import Mapping.OneToMany.Service.UserOperations;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootJPAMapping {

    public static void main(String[] args) {

        ConfigurableApplicationContext container = SpringApplication.run(SpringBootJPAMapping.class);
        UserOperations user=container.getBean(UserOperations.class);
       // user.addUser();
        user.getUserData(101);


    }
}
