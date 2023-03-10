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
@Table(name = "tiket")
public class Tiket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_tiket;
	
	
	@Column
	private long id_upit;
	
	
	@Column
	private long id_upravitelj;
	
	@Column
	private long id_korisnik;
	
	@Column
	private long vrsta;
	
	@Column
	private long status;
	
	
	@Column(nullable = false)
    @NotEmpty
	private String aktivacija;
	
	@Column(nullable = false)
    @NotEmpty
	private String pitanje;
	
	@Column(nullable = false)
    @NotEmpty
	private String odgovor;
	
	@Column(nullable = false)
    @NotEmpty
	private LocalDateTime datum_slanja;
	
	@Column(nullable = false)
    @NotEmpty
	private LocalDateTime datum_odgovora;

	public long getId_tiket() {
		return id_tiket;
	}

	public void setId_tiket(long id_tiket) {
		this.id_tiket = id_tiket;
	}

	public long getId_upit() {
		return id_upit;
	}

	public void setId_upit(long id_upit) {
		this.id_upit = id_upit;
	}

	public long getId_upravitelj() {
		return id_upravitelj;
	}

	public void setId_upravitelj(long id_upravitelj) {
		this.id_upravitelj = id_upravitelj;
	}

	public long getId_korisnik() {
		return id_korisnik;
	}

	public void setId_korisnik(long id_korisnik) {
		this.id_korisnik = id_korisnik;
	}

	public long getVrsta() {
		return vrsta;
	}

	public void setVrsta(long vrsta) {
		this.vrsta = vrsta;
	}

	public long getStatus() {
		return status;
	}

	public void setStatus(long status) {
		this.status = status;
	}

	public String getAktivacija() {
		return aktivacija;
	}

	public void setAktivacija(String aktivacija) {
		this.aktivacija = aktivacija;
	}

	public String getPitanje() {
		return pitanje;
	}

	public void setPitanje(String pitanje) {
		this.pitanje = pitanje;
	}

	public String getOdgovor() {
		return odgovor;
	}

	public void setOdgovor(String odgovor) {
		this.odgovor = odgovor;
	}

	public LocalDateTime getDatum_slanja() {
		return datum_slanja;
	}

	public void setDatum_slanja(LocalDateTime datum_slanja) {
		this.datum_slanja = datum_slanja;
	}

	public LocalDateTime getDatum_odgovora() {
		return datum_odgovora;
	}

	public void setDatum_odgovora(LocalDateTime datum_odgovora) {
		this.datum_odgovora = datum_odgovora;
	}

	@Override
	public String toString() {
		return "Tiket [id_tiket=" + id_tiket + ", id_upit=" + id_upit + ", id_upravitelj=" + id_upravitelj
				+ ", id_korisnik=" + id_korisnik + ", vrsta=" + vrsta + ", status=" + status + ", aktivacija="
				+ aktivacija + ", pitanje=" + pitanje + ", odgovor=" + odgovor + ", datum_slanja=" + datum_slanja
				+ ", datum_odgovora=" + datum_odgovora + "]";
	}
	
	
	public boolean equals(Object ob){  
        if(this==ob)          
             return true;  
        if(!(ob instanceof Tiket))  
             return false;  
         //assume getter method in MyClass and this class has private variable myName, herName  
         return pitanje.equals(((Tiket)ob).getId_tiket()) ;      
     } 
	
}