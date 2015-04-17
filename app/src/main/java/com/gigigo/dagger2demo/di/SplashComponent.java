package com.gigigo.dagger2demo.di;

import com.gigigo.dagger2demo.view.SplashActivity;
import com.gigigo.dagger2demo.presenter.SplashPresenter;
import com.gigigo.dagger2demo.presenter.SplashView;
import dagger.Component;

@PerActivityScope @Component(
    dependencies = { ActivityComponent.class },
    modules = { SplashModule.class })
public interface SplashComponent {
  void inject(SplashActivity splashActivity);

  SplashView getSplashView();

  SplashPresenter getSplashPresenter();
}
