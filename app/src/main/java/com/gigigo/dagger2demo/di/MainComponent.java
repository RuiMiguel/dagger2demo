package com.gigigo.dagger2demo.di;

import com.gigigo.dagger2demo.ImageLoader;
import com.gigigo.dagger2demo.MainActivity;
import com.gigigo.dagger2demo.MainPresenter;
import com.gigigo.dagger2demo.MainView;
import dagger.Component;
import javax.inject.Named;

@PerActivityScope @Component(
    dependencies = { ActivityComponent.class },
    modules = { MainModule.class })
public interface MainComponent {
  void inject(MainActivity mainActivity);

  MainView getMainView();

  MainPresenter getMainPresenter();

  @Named("Picasso") ImageLoader getImageLoaderPicasso();
}
