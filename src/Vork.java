public class Vork {
	private int vork;
	private boolean opTafel;
	private int laatsteFilosoof;
	
	public Vork(int vork) {
		this.vork = vork;
		opTafel = true;
		laatsteFilosoof = -1;
	}
	
	public boolean neemVork(int filosoof) {
		if(laatsteFilosoof == filosoof) {
			return false;
		} else {
			if(opTafel) {
				laatsteFilosoof = filosoof;
				opTafel = false;
				return true;
			} else {
				return false;
			}
		}
	}
	
	public void legTerug() {
		opTafel = true;
	}
	
	public int getVork() {
		return vork;
	}
}