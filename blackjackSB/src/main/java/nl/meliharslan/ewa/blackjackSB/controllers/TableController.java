package nl.meliharslan.ewa.blackjackSB.controllers;

import nl.meliharslan.ewa.blackjackSB.models.GameTable;
import nl.meliharslan.ewa.blackjackSB.services.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/table")
public class TableController {
    private final TableService tableService;

    @Autowired
    public TableController(TableService tableService) {
        this.tableService = tableService;
    }

    //  GET methode -> return all of table
    @GetMapping("/all")
    public ResponseEntity<List<GameTable>> getAllTables() {
        // Call the findAllTables() method from the service
        List<GameTable> gameTableList = tableService.findAllTables();
        // Returning a 200 message with the list of the tables
        return new ResponseEntity<>(gameTableList, HttpStatus.OK);
    }

    // GET methode -> return id of Table
    @GetMapping("/{id}")
    public ResponseEntity<Optional<GameTable>> getTableById(@PathVariable("id") Long id) {
        Optional<GameTable> gameTable = tableService.findTableById(id);
        return new ResponseEntity<>(gameTable, HttpStatus.OK);
    }

    // Add methode -> Post request methode
    @PostMapping("/")
    public ResponseEntity<GameTable> addTable(@RequestBody GameTable gameTable) {
        GameTable gameTable1 = tableService.addTable(gameTable);
        return new ResponseEntity<>(gameTable1, HttpStatus.CREATED);
    }

    // Update methode -> Put mapping
    @PutMapping("/{id}")
    public ResponseEntity<GameTable> updateTable(@PathVariable("id") Long id, @RequestParam(required = false) int totalPlayers){
        GameTable updateGameTable = tableService.updateTable(id, totalPlayers);
        return new ResponseEntity<>(updateGameTable, HttpStatus.OK);
    }

    // Delete methode -> ? return nothing
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTable(@PathVariable("id")Long id){
        tableService.deleteTable(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
