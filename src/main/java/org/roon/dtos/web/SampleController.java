package org.roon.dtos.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/sample")
@Controller
public class SampleController {

    @GetMapping
    public String sample() {
        return "sample/sample";
    }

    @GetMapping("/json")
    public String sampleJson() {
        return "sample/sampleJson";
    }

}
