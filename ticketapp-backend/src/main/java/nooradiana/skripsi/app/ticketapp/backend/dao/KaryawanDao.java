package nooradiana.skripsi.app.ticketapp.backend.dao;

import nooradiana.skripsi.app.ticketapp.backend.entity.Karyawan;

public interface KaryawanDao {
    public Karyawan findKaryawanByUsername(String username);
}
