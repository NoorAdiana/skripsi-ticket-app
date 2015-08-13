package nooradiana.skripsi.app.ticketapp.backend.dao;

import nooradiana.skripsi.app.ticketapp.backend.entity.Group;

public interface GroupDao {
    public Group findGroupByKode(String kodeGroup);
}
