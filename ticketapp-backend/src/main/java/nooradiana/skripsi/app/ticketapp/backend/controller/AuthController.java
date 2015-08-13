package nooradiana.skripsi.app.ticketapp.backend.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.servlet.http.HttpServletRequest;
import nooradiana.skripsi.app.ticketapp.backend.dao.impl.CabangDaoImpl;
import nooradiana.skripsi.app.ticketapp.backend.dao.impl.KaryawanDaoImpl;
import nooradiana.skripsi.app.ticketapp.backend.entity.Cabang;
import nooradiana.skripsi.app.ticketapp.backend.entity.Karyawan;
import nooradiana.skripsi.app.ticketapp.backend.helper.KoneksiDatabase;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = {"/api/auth"})
public class AuthController {
    
    private Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        
    @ResponseBody
    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public String login(HttpServletRequest servletRequest, @RequestBody String json){ 
        Karyawan user = gson.fromJson(json, Karyawan.class);
        
        KaryawanDaoImpl karyawanDao = new KaryawanDaoImpl(KoneksiDatabase.getMysqlDataSource());
        
        Karyawan userLogin = new Karyawan();
        userLogin.setUsername(karyawanDao.findKaryawanByUsername(user.getUsername()).getUsername());
        userLogin.setNama(karyawanDao.findKaryawanByUsername(user.getUsername()).getNama());
        userLogin.setEmail(karyawanDao.findKaryawanByUsername(user.getUsername()).getEmail());
        userLogin.setStatus(karyawanDao.findKaryawanByUsername(user.getUsername()).getStatus());
        
        return gson.toJson(userLogin);
    }
    
}
