package keezen;

public class Bord {

	private DeckController dc;
	private Tegel[] tegelList;
	public Bord(){
		dc = new DeckController();
		tegelList = new Tegel[120];
	}
	public Tegel[] getTegelList() {
		return tegelList;
	}
	public void setTegelList(Tegel[] tegelList) {
		this.tegelList = tegelList;
	}
}
