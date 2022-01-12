package org.roon.dtos.web.api;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.roon.dtos.web.SampleController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @PostMapping("/array")
    public List<String> sampleArray(@RequestBody List<String> params){
        StringBuilder sb = new StringBuilder();
        for(String param : params){
            sb.append(param).append(" ");
        }

        logger.info("params : " + sb.toString());

        return params;
    }

    @PostMapping("/simple_object")
    public Object sampleObject(@RequestBody Object param){
        logger.info("param : " + param);
        SampleObjDTO dto = (SampleObjDTO) param;

        logger.info(dto.toString());
        return param;
    }

    @ToString
    @Setter
    @Getter
    static class SampleObjDTO{
        private String name;
        private String value;
        private String str;
    }
}
