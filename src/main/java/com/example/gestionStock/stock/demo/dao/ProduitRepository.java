package com.example.gestionStock.stock.demo.dao;

import com.example.gestionStock.stock.demo.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository<Produit , Long> {
}
