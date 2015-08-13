package nooradiana.skripsi.app.ticketapp.backend.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.sql.DataSource;
import nooradiana.skripsi.app.ticketapp.backend.dao.KaryawanDao;
import nooradiana.skripsi.app.ticketapp.backend.entity.Cabang;
import nooradiana.skripsi.app.ticketapp.backend.entity.Group;
import nooradiana.skripsi.app.ticketapp.backend.entity.Jabatan;
import nooradiana.skripsi.app.ticketapp.backend.entity.Karyawan;

public class KaryawanDaoImpl implements KaryawanDao{

    private DataSource dataSource;

    public KaryawanDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    
    @Override
    public Karyawan findKaryawanByUsername(String username) {
        try {
            Connection c = dataSource.getConnection();
            String sql = "SELECT * FROM Karyawan WHERE username = ?";
            
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, username);
            
            ResultSet rs = ps.executeQuery();
            if(!rs.next()){
                return null;
            }
            
            Karyawan userUpdate = new Karyawan();
            userUpdate.setNama(rs.getString("UserUpdate"));
            
            Cabang cabang = new Cabang();
            cabang.setKodeCabang(rs.getString("KodeCabang"));
            
            Jabatan jabatan = new Jabatan();
            jabatan.setKodeJabatan(rs.getString("KodeJabatan"));
            
            Group group = new Group();
            group.setKodeGroup(rs.getString("KodeGroup"));
            
            Karyawan user = new Karyawan();
            user.setId(rs.getLong("Id"));
            user.setUsername(rs.getString("Username"));
            user.setPassword(rs.getString("Password"));
            user.setNama(rs.getString("Nama"));
            user.setEmail(rs.getString("Email"));
            user.setKodeJabatan(jabatan);
            user.setKodeCabang(cabang);
            user.setKodeGroup(group);
            user.setStatus(rs.getInt("Status"));
            user.setUserUpdate(userUpdate);
            user.setDateUpdate(rs.getDate("DateUpdate"));
            user.setSecretKey(rs.getString("SecretKey"));
            
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
