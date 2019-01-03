package zjy.newconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName NewConfigApplication
 * @Description TODO
 * @Author z845944350
 * @Date 2019/1/3 20:26
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class NewConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(NewConfigApplication.class,args);
    }
}
