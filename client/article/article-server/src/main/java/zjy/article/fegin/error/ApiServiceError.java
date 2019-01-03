package zjy.article.fegin.error;

import org.springframework.stereotype.Component;
import zjy.article.fegin.ApiServer;

/**
 * @ClassName ApiServiceError
 * @Description TODO
 * @Author z845944350
 * @Date 2018/12/29 16:09
 * @Version 1.0
 **/
@Component
public class ApiServiceError implements ApiServer {

    @Override
    public String getUserById(Long id) {
        return "服务器异常";
    }
}
