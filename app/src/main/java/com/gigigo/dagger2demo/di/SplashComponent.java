package com.gigigo.dagger2demo.di;

import com.gigigo.dagger2demo.SplashActivity;
import com.gigigo.dagger2demo.SplashPresenter;
import com.gigigo.dagger2demo.SplashView;
import dagger.Component;

@PerActivityScope @Component(
    dependencies = { ActivityComponent.class },
    modules = { SplashModule.class })
public interface SplashComponent {
  void inject(SplashActivity splashActivity);

  SplashView getSplashView();

  SplashPresenter getSplashPresenter();
}
