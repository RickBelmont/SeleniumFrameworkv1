package com.liverpool.utils;

import java.util.Random;

public class Utilities {

	
	public static int getRandom(int limit) {
		Random rand = new Random();
		return rand.nextInt(limit);
	}
	
}
