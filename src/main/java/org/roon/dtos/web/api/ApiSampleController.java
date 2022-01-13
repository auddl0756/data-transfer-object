package org.roon.dtos.web.api;

import org.roon.dtos.web.SampleController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("/api/sample")
@RestController
public class ApiSampleController {
    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    @GetMapping("/string")
    public String sampleString(@RequestBody String str) {
        logger.info("param : " + str);
        return str;
    }

    // below makes
    // [org.springframework.web.HttpMediaTypeNotSupportedException: Content type 'text/plain;charset=UTF-8' not supported]
    @GetMapping("/int")
    public int sampleInt(@RequestBody int num) {
        logger.info("param : " + num);
        return num;
    }

    @GetMapping("/double")
    public double sampleDouble(@RequestBody double num) {
        logger.info("param : " + num);
        return num;
    }

    @GetMapping("/array")
    public List<Integer> sampleArray(@RequestBody List<Integer> params){
        StringBuilder sb = new StringBuilder();
        for(int param : params){
            sb.append(param).append(" ");
        }

        logger.info("params : " + sb.toString());

        return params;
    }

    @GetMapping("/simple_object")
    public String sampleObject(@RequestBody String strobj){
        logger.info("param : "+strobj);

        return strobj;
    }


}
