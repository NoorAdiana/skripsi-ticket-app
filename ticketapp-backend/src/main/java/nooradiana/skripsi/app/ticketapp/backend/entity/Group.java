package nooradiana.skripsi.app.ticketapp.backend.entity;

import java.util.Date;

public class Group {
    private Long id;
    private String kodeGroup;
    private String namaGroup;
    private Karyawan userUpdate;
    private Date dateUpdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKodeGroup() {
        return kodeGroup;
    }

    public void setKodeGroup(String kodeGroup) {
        this.kodeGroup = kodeGroup;
    }

    public String getNamaGroup() {
        return namaGroup;
    }

    public void setNamaGroup(String namaGroup) {
        this.namaGroup = namaGroup;
    }

    public Karyawan getUserUpdate() {
        return userUpdate;
    }

    public void setUserUpdate(Karyawan userUpdate) {
        this.userUpdate = userUpdate;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }
}
