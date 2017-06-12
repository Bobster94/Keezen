package keezen;

import keezen.Tegel.TegelType;

public class BordController {
	private Bord bord;
	private int counter = 0;
	public BordController(){
		bord = new Bord();
	}
	public void createBord(){
		for(int b = 1;b <= 6;b++){


			for(int i = 0;i<15;i++)
			{
				this.bord.getTegelList()[counter] = new Tegel(TegelType.normaal);
				counter++;
			}
			for(int c = 0;c < 4;c++)
			{
				this.bord.getTegelList()[counter] = new Tegel(TegelType.values()[b]);
				counter++;
			}
			this.bord.getTegelList()[counter] = new Tegel(TegelType.values()[(b+6)]);
					counter++;

		}


	}
	public void writebord(){
		for(int i = 0;i <120;i++)
		System.out.println(bord.getTegelList()[i].getTegelType());

	}
}
