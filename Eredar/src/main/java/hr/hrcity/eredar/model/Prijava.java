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
@Table(name = "prijava")
public class Prijava {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_prijava;
	
	
	@Column
	private long id_grad;
	
	@Column
	private long id_korisnik;
	
	@Column
	private long id_status_prijave;
	
	@Column
	private long id_vrsta_prijave;
	
	@Column
	private long zaposlenika;
	
	@Column
	private long id_upravitelj;
	
	@Column
	private long slika_sirina;
	
	@Column
	private long slika_visina;
	
	@Column
	private long prosljedena;
	
	@Column
	private long vidljivost;
	
	@Column(nullable = false)
    @NotEmpty
	private String adresa;
	
	@Column(nullable = false)
    @NotEmpty
	private String naziv_grad;
	
	@Column(nullable = false)
    @NotEmpty
	private String latitude;
	
	@Column(nullable = false)
    @NotEmpty
	private String longitude;
	
	@Column(nullable = false)
    @NotEmpty
	private String slika;
	
	@Column(nullable = false)
    @NotEmpty
	private String url_slika;
	
	@Column(nullable = false)
    @NotEmpty
	private String napomena;
	
	@Column(nullable = false)
    @NotEmpty
	private String naslov;
	
	@Column(nullable = false)
    @NotEmpty
	private String odgovor;
	
	@Column(nullable = false)
    @NotEmpty
	private String vrsta_naziv;
	
	@Column(nullable = false)
    @NotEmpty
	private LocalDateTime zaprimljena; 
	
	
	@Column(nullable = false)
    @NotEmpty
	private LocalDateTime zavrsena;


	public long getId_prijava() {
		return id_prijava;
	}


	public void setId_prijava(long id_prijava) {
		this.id_prijava = id_prijava;
	}


	public long getId_grad() {
		return id_grad;
	}


	public void setId_grad(long id_grad) {
		this.id_grad = id_grad;
	}


	public long getId_korisnik() {
		return id_korisnik;
	}


	public void setId_korisnik(long id_korisnik) {
		this.id_korisnik = id_korisnik;
	}


	public long getId_status_prijave() {
		return id_status_prijave;
	}


	public void setId_status_prijave(long id_status_prijave) {
		this.id_status_prijave = id_status_prijave;
	}


	public long getId_vrsta_prijave() {
		return id_vrsta_prijave;
	}


	public void setId_vrsta_prijave(long id_vrsta_prijave) {
		this.id_vrsta_prijave = id_vrsta_prijave;
	}


	public long getZaposlenika() {
		return zaposlenika;
	}


	public void setZaposlenika(long zaposlenika) {
		this.zaposlenika = zaposlenika;
	}


	public long getId_upravitelj() {
		return id_upravitelj;
	}


	public void setId_upravitelj(long id_upravitelj) {
		this.id_upravitelj = id_upravitelj;
	}


	public long getSlika_sirina() {
		return slika_sirina;
	}


	public void setSlika_sirina(long slika_sirina) {
		this.slika_sirina = slika_sirina;
	}


	public long getSlika_visina() {
		return slika_visina;
	}


	public void setSlika_visina(long slika_visina) {
		this.slika_visina = slika_visina;
	}


	public long getProsljedena() {
		return prosljedena;
	}


	public void setProsljedena(long prosljedena) {
		this.prosljedena = prosljedena;
	}


	public long getVidljivost() {
		return vidljivost;
	}


	public void setVidljivost(long vidljivost) {
		this.vidljivost = vidljivost;
	}


	public String getAdresa() {
		return adresa;
	}


	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}


	public String getNaziv_grad() {
		return naziv_grad;
	}


	public void setNaziv_grad(String naziv_grad) {
		this.naziv_grad = naziv_grad;
	}


	public String getLatitude() {
		return latitude;
	}


	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}


	public String getLongitude() {
		return longitude;
	}


	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}


	public String getSlika() {
		return slika;
	}


	public void setSlika(String slika) {
		this.slika = slika;
	}


	public String getUrl_slika() {
		return url_slika;
	}


	public void setUrl_slika(String url_slika) {
		this.url_slika = url_slika;
	}


	public String getNapomena() {
		return napomena;
	}


	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}


	public String getNaslov() {
		return naslov;
	}


	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}


	public String getOdgovor() {
		return odgovor;
	}


	public void setOdgovor(String odgovor) {
		this.odgovor = odgovor;
	}


	public String getVrsta_naziv() {
		return vrsta_naziv;
	}


	public void setVrsta_naziv(String vrsta_naziv) {
		this.vrsta_naziv = vrsta_naziv;
	}


	public LocalDateTime getZaprimljena() {
		return zaprimljena;
	}


	public void setZaprimljena(LocalDateTime zaprimljena) {
		this.zaprimljena = zaprimljena;
	}


	public LocalDateTime getZavrsena() {
		return zavrsena;
	}


	public void setZavrsena(LocalDateTime zavrsena) {
		this.zavrsena = zavrsena;
	}


	@Override
	public String toString() {
		return "Prijava [id_prijava=" + id_prijava + ", id_grad=" + id_grad + ", id_korisnik=" + id_korisnik
				+ ", id_status_prijave=" + id_status_prijave + ", id_vrsta_prijave=" + id_vrsta_prijave
				+ ", zaposlenika=" + zaposlenika + ", id_upravitelj=" + id_upravitelj + ", slika_sirina=" + slika_sirina
				+ ", slika_visina=" + slika_visina + ", prosljedena=" + prosljedena + ", vidljivost=" + vidljivost
				+ ", adresa=" + adresa + ", naziv_grad=" + naziv_grad + ", latitude=" + latitude + ", longitude="
				+ longitude + ", slika=" + slika + ", url_slika=" + url_slika + ", napomena=" + napomena + ", naslov="
				+ naslov + ", odgovor=" + odgovor + ", vrsta_naziv=" + vrsta_naziv + ", zaprimljena=" + zaprimljena
				+ ", zavrsena=" + zavrsena + "]";
	} 
	
	
	public boolean equals(Object ob){  
        if(this==ob)          
             return true;  
        if(!(ob instanceof Prijava))  
             return false;  
         //assume getter method in MyClass and this class has private variable myName, herName  
         return naslov.equals(((Prijava)ob).getId_prijava()) ;      
     } 
}

