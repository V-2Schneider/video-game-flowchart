package com.sample;

import java.awt.EventQueue;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInterface frame = new UserInterface();
					frame.setVisible(true);
					// load up the knowledge base
			        KieServices ks = KieServices.Factory.get();
		    	    KieContainer kContainer = ks.getKieClasspathContainer();
		        	KieSession kSession = kContainer.newKieSession("ksession-rules");

		            kSession.fireAllRules();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
