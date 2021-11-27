package nl.meliharslan.ewa.blackjackSB.controllers;

import nl.meliharslan.ewa.blackjackSB.models.Table;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/table")
public class TableController {

    @GetMapping
    public Table getTable() {
        return Table.createTable();
    }
}
