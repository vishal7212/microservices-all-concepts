package vkart.invrentory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vkart.invrentory.entity.inventoryEntity;
import vkart.invrentory.repository.inventoryRepository;

import java.util.Optional;

@Service
public class inventoryService {

    @Autowired
    inventoryRepository inventoryRepository;

    public boolean getInventoryStatus(String skuCode, int quantity) {
        Optional<inventoryEntity> inventoryOpt =
                inventoryRepository.findBySkuCode(skuCode);

        if (inventoryOpt.isEmpty()) {
            return false;
        }

        inventoryEntity inventory = inventoryOpt.get();

        return inventory.getQuantity() >= quantity;
    }
}

