package com.getchute.android.photopickerplus.ui.activity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;

import com.getchute.android.photopickerplus.R;

/**
 * Created by Olga on 2/9/15.
 */
public abstract class BaseActivity extends ActionBarActivity {

  protected abstract int getLayoutResource();
  protected abstract void setToolBar(Toolbar toolbar);

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(getLayoutResource());

    Toolbar toolBar = (Toolbar) findViewById(R.id.toolbar);
    if (toolBar != null) {
      toolBar.bringToFront();
      setSupportActionBar(toolBar);
      getSupportActionBar().setDisplayHomeAsUpEnabled(true);
      getSupportActionBar().setIcon(new ColorDrawable(android.R.color.transparent));
      getSupportActionBar().setTitle(R.string.choose_service);
      setToolBar(toolBar);
    }
  }
}