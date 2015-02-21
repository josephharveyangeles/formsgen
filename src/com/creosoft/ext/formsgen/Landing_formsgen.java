package com.creosoft.ext.formsgen;

import org.creosoft.hecate.utils.windowUtils.ScreenUtils;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Landing_formsgen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ScreenUtils.forceFullScreen(this);
		
		setContentView(R.layout.activity_landing_formsgen);
	}
}
