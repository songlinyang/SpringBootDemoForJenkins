package cn.com.rxyb;

/**
 * Created by Administrator on 2020/1/7.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
/**
 * Created by Administrator on 2020/1/7.
 */

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})

public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
