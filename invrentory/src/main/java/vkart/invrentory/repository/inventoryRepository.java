package vkart.invrentory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vkart.invrentory.entity.inventoryEntity;

import java.util.Optional;

public interface inventoryRepository extends JpaRepository<inventoryEntity,Long> {

    Optional<inventoryEntity> findBySkuCode(String skuCode);
}
