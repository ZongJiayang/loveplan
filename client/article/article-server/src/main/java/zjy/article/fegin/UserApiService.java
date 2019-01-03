package zjy.article.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName UserApiService
 * @Description TODO
 * @Author z845944350
 * @Date 2018/12/29 14:35
 * @Version 1.0
 **/
@FeignClient(value = "user")
public interface UserApiService {

    @GetMapping("/user/{id}")
    String getUserById(@PathVariable("id")Long id);
}
