package com.sore.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id", nullable = false)
    private Integer itemId;

    @NotBlank
    @Size(min=8 , max = 40)
    private String itemName;

    @NotBlank
    @Size(min=4, max = 200)
    private String itemDescription;


}
