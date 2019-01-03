package zjy.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author z845944350
 * @Date 2018/12/29 10:02
 * @Version 1.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{id}")
    public String getUserById(@PathVariable("id")Long id){

        return "得到ID为"+id+"的用户";
    }
}
