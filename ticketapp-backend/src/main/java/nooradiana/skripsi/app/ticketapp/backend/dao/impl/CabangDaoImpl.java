package nooradiana.skripsi.app.ticketapp.backend.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.sql.DataSource;
import nooradiana.skripsi.app.ticketapp.backend.dao.CabangDao;
import nooradiana.skripsi.app.ticketapp.backend.entity.Cabang;
import nooradiana.skripsi.app.ticketapp.backend.entity.Karyawan;

public class CabangDaoImpl implements CabangDao{
    
    private DataSource dataSource;

    public CabangDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    
    @Override
    public Cabang findCabangByKode(String kodeCabang) {
        try {
            Connection c = dataSource.getConnection();
            String sql = "SELECT * FROM Cabang WHERE KodeCabang = ?";
            
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, kodeCabang);
            
            ResultSet rs = ps.executeQuery();
            if(!rs.next()){
                return null;
            }
            
            Karyawan userUpdate = new Karyawan();
            userUpdate.setNama(rs.getString("UserUpdate"));
            
            Cabang cabang = new Cabang();
            cabang.setId(rs.getLong("Id"));
            cabang.setKodeCabang(rs.getString("KodeCabang"));
            cabang.setNamaCabang(rs.getString("NamaCabang"));
            cabang.setUserUpdate(userUpdate);
            cabang.setDateUpdate((Date) rs.getDate("DateUpdate"));
            
            return cabang;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
