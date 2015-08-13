package nooradiana.skripsi.app.ticketapp.backend.entity;

import java.util.Date;

public class Karyawan {
    private Long id;
    private String username;
    private String password;
    private String nama;
    private String email;
    private Jabatan kodeJabatan;
    private Cabang kodeCabang;
    private Group kodeGroup;
    private int status;
    private Karyawan userUpdate;
    private Date dateUpdate;
    private String secretKey;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Jabatan getKodeJabatan() {
        return kodeJabatan;
    }

    public void setKodeJabatan(Jabatan kodeJabatan) {
        this.kodeJabatan = kodeJabatan;
    }

    public Cabang getKodeCabang() {
        return kodeCabang;
    }

    public void setKodeCabang(Cabang kodeCabang) {
        this.kodeCabang = kodeCabang;
    }

    public Group getKodeGroup() {
        return kodeGroup;
    }

    public void setKodeGroup(Group kodeGroup) {
        this.kodeGroup = kodeGroup;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
