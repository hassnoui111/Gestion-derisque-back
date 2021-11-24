package com.gestionderisque.gestionderisque.dao;

import com.gestionderisque.gestionderisque.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.formalab.ecommerce.dao")
public interface CategorieRepository extends JpaRepository<Categorie,Integer> {
}
