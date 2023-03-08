package hr.hrcity.eredar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import java.time.LocalDateTime;
@Entity
@Table(name = "upravitelj")
public class Upravitelj {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_upravitelj;
	
	@Column
	private long opcina_grad;
	
	@Column
	private long slanje_prijave;
	
	@Column
	private long aktivan;
	

	@Column(nullable = false)
    @NotEmpty
	private String ime_prezime;
	

	@Column(nullable = false)
    @NotEmpty
	private String email;
	

	@Column(nullable = false)
    @NotEmpty
	private String lozinka;
	

	@Column(nullable = false)
    @NotEmpty
	private String aktivacija;
	
	@Column(nullable = false)
    @NotEmpty
	private String email_prijave;
	
	@Column(nullable = false)
    @NotEmpty
	private String web;
	
	@Column(nullable = false)
    @NotEmpty
	private String grb;
	
	@Column(nullable = false)
    @NotEmpty
	private String nazivOdjela;
	
	@Column(nullable = false)
    @NotEmpty
	private String nazivGrada;
	
	@Column(nullable = false)
    @NotEmpty
	private LocalDateTime aktivacija_datum;

	public long getId_upravitelj() {
		return id_upravitelj;
	}

	public void setId_upravitelj(long id_upravitelj) {
		this.id_upravitelj = id_upravitelj;
	}

	public long getOpcina_grad() {
		return opcina_grad;
	}

	public void setOpcina_grad(long opcina_grad) {
		this.opcina_grad = opcina_grad;
	}

	public long getSlanje_prijave() {
		return slanje_prijave;
	}

	public void setSlanje_prijave(long slanje_prijave) {
		this.slanje_prijave = slanje_prijave;
	}

	public long getAktivan() {
		return aktivan;
	}

	public void setAktivan(long aktivan) {
		this.aktivan = aktivan;
	}

	public String getIme_prezime() {
		return ime_prezime;
	}

	public void setIme_prezime(String ime_prezime) {
		this.ime_prezime = ime_prezime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	public String getAktivacija() {
		return aktivacija;
	}

	public void setAktivacija(String aktivacija) {
		this.aktivacija = aktivacija;
	}

	public String getEmail_prijave() {
		return email_prijave;
	}

	public void setEmail_prijave(String email_prijave) {
		this.email_prijave = email_prijave;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getGrb() {
		return grb;
	}

	public void setGrb(String grb) {
		this.grb = grb;
	}

	public String getNazivOdjela() {
		return nazivOdjela;
	}

	public void setNazivOdjela(String nazivOdjela) {
		this.nazivOdjela = nazivOdjela;
	}

	public String getNazivGrada() {
		return nazivGrada;
	}

	public void setNazivGrada(String nazivGrada) {
		this.nazivGrada = nazivGrada;
	}

	public LocalDateTime getAktivacija_datum() {
		return aktivacija_datum;
	}

	public void setAktivacija_datum(LocalDateTime aktivacija_datum) {
		this.aktivacija_datum = aktivacija_datum;
	}

	@Override
	public String toString() {
		return "Upravitelj [id_upravitelj=" + id_upravitelj + ", opcina_grad=" + opcina_grad + ", slanje_prijave="
				+ slanje_prijave + ", aktivan=" + aktivan + ", ime_prezime=" + ime_prezime + ", email=" + email
				+ ", lozinka=" + lozinka + ", aktivacija=" + aktivacija + ", email_prijave=" + email_prijave + ", web="
				+ web + ", grb=" + grb + ", nazivOdjela=" + nazivOdjela + ", nazivGrada=" + nazivGrada
				+ ", aktivacija_datum=" + aktivacija_datum + "]";
	}
	
	
	public boolean equals(Object ob){  
        if(this==ob)          
             return true;  
        if(!(ob instanceof Upravitelj))  
             return false;  
         //assume getter method in MyClass and this class has private variable myName, herName  
         return ime_prezime.equals(((Upravitelj)ob).getId_upravitelj()) ;      
     } 
	
}
