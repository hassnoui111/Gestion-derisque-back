package com.gestionderisque.gestionderisque.dao;

import com.gestionderisque.gestionderisque.model.Risque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RisqueRepository extends JpaRepository<Risque,Integer> {

   
}
