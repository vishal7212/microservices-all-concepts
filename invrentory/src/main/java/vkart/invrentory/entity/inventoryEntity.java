package vkart.invrentory.entity;

import jakarta.persistence.*;

@Entity
@Table(name="inventory")
public class inventoryEntity {
    @Id
    @Column
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    private String skuCode;

    @Column
    private int quantity ;

    public Long getId() {
        return id;
    }


    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



}
