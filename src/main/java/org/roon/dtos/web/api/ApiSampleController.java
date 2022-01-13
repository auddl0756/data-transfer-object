package org.roon.dtos.web.api;

import lombok.RequiredArgsConstructor;
import org.roon.dtos.web.SampleController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/sample")
@RestController
public class ApiSampleController {
    Logger logger = LoggerFactory.getLogger(ApiSampleController.class);

    @GetMapping("/string")
    public String sampleString(@RequestParam String str) {
        logger.info("param = "+str);
        return str;
    }

    @GetMapping("/int")
    public int sampleInt(@RequestParam int num) {
        logger.info("param = "+num);
        return num;
    }

//    @GetMapping("/double")
//    public double sampleDouble(@RequestBody double num) {
//        return num;
//    }

    @GetMapping("/array")
    public List<Integer> sampleArray(@RequestParam List<Integer> params) {
        logger.info("params = "+params);
        return params;
    }

    @GetMapping("/simple_object")
    public String sampleObject(@RequestParam String strobj){
        logger.info("params = "+strobj);
        return strobj;
    }


}
