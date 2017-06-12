package keezen;

public class Speler {
	private String naam;
	private KleurNummer kn;

	private String serverIp;
	private Hand hand;
	private SpelerController sc;
	private Pion[] pionList;


	public Speler (String serverIp){
		this.serverIp = serverIp;


	}
	public void spelStart(){
		pionList = new Pion[4];
		for(int i = 0;i < pionList.length;i++)
		{
			pionList[i] = new Pion(kn);
		}
		hand = new Hand();
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public KleurNummer getKn() {
		return kn;
	}
	public void setKn(KleurNummer kn) {
		this.kn = kn;
	}
	public String getServerIp() {
		return serverIp;
	}
	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}
	public Hand getHand() {
		return hand;
	}
	public void setHand(Hand hand) {
		this.hand = hand;
	}
	public SpelerController getSc() {
		return sc;
	}
	public void setSc(SpelerController sc) {
		this.sc = sc;
	}
	public Pion[] getPionList() {
		return pionList;
	}
	public void setPionList(Pion[] pionList) {
		this.pionList = pionList;
	}

}