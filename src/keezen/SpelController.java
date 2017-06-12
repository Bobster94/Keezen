package keezen;

import keezen.Kaart.kaartNummer;
import keezen.Kaart.kaartType;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class SpelController {
	Random random = new Random();
	int randomcounter;
	public void deelKaarten(Spel spel) throws RemoteException {
		for(Speler x: spel.getSpelerList()){
			for(int i = 0;i<4;i++){
			randomcounter = random.nextInt(52);
				Collections.shuffle(spel.getDeck().getDrawPile());
			x.getHand().getKaarten()[i] = spel.getDeck().getDrawPile()[randomcounter];
		}

		}

		}
	public void writeKaarten(Spel spel) throws RemoteException {
		for(Speler x:spel.getSpelerList()){
			for(int i = 0;i<1;i++){
			System.out.println(x.getHand().getKaarten()[i].getKaartNummer());
		}
		}
		}

}
