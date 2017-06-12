package keezen;

import java.rmi.RemoteException;

public class Spel implements SpelInterface {
	private Speler[] spelerList;

	public Decks getDeck() {
		return deck;
	}

	private Decks deck;
	private DeckController dc;
	public int counter;
	public DeckController getDc()throws RemoteException {
		return dc;
	}

	public void setDc(DeckController dc)throws RemoteException {
		this.dc = dc;
	}

	public Speler[] getSpelerList()throws RemoteException {
		return spelerList;
	}

	public void setSpelerList(Speler[] spelerList)throws RemoteException {
		this.spelerList = spelerList;
	}

	public void addSpeler(Speler speler)throws RemoteException{
		spelerList[counter] = speler;
		spelerList[counter].spelStart();
		counter++;
	}
	public void bereidSpelVoor()throws RemoteException{
		spelerList = new Speler[5];
		deck = new Decks();
		dc = new DeckController();
		dc.CreateDeck(deck);
		counter = 0;
	}
	public void bereidSpelVoorr()throws RemoteException{
		for(Speler x:spelerList){
			x.spelStart();
		}
	}
}
