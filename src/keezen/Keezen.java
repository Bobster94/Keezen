package keezen;

import keezen.Kaart.kaartNummer;
import keezen.Kaart.kaartType;

import java.rmi.RemoteException;

public class Keezen /*Uextends Application*/{
	private StartView sv = new StartView();
	public static void main(String[] args0){
		//launch (args0);
		try {
			Speler boy = new Speler("192.168.0.1");
			Pion[] pl = new Pion[2];
			Pion[] wl = new Pion[2];
			Pion p = new Pion(KleurNummer.zwart6);
			pl[1] = null;
			Spel spel = new Spel();
			//BordController bc = new BordController();
			//bc.createBord();
			//bc.writebord();
			spel.bereidSpelVoor();

			SpelController sc = new SpelController();
			spel.addSpeler(boy);
			Speler boy7 = new Speler("192.168.0.1");
			Speler boy6 = new Speler("192.168.0.1");
			Speler bo5y = new Speler("192.168.0.1");
			Speler b4oy = new Speler("192.168.0.1");
			spel.addSpeler(boy7);
			spel.addSpeler(boy6);

			spel.addSpeler(bo5y);

			spel.addSpeler(b4oy);
			spel.bereidSpelVoorr();


			sc.deelKaarten(spel);
			sc.writeKaarten(spel);
		}catch (RemoteException e){
			System.out.println(e.getStackTrace());;
		}










	}


/*	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane bp = new BorderPane();

		bp.setCenter(sv);



		Scene scene = new Scene(bp,1200,700);
		primaryStage.setScene(scene);
		primaryStage.show();


	}*/
}
