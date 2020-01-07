package cn.com.rxyb;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2020/1/7.
 */

@RestController
public class TestController {

    @GetMapping("hello")
    public String helloword() {
        return "Hello Spring Boot!";
    }

    @GetMapping("hello2")
    public String helloword2(){
        return "Hello Spring Boot2!";
    }
}
