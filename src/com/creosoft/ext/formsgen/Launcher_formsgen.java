package com.creosoft.ext.formsgen;

import org.creosoft.hecate.utils.windowUtils.ScreenUtils;
import org.creosoft.hecate.utils.windowUtils.SplashMonth;
import org.creosoft.hecate.utils.windowUtils.SplashSequence;
import org.creosoft.hecate.utils.windowUtils.SplashSequence.SplashAppDetails;
import org.creosoft.hecate.utils.windowUtils.SplashSequence.SplashClassGroup;
import org.creosoft.hecate.utils.windowUtils.SplashSequence.SplashTimeDetails;

import android.app.Activity;
import android.os.Bundle;


public class Launcher_formsgen extends Activity {
	
	private static final String APPNAME = "formsgen";
	private static final int DELAY = 3000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ScreenUtils.forceFullScreen(this);
		setContentView(R.layout.activity_launcher_formsgen);
		
		SplashTimeDetails timeDetails = new SplashTimeDetails(DELAY, SplashMonth.MAR.ordinal(), 1, 2015);
		SplashAppDetails appDetails = new SplashAppDetails(APPNAME, this);
		SplashClassGroup classGroup = new SplashClassGroup(Limbo_formsgen.class, Landing_formsgen.class);
		
		SplashSequence splash = new SplashSequence.Builder(timeDetails, appDetails, classGroup).build();
		splash.startSequence();
	}
}
