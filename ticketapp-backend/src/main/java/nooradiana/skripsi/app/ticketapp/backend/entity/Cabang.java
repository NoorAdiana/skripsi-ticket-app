package nooradiana.skripsi.app.ticketapp.backend.entity;

import java.util.Date;

public class Cabang {
    private Long id;
    private String kodeCabang;
    private String namaCabang;
    private Karyawan userUpdate;
    private Date dateUpdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKodeCabang() {
        return kodeCabang;
    }

    public void setKodeCabang(String kodeCabang) {
        this.kodeCabang = kodeCabang;
    }

    public String getNamaCabang() {
        return namaCabang;
    }

    public void setNamaCabang(String namaCabang) {
        this.namaCabang = namaCabang;
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
