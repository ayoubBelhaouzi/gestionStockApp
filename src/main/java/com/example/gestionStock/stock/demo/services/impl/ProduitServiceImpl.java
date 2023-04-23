package com.example.gestionStock.stock.demo.services.impl;

import com.example.gestionStock.stock.demo.dao.ProduitRepository;
import com.example.gestionStock.stock.demo.dto.ProduitDto;
import com.example.gestionStock.stock.demo.services.IProduitService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl implements IProduitService {

    private ProduitRepository produitRepos;

    public ProduitServiceImpl(ProduitRepository produitRepos) {
        this.produitRepos = produitRepos;
    }

    @Override
    public List<ProduitDto> getProduits() {
        return null;
    }

    @Override
    public void addProduit(ProduitDto produit) {

    }

    @Override
    public void updateProduit(ProduitDto produit) {

    }

    @Override
    public void deleteProduit(Long id) {

    }
}
