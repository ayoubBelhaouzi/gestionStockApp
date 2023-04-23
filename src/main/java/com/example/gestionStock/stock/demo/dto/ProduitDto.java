package com.example.gestionStock.stock.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProduitDto implements Serializable {

    private static final long serialVersionUID =  1L;

    private Long id;

    private String ref;

    private int quantite;

    private float prixUnitaire;
}
