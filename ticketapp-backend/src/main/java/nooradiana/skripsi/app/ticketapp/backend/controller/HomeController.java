package nooradiana.skripsi.app.ticketapp.backend.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @ResponseBody
    @RequestMapping(value = {"/", "/welcome", "/api"})
    public String home() {
        return "Welcome to Home";
    }
}
