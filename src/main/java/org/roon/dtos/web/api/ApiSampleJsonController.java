package org.roon.dtos.web.api;

import org.roon.dtos.web.SampleController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/sample/json")
@RestController
public class ApiSampleJsonController {
    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    @PostMapping("/int")
    public int sampleInt(@RequestBody int num) {
        logger.info("param : " + num);
        return num;
    }

    @PostMapping("/double")
    public double sampleDouble(@RequestBody double num) {
        logger.info("param : " + num);
        return num;
    }
}
