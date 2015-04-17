package com.gigigo.dagger2demo.di;

import com.gigigo.dagger2demo.SplashActivity;
import com.gigigo.dagger2demo.SplashView;
import dagger.Module;
import dagger.Provides;

@Module()
public class SplashModule {

  private SplashView splashView;

  public SplashModule(SplashActivity splashActivity) {
    this.splashView = splashActivity;
  }

  @Provides @PerActivityScope SplashView provideSplashView() {
    return splashView;
  }

  //@Provides SplashPresenter provideSplashPresenter() {
  //  return new SplashPresenter();
  //}
}