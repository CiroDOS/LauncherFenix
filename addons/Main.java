package net.minecraft.bootstrap;

import com.formdev.flatlaf.*;
import javax.swing.*;

public class Main {
	
	public static void main(String[] args) {
	
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
		} catch (Exception ignored) {
		}
		
		Lf.main(new String[] {});
	
	}
	
}