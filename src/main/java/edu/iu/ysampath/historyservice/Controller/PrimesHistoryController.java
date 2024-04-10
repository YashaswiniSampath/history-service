package edu.iu.ysampath.historyservice.Controller;


import edu.iu.ysampath.historyservice.model.PrimesRecord;
import edu.iu.ysampath.historyservice.repository.PrimesHistoryRepository;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimesHistoryController {
    private final PrimesHistoryRepository primesHistoryRepository;
    public PrimesHistoryController(PrimesHistoryRepository primesHistoryRepository) {
        this.primesHistoryRepository = primesHistoryRepository;
    }

    @GetMapping("/{customer}")
    public List<PrimesRecord> findALl(@PathVariable String customer) {
        return primesHistoryRepository.findAllByCustomer(customer);
    }
}
