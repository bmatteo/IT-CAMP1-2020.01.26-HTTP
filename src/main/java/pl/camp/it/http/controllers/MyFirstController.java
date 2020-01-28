package pl.camp.it.http.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyFirstController {

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/mojaFajnaStrona", method = RequestMethod.POST)
    public String metoda2() {
        return "abc";
    }

    @RequestMapping(value = "/mojaFajnaStrona2", method = RequestMethod.POST)
    public String metoda3() {
        return "abc";
    }
}
