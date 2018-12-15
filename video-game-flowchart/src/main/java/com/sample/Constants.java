package com.sample;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Ta klasa przechowuje sta�e potrzebne do projektu, 
 * z tego wzgl�du nie powinny by� tworzone jej instancje, 
 * wi�c konstruktor jest prywatny.
 */
public class Constants {

	public static final String TITLE_0 = "I want to play a game.\n\n What time period are you thinking?";
	public static final String PRESENT = "PRESENT";
	public static final String FUTURE = "FUTURE";
	public static final String PAST = "PAST";
	public static final String TIMELESS = "TIMELESS";
	
	private Constants() {
	}
}

