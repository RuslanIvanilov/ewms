package ru.s7;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.s7.props.AppProperty;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

@RequestMapping("")
@Controller
public class MainController {

    Properties properties;

    private void initProperties(){
        properties = AppProperty.getInstance();
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/","main"})
    public String initMain(ModelMap model) throws UnsupportedEncodingException {
        initProperties();
        model.addAttribute("main-frame-title",properties.getProperty("main-frame-title"));

        return "main";
    }

}
