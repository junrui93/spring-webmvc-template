package junrui.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/")
    public String anyFunctionName(Map<String, Object> model) {
        logger.debug("in anyFunctionName");
        model.put("message", "Hello, world!");
        return "hello.jsp"; // view name
    }

    @RequestMapping("/hello/{name}")
    public ModelAndView anyFunctionName2(@PathVariable String name) {
        logger.debug("in anyFunctionName2");
        ModelAndView model = new ModelAndView();
        model.setViewName("hello.jsp");
        model.addObject("message", String.format("Hello, %s!", name));
        return model;
    }
}
