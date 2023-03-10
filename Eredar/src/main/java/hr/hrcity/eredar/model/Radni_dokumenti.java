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
@Table(name = "radni_dokumenti")
public class Radni_dokumenti {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_radni_dokument;
	
	@Column
	private long id_upravitelj;
	
	@Column
	private long vrsta;

	@Column(nullable = false)
    @NotEmpty
	private LocalDateTime datum_sluzbeno;
	
	@Column(nullable = false)
    @NotEmpty
	private String naslov_dokumenta;
	
	@Column(nullable = false)
    @NotEmpty
	private String obrazlozenje;
	
	@Column(nullable = false)
    @NotEmpty
	private String tekst_1;
	
	@Column(nullable = false)
    @NotEmpty
	private String tekst_2;
	
	@Column(nullable = false)
    @NotEmpty
	private String pravoljek;
	
	@Column(nullable = false)
    @NotEmpty
	private String potpis;
	
	@Column(nullable = false)
    @NotEmpty
	private String dostaviti;
	
	@Column(nullable = false)
    @NotEmpty
	private String klasa;
	
	@Column(nullable = false)
    @NotEmpty
	private String URB;
	
	@Column(nullable = false)
    @NotEmpty
	private String url_dokumenta;
	
	@Column(nullable = false)
    @NotEmpty
	private String osoba;

	public long getId_radni_dokument() {
		return id_radni_dokument;
	}

	public void setId_radni_dokument(long id_radni_dokument) {
		this.id_radni_dokument = id_radni_dokument;
	}

	public long getId_upravitelj() {
		return id_upravitelj;
	}

	public void setId_upravitelj(long id_upravitelj) {
		this.id_upravitelj = id_upravitelj;
	}

	public long getVrsta() {
		return vrsta;
	}

	public void setVrsta(long vrsta) {
		this.vrsta = vrsta;
	}

	public LocalDateTime getDatum_sluzbeno() {
		return datum_sluzbeno;
	}

	public void setDatum_sluzbeno(LocalDateTime datum_sluzbeno) {
		this.datum_sluzbeno = datum_sluzbeno;
	}

	public String getNaslov_dokumenta() {
		return naslov_dokumenta;
	}

	public void setNaslov_dokumenta(String naslov_dokumenta) {
		this.naslov_dokumenta = naslov_dokumenta;
	}

	public String getObrazlozenje() {
		return obrazlozenje;
	}

	public void setObrazlozenje(String obrazlozenje) {
		this.obrazlozenje = obrazlozenje;
	}

	public String getTekst_1() {
		return tekst_1;
	}

	public void setTekst_1(String tekst_1) {
		this.tekst_1 = tekst_1;
	}

	public String getTekst_2() {
		return tekst_2;
	}

	public void setTekst_2(String tekst_2) {
		this.tekst_2 = tekst_2;
	}

	public String getPravoljek() {
		return pravoljek;
	}

	public void setPravoljek(String pravoljek) {
		this.pravoljek = pravoljek;
	}

	public String getPotpis() {
		return potpis;
	}

	public void setPotpis(String potpis) {
		this.potpis = potpis;
	}

	public String getDostaviti() {
		return dostaviti;
	}

	public void setDostaviti(String dostaviti) {
		this.dostaviti = dostaviti;
	}

	public String getKlasa() {
		return klasa;
	}

	public void setKlasa(String klasa) {
		this.klasa = klasa;
	}

	public String getURB() {
		return URB;
	}

	public void setURB(String uRB) {
		URB = uRB;
	}

	public String getUrl_dokumenta() {
		return url_dokumenta;
	}

	public void setUrl_dokumenta(String url_dokumenta) {
		this.url_dokumenta = url_dokumenta;
	}

	public String getOsoba() {
		return osoba;
	}

	public void setOsoba(String osoba) {
		this.osoba = osoba;
	}

	@Override
	public String toString() {
		return "Radni_dokumenti [id_radni_dokument=" + id_radni_dokument + ", id_upravitelj=" + id_upravitelj
				+ ", vrsta=" + vrsta + ", datum_sluzbeno=" + datum_sluzbeno + ", naslov_dokumenta=" + naslov_dokumenta
				+ ", obrazlozenje=" + obrazlozenje + ", tekst_1=" + tekst_1 + ", tekst_2=" + tekst_2 + ", pravoljek="
				+ pravoljek + ", potpis=" + potpis + ", dostaviti=" + dostaviti + ", klasa=" + klasa + ", URB=" + URB
				+ ", url_dokumenta=" + url_dokumenta + ", osoba=" + osoba + "]";
	}
	
	
	
	public boolean equals(Object ob){  
        if(this==ob)          
             return true;  
        if(!(ob instanceof Radni_dokumenti))  
             return false;  
         //assume getter method in MyClass and this class has private variable myName, herName  
         return naslov_dokumenta.equals(((Radni_dokumenti)ob).getId_radni_dokument()) ;      
     } 
}
