package keezen;



public class Kaart {
	public enum kaartType {harten,ruiten,klaveren,schoppen,}
	public enum kaartNummer {een,twee,drie,vier,vijf,zes,zeven,acht,negen,tien,heer,vrouw,boer}
	protected kaartType kaartype;
	protected kaartNummer kaartNummer;
	protected int kaartid;



	public Kaart(int kaartid,kaartNummer kaartnummer,kaartType kaartType){
		this.kaartid = kaartid;
		this.kaartNummer = kaartnummer;
		this.kaartype = kaartType;
	}



	public kaartType getKaartype() {
		return kaartype;
	}



	public void setKaartype(kaartType kaartype) {
		this.kaartype = kaartype;
	}



	public kaartNummer getKaartNummer() {
		return kaartNummer;
	}



	public void setKaartNummer(kaartNummer kaartNummer) {
		this.kaartNummer = kaartNummer;
	}



	public int getKaartid() {
		return kaartid;
	}



	public void setKaartid(int kaartid) {
		this.kaartid = kaartid;
	}


}
