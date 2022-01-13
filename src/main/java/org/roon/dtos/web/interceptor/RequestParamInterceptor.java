package org.roon.dtos.web.interceptor;

import org.roon.dtos.web.SampleController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.Map;

public class RequestParamInterceptor implements HandlerInterceptor {
    private final Logger logger = LoggerFactory.getLogger(Object.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("request uri = "+request.getRequestURI());
        Map<String,String[]> paramMap = request.getParameterMap();

        String res = "";
        for(Map.Entry<String,String[]> entry : paramMap.entrySet()){
            res += entry.getKey()+" : ";
            for(String value : entry.getValue()){
                res += value+", ";
            }
            res+="\n";
        }

        logger.info(res);

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }
}
