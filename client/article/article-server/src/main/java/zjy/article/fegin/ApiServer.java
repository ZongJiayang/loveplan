package zjy.article.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import zjy.article.fegin.error.ApiServiceError;

/**
 * @ClassName ApiServer
 * @Description TODO
 * @Author z845944350
 * @Date 2018/12/29 16:07
 * @Version 1.0
 **/
@FeignClient(value = "user",fallback = ApiServiceError.class)
public interface ApiServer {
    @GetMapping("/user/{id}")
    String getUserById(@PathVariable("id")Long id);
}
