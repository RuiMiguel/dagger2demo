package com.gigigo.dagger2demo.view;

import android.content.Intent;
import android.os.Bundle;
import com.gigigo.dagger2demo.R;
import com.gigigo.dagger2demo.presenter.SplashPresenter;
import com.gigigo.dagger2demo.presenter.SplashView;
import com.gigigo.dagger2demo.di.DaggerSplashComponent;
import com.gigigo.dagger2demo.di.SplashComponent;
import com.gigigo.dagger2demo.di.SplashModule;
import javax.inject.Inject;

public class SplashActivity extends BaseActivity implements SplashView {
  protected SplashComponent splashComponent;

  @Inject SplashPresenter presenter;

  @Override protected void onCreate(Bundle savedInstanceState) {
    //    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    //    requestWindowFeature(Window.FEATURE_NO_TITLE);

    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_splash);

    presenter.uiLoaded();
  }

  @Override public void finishSplash() {
    Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
    startActivity(mainIntent);
    finish();
  }

  @Override protected void setupComponent() {
    splashComponent = DaggerSplashComponent.builder()
        .activityComponent(getBaseComponent())
        .splashModule(new SplashModule(this))
        .build();

    splashComponent.inject(this);
  }

  public SplashComponent getComponent() {
    return splashComponent;
  }
}