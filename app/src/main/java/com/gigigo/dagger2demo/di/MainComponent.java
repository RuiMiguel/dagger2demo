package com.gigigo.dagger2demo.di;

import com.gigigo.dagger2demo.utils.ImageLoader;
import com.gigigo.dagger2demo.view.MainActivity;
import com.gigigo.dagger2demo.presenter.MainPresenter;
import com.gigigo.dagger2demo.presenter.MainView;
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
