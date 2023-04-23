package com.example.gestionStock.stock.demo.commun.mappers;

import com.example.gestionStock.stock.demo.dto.ProduitDto;
import com.example.gestionStock.stock.demo.entities.Produit;

public class ProduitMapper {

    private ProduitMapper() {
    }

    public static ProduitDto entitieToDto(Produit produit){
        return ProduitDto.builder()
                .id(produit.getId())
                .ref(produit.getRef())
                .prixUnitaire(produit.getPrixUnitaire())
                .quantite(produit.getQuantite())
                .build();
    }

    public static Produit entitieToDto(ProduitDto produit){
        return Produit.builder()
                .id(produit.getId())
                .ref(produit.getRef())
                .prixUnitaire(produit.getPrixUnitaire())
                .quantite(produit.getQuantite())
                .build();
    }
}
