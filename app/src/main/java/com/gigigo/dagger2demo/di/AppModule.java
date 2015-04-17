package com.gigigo.dagger2demo.di;

import android.app.Application;
import android.content.Context;
import com.gigigo.dagger2demo.App;
import com.gigigo.dagger2demo.ImageLoader;
import com.gigigo.dagger2demo.ImageLoaderPicassoImp;
import com.squareup.picasso.Picasso;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;

@Module
public class AppModule {

  private App app;

  public AppModule(App app) {
    this.app = app;
  }

  @Provides @Named("ApplicationContext") Context providesAppContext() {
    return app.getApplicationContext();
  }

  @Provides @Singleton Application providesApplication() {
    return app;
  }

  @Provides @Singleton Picasso providePicasso(Application app) {
    return Picasso.with(app);
  }

  @Provides @Singleton @Named("Picasso") ImageLoader provideImageLoaderPicasso(
      ImageLoaderPicassoImp imp) {
    return imp;
  }
}
