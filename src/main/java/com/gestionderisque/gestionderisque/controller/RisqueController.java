package com.gestionderisque.gestionderisque.controller;

import com.gestionderisque.gestionderisque.dao.RisqueRepository;
import com.gestionderisque.gestionderisque.model.Risque;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(description = "gestion des risque")
@RestController
@RequestMapping(value="/rest/api")
@CrossOrigin(origins = "http://localhost:4200")
public class 	RisqueController {
    @Autowired
    RisqueRepository RisqueRepository;

    @ApiOperation("consulter tout les risques")
    @GetMapping(value="/allrisque")
    public List<Risque> allrisque(){
        return RisqueRepository.findAll();
    }

    @GetMapping(value="/risque/{id}")
    public ResponseEntity<Risque> risque(@PathVariable Integer id) throws Exception{
        final Risque risque = RisqueRepository.findById(id).orElseThrow(()->new Exception("Le risque n'existe pas"));
        return ResponseEntity.ok().body(risque);
    }

    @ApiOperation("consulter tout les risques")
    @PostMapping(value="/addrisque")
    //@PreAuthorize("hasRole('admin') or hasRole('pm')")
    public Risque addrisque(@Valid @RequestBody Risque risque){
        return RisqueRepository.save(risque);
    }

    

    @DeleteMapping(value="/risque/{id}")
    //@PreAuthorize("hasRole('admin') or hasRole('pm')")
    public Map<String,Boolean> deleterisque(@PathVariable Integer id) throws Exception{
        Risque Risque = RisqueRepository.findById(id).orElseThrow(()->new Exception("Le risque n'existe pas"));
        RisqueRepository.delete(Risque);
        Map<String,Boolean> response = new HashMap<>();
        response.put("Le risque est supprimé!",Boolean.TRUE);
        return response;
    }
    @PutMapping (value="/Risque/{id}")
	//@PreAuthorize("hasRole('admin') ")
	public ResponseEntity <Risque> updateRisque (@PathVariable Integer id ,@Valid  @RequestBody Risque risqueDetails ) throws Exception {
		Risque risque= RisqueRepository.findById(id).orElseThrow(()->new Exception ("le risque n'existe pas ")) ;
		risque.setId(risqueDetails.getId()) ; 
		risque.setCategorie(risqueDetails.getCategorie());
		risque.setType(risqueDetails.getType());
		risque.setExplmsr(risqueDetails.getExplmsr());
		risque.setEvenclenchant(risqueDetails.getEvenclenchant());
		
		RisqueRepository.save(risque) ; 
		return ResponseEntity.ok(risque) ; 
	}
  

}
