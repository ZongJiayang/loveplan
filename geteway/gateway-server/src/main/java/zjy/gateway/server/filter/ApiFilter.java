package zjy.gateway.server.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName 网关过滤器
 * @Description 网关过滤器
 * @Author z845944350
 * @Date 2018/12/29 10:38
 * @Version 1.0
 **/
@Component
@Slf4j
public class ApiFilter extends ZuulFilter {
    /**
     * filterType 为过滤类型 。
     * @return pre（路由之前）、routing（路由之时）、post（路由之后）、error（发生错误时调用）
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 为过滤的顺序，如果有多个过滤器，则数字越小越先执行
     * @return 数字
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     *表示是否过滤，这里可以做逻辑判断，
     * @return true 为过滤，false 不过滤
     */
    @Override
    public boolean shouldFilter() {
        return false;
    }

    /**
     * 为过滤器执行的具体逻辑，在这里可以做很多事情，比如：权限判断、合法性校验等。
     * @return 比如：权限判断、合法性校验等。
     * @throws ZuulException 异常
     */
    @Override
    public Object run() throws ZuulException {
        //这里写校验代码
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getParameter("token");
        log.info("得到的token:{}",token);
        return null;
    }
}
