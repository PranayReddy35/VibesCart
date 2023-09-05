package com.vibescart.inventoryservice.controller;

import com.vibescart.inventoryservice.dto.InventoryResponse;
import com.vibescart.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;

//    public InventoryController(InventoryService inventoryService) {
//        this.inventoryService = inventoryService;
//    }

// http://Localhost:8082/api/inventory/iphone-13, iphone13-red
// http://localhost:8082/api/inventory?sku-code=iphone-13&skuCode=iphone13-red
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode) {
        return inventoryService.isInStock(skuCode);
    }
}
