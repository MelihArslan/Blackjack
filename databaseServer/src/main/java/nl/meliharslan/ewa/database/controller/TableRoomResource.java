package nl.meliharslan.ewa.database.controller;

import nl.meliharslan.ewa.database.domein.TableRoom;
import nl.meliharslan.ewa.database.service.TableRoomService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tableroom")
public class TableRoomResource {
    private final TableRoomService tableRoomService;

    public TableRoomResource(TableRoomService tableRoomService) {
        this.tableRoomService = tableRoomService;
    }

    //  GET methode -> return all of tableRoom
    @GetMapping("/all")
    public ResponseEntity<List<TableRoom>> getAllTableRoom() {
        // call the service and then return
        List<TableRoom> tableRoomList = tableRoomService.findAllTableRoom();
        // user will know they got 200 response
        return new ResponseEntity<>(tableRoomList, HttpStatus.OK);
    }

    // GET methode -> return id of TableRoom
    @GetMapping("/find/{id}")
    public ResponseEntity<TableRoom> getTableById(@PathVariable("id") Long id) {
        TableRoom tableRoom = tableRoomService.findTableRoomById(id);
        return new ResponseEntity<>(tableRoom, HttpStatus.OK);
    }

    // Add methode -> Post request methode
    @PostMapping("/add")
    public ResponseEntity<TableRoom> addTableRoom(@RequestBody TableRoom tableRoom) {
        TableRoom tableRoom1 = tableRoomService.addTableRoom(tableRoom);
        return new ResponseEntity<>(tableRoom1, HttpStatus.CREATED);
    }

    // Update methode -> Put mapping
    @PutMapping("/update")
    public ResponseEntity<TableRoom> updateTableRoom(@RequestBody TableRoom tableRoom){
        TableRoom updateTableRoom = tableRoomService.updateTableRoom(tableRoom);
        return new ResponseEntity<>(updateTableRoom,HttpStatus.OK);
    }

    // Delete methode -> ? return nothing
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteTableRoom(@PathVariable("id")Long id){
        tableRoomService.deleteTableRoom(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
