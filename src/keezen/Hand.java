package keezen;

public class Hand {
	private Kaart[] kaarten;
	public Hand(){
		kaarten = new Kaart[5];
	}
	public Kaart[] getKaarten() {
		return kaarten;
	}
	public void setKaarten(Kaart[] kaarten) {
		this.kaarten = kaarten;
	}
}
