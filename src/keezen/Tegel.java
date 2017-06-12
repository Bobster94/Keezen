package keezen;

public class Tegel {
	public enum TegelType{normaal,groenthuis,geelthuis,witthuis,roodthuis,blauwthuis,zwartthuis,groenstart,geelstart,witstart,roodstart,blauwstart,zwartstart}
	private Pion[] pion;
	private TegelType tegelType;
	public Tegel(TegelType tegelType){
		pion = new Pion[1];
		this.tegelType = tegelType;

	}
	public TegelType getTegelType() {
		return tegelType;
	}
	public void setTegelType(TegelType tegelType) {
		this.tegelType = tegelType;
	}
}
