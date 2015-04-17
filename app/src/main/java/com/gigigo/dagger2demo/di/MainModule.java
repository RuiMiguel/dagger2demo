package com.gigigo.dagger2demo.di;

import com.gigigo.dagger2demo.view.MainActivity;
import com.gigigo.dagger2demo.presenter.MainView;
import dagger.Module;
import dagger.Provides;

@Module()
public class MainModule {

  private MainView mainView;

  public MainModule(MainActivity mainActivity) {
    this.mainView = mainActivity;
  }

  @Provides @PerActivityScope MainView provideMainView() {
    return mainView;
  }

  //@Provides MainPresenter provideMainPresenter() { return new MainPresenter(mainView); }
}
