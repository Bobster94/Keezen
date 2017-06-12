package keezen;




import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Decks implements Serializable{
	Kaart[] drawPile;
	Kaart[] discardPile;
	public Decks (){


	}
	public Kaart[] getDrawPile(){
		return drawPile;
	}
	public void setAantalKaarten(int aantalKaarten){
		drawPile = new Kaart[aantalKaarten];
		discardPile = new Kaart[aantalKaarten];
	}
	public void setDrawPile(Kaart[] drawPile){
		this.drawPile = drawPile;
	}
	public Kaart[] getDiscardPile(){
		return discardPile;
	}
	public void setDiscardPile(Kaart[] discardPile){
		this.discardPile = discardPile;
	}




}
/*public class Decks implements Serializable {
	Kaart[] drawPile;
	Kaart[] discardPile;
	public Decks (int aantalKaarten){

		drawPile = new Kaart[aantalKaarten];
		discardPile = new Kaart[aantalKaarten];
	}
	public Kaart[] getDrawPile() {
		return drawPile;
	}
	public void setDrawPile(Kaart[] drawPile) {
		this.drawPile = drawPile;
	}
	public Kaart[] getDiscardPile() {
		return discardPile;
	}
	public void setDiscardPile(Kaart[] discardPile) {
		this.discardPile = discardPile;
	}




}*/

