package nooradiana.skripsi.app.ticketapp.backend.entity;

import java.util.Date;

public class Jabatan {
    private Long id;
    private String kodeJabatan;
    private String namaJabatan;
    private Karyawan userUpdate;
    private Date dateUpdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKodeJabatan() {
        return kodeJabatan;
    }

    public void setKodeJabatan(String kodeJabatan) {
        this.kodeJabatan = kodeJabatan;
    }

    public String getNamaJabatan() {
        return namaJabatan;
    }

    public void setNamaJabatan(String namaJabatan) {
        this.namaJabatan = namaJabatan;
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
