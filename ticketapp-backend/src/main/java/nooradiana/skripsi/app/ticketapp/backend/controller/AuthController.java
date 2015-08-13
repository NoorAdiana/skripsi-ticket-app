package nooradiana.skripsi.app.ticketapp.backend.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.servlet.http.HttpServletRequest;
import nooradiana.skripsi.app.ticketapp.backend.entity.Karyawan;
import nooradiana.skripsi.app.ticketapp.backend.helper.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = {"/api/auth"})
public class AuthController {
    
    private Gson gson = new GsonBuilder().setDateFormat("yyyy-mm-dd").create();
        
    @ResponseBody
    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public String login(HttpServletRequest servletRequest, @RequestBody String json){ 
        Karyawan user = gson.fromJson(json, Karyawan.class);
        return user.getPassword();
    }
}
