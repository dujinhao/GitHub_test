package com.dh.apptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class textview_htmltest extends AppCompatActivity {

	private TextView tv_title;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_textview_htmltest);
		tv_title = (TextView) findViewById(R.id.tv_title);
		//tv_title.setText();
	}
}
