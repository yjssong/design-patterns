package com.yjsong;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		Captain captain = new Captain(new FishingBoatAdapter());
		captain.row();
	}
}
