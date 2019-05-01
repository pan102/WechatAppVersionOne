package Controller;

import Entity.User;
import Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@RestController
public class TestController {

    private UserRepository userRepository;

    @RequestMapping("/")
    String test(){
        return "helloee";
    }
    @PostMapping("/login")
    public String save(@RequestParam String name,@RequestParam String openid,@RequestParam String city){
        User user=new User();
        user.setName(name);
        user.setOpenid(openid);
        user.setCity(city);
        //userRepository.save(user);
        return user.toString();
    }
    @PostMapping("/")

public static void main(String[] args){
        SpringApplication.run(TestController.class);
    }
}