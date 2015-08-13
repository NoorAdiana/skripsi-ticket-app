package nooradiana.skripsi.app.ticketapp.backend.dao;

import nooradiana.skripsi.app.ticketapp.backend.entity.Jabatan;

public interface JabatanDao {
    public Jabatan findJabatanByKode(String kodeJabatan);
}
