package ru.s7;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.UnsupportedEncodingException;

@RequestMapping("")
@Controller
public class MainController {

    @RequestMapping(method = RequestMethod.GET, value = {"/","main"})
    public String initMain(ModelMap model) throws UnsupportedEncodingException {

        model.addAttribute("title","S7 test Title");

        return "main";
    }

}
