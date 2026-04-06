package vkart.invrentory.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vkart.invrentory.service.inventoryService;

@RestController
public class inventoryController {

    @Autowired
    private inventoryService inventoryService;

    @GetMapping("/api/inventory")
    public boolean getInventoryStatus(@RequestParam String skuCode,
                                      @RequestParam int quantity){
        return inventoryService.getInventoryStatus(skuCode,quantity);
    }
}

