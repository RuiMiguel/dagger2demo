package com.gigigo.dagger2demo;

import android.location.LocationManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import com.gigigo.dagger2demo.di.ActivityComponent;
import com.gigigo.dagger2demo.di.ActivityModule;
import com.gigigo.dagger2demo.di.DaggerActivityComponent;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by rui.alonso on 15/4/15.
 */
public abstract class BaseActivity extends ActionBarActivity {

  private ActivityComponent activityComponent;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setupGraph();
    setupComponent();
  }

  private void setupGraph() {
    activityComponent = DaggerActivityComponent.builder()
        .appComponent(((App) getApplication()).getComponent())
        .activityModule(new ActivityModule(this))
        .build();

    activityComponent.injectActivity(this);
  }

  public ActivityComponent getBaseComponent() {
    return activityComponent;
  }

  protected abstract void setupComponent();
}
