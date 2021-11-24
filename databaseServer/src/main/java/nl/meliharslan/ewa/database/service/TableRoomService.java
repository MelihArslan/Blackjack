package nl.meliharslan.ewa.database.service;

import nl.meliharslan.ewa.database.domein.TableRoom;
import nl.meliharslan.ewa.database.exception.UserNotFoundException;
import nl.meliharslan.ewa.database.repo.TableRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TableRoomService {
    private final TableRoomRepo tableRoomRepo;

    @Autowired
    public TableRoomService(TableRoomRepo tableRoomRepo) {
        this.tableRoomRepo = tableRoomRepo;
    }

    // add methode
    public TableRoom addTableRoom(TableRoom tableRoom) {
        tableRoom.setRoomCode(UUID.randomUUID().toString());
        // save table met repo
        return tableRoomRepo.save(tableRoom);
    }

    // list of tableRoom
    public List<TableRoom> findAllTableRoom() {
        return tableRoomRepo.findAll();
    }

    // update of tableRoom
    public TableRoom updateTableRoom(TableRoom tableRoom) {
        return tableRoomRepo.save(tableRoom);
    }

    // find table by id
    public TableRoom findTableRoomById(Long id) {
        return tableRoomRepo.findTableRoomById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + "was not found"));
    }

    // delete of tableRoom
    public void deleteTableRoom(Long id) {
        tableRoomRepo.deleteTableRoomById(id);
    }
}
