package nooradiana.skripsi.app.ticketapp.backend.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.sql.DataSource;
import nooradiana.skripsi.app.ticketapp.backend.dao.JabatanDao;
import nooradiana.skripsi.app.ticketapp.backend.entity.Jabatan;
import nooradiana.skripsi.app.ticketapp.backend.entity.Karyawan;

public class JabatanDaoImpl implements JabatanDao{
    
    private DataSource dataSource;

    @Override
    public Jabatan findJabatanByKode(String kodeJabatan) {
        try {
            Connection c = dataSource.getConnection();
            String sql = "SELECT * FROM Jabatan WHERE kodeJabatan = ?";
            
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, kodeJabatan);
            
            ResultSet rs = ps.executeQuery();
            if(!rs.next()){
                return null;
            }
            
            Karyawan userUpdate = new Karyawan();
            userUpdate.setNama(rs.getString("UserUpdate"));
            
            Jabatan jabatan = new Jabatan();
            jabatan.setId(rs.getLong("Id"));
            jabatan.setKodeJabatan(rs.getString("KodeJabatan"));
            jabatan.setNamaJabatan(rs.getString("NamaJabatan"));
            jabatan.setUserUpdate(userUpdate);
            jabatan.setDateUpdate((Date) rs.getDate("DateUpdate"));
            
            return jabatan;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
