package org.roon.dtos.web.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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

import java.util.ArrayList;
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
    public String sampleObject(@RequestBody String param) throws JsonProcessingException, JsonMappingException {
        logger.info("param : " + param);
//        SampleObjDTO dto = (SampleObjDTO) param;    // target type에 대한 정보가 없어서 Jackson의 default type인 LinkedHashMap을 쓰는 것이라 함..
        ObjectMapper objectMapper = new ObjectMapper();

        SampleObjDTO dto = objectMapper.readValue(param,SampleObjDTO.class);

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

    @PostMapping("/list_object")
    public void sampleListObject(@RequestBody String params) throws Exception{
        logger.info("params : "+params);
        ObjectMapper objectMapper = new ObjectMapper();

        List<SampleObjDTO> dtos = objectMapper.readValue(params, new TypeReference<List<SampleObjDTO>>() {});

        for(SampleObjDTO dto : dtos){
            System.out.println(dto);
        }

    }

}
