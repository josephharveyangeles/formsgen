package com.creosoft.ext.formsgen;

import org.creosoft.hecate.utils.windowUtils.ScreenUtils;

import android.app.Activity;
import android.os.Bundle;


public class Launcher_formsgen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ScreenUtils.forceFullScreen(this);
		setContentView(R.layout.activity_launcher_formsgen);
	}
}
