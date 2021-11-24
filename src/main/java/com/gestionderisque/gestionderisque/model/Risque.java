package com.gestionderisque.gestionderisque.model;



import javax.persistence.*;

@Entity
@Table(name="risque")
public class Risque {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name="evenclenchant", nullable = false)
    private String evenclenchant ;
    @Column(name="type", nullable = false)
    private String type;
    @Column(name="explmsr", nullable = false)
    private String explmsr;
    
    public Risque(Integer id, String evenclenchant, String type, String explmsr, Categorie categorie) {
		super();
		this.id = id;
		this.evenclenchant = evenclenchant;
		this.type = type;
		this.explmsr = explmsr;
		this.categorie = categorie;
	}
    

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEvenclenchant() {
		return evenclenchant;
	}

	public void setEvenclenchant(String evenclenchant) {
		this.evenclenchant = evenclenchant;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getExplmsr() {
		return explmsr;
	}

	public void setExplmsr(String explmsr) {
		this.explmsr = explmsr;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@ManyToOne
    @JoinColumn
    private Categorie categorie;

    public Risque() {
        super();
    }
}
    
   

