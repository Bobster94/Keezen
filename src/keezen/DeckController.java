package keezen;

import keezen.Kaart.kaartNummer;
import keezen.Kaart.kaartType;

import java.io.Serializable;

public class DeckController implements Serializable {

	private final int heeldeck = 52;
	private final int halfdeck = 26;
	private int b = 0;
	public  DeckController(){

	}

	public void CreateDeck(Decks deck) {


			deck.setAantalKaarten(heeldeck);
			for(int i = 0; i < kaartType.values().length;i++){

				for(int p = 0; p < kaartNummer.values().length;p++){

					Kaart kaart1 = new Kaart(b,kaartNummer.values()[p],kaartType.values()[i]);

					deck.getDrawPile()[b] = kaart1;
					b++;
				}
			}


	}

	public void CreateHalfDeck(Decks deck) {


		deck.setAantalKaarten(halfdeck);
		for(int i = 0; i < (kaartType.values().length/2);i++){

			for(int p = 0; p < kaartNummer.values().length;p++){

				Kaart kaart1 = new Kaart(b,kaartNummer.values()[p],kaartType.values()[i]);

				deck.getDrawPile()[b] = kaart1;
				b++;
			}
		}
	}

	}
