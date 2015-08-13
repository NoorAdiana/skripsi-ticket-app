package nooradiana.skripsi.app.ticketapp.backend.dao;

import nooradiana.skripsi.app.ticketapp.backend.entity.Cabang;

public interface CabangDao {
    public Cabang findCabangByKode(String kodeCabang);
}
