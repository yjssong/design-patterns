package com.yjsong;

public class Captain implements RowingBoat{
	
	private RowingBoat rowingBoat;
	
	public Captain(RowingBoat rowingBoat) {
		this.rowingBoat = rowingBoat;
	}

	public void row() {
		rowingBoat.row();
	}

}
