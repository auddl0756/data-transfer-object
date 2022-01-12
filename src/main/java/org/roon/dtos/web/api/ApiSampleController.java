package org.roon.dtos.web.api;

import org.roon.dtos.web.SampleController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/api/sample")
@RestController
public class ApiSampleController {
    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    @PostMapping("/string")
    public String sampleString(@RequestBody String str) {
        logger.info("param : " + str);
        return str;
    }

    @PostMapping("/int")
    public int sampleInt(@RequestBody int num) {
        logger.info("param : " + num);
        return num;
    }
}
