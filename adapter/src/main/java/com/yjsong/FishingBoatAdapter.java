package com.yjsong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FishingBoatAdapter implements RowingBoat {

	private static final Logger LOGGER = LoggerFactory.getLogger(FishingBoatAdapter.class);
	
	private FishingBoat boat;
	
	public FishingBoatAdapter() {
		boat = new FishingBoat();
	}
	
	public void row() {
		boat.sail();
	}
	
	
}
