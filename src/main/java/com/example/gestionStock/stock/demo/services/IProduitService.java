package com.example.gestionStock.stock.demo.services;

import com.example.gestionStock.stock.demo.dto.ProduitDto;

import java.util.List;

public interface IProduitService {

    List<ProduitDto> getProduits();

    void addProduit(ProduitDto produit);

    void updateProduit(ProduitDto produit);

    void deleteProduit(Long id);

}
