package nooradiana.skripsi.app.ticketapp.backend.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.sql.DataSource;
import nooradiana.skripsi.app.ticketapp.backend.dao.GroupDao;
import nooradiana.skripsi.app.ticketapp.backend.entity.Cabang;
import nooradiana.skripsi.app.ticketapp.backend.entity.Group;
import nooradiana.skripsi.app.ticketapp.backend.entity.Karyawan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("groupDao")
public class GroupDaoImpl implements GroupDao{
    @Autowired
    private DataSource dataSource;

    @Override
    public Group findGroupByKode(String kodeGroup) {
        try {
            Connection c = dataSource.getConnection();
            String sql = "SELECT * FROM Group WHERE kodeGroup = ?";
            
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, kodeGroup);
            
            ResultSet rs = ps.executeQuery();
            if(!rs.next()){
                return null;
            }
            
            Karyawan userUpdate = new Karyawan();
            userUpdate.setNama(rs.getString("UserUpdate"));
            
            Group group = new Group();
            group.setId(rs.getLong("Id"));
            group.setKodeGroup(rs.getString("KodeGroup"));
            group.setNamaGroup(rs.getString("NamaGroup"));
            group.setUserUpdate(userUpdate);
            group.setDateUpdate(rs.getDate("DateUpdate"));
            
            return group;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
