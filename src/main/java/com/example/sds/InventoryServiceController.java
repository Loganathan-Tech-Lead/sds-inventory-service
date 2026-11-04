package com.example.sds;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

/** Entry point for the "Inventory service" demo. Replace with the real implementation (see TODO.md). */
@RestController
public class InventoryServiceController {
    @GetMapping("/demo/inventory-service")
    public Map<String, String> demo() {
        return Map.of("concept", "Inventory service", "status", "scaffold - implement me");
    }
}
