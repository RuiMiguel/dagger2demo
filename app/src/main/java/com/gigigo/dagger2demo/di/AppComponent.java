package com.gigigo.dagger2demo.di;

import android.app.Application;
import android.content.Context;
import com.gigigo.dagger2demo.App;
import com.gigigo.dagger2demo.ImageLoader;
import com.squareup.picasso.Picasso;
import dagger.Component;
import javax.inject.Named;
import javax.inject.Singleton;

/**
 * A component whose lifetime is the life of the application.
 */
@Singleton // Constraints this component to one-per-application or unscoped bindings.
@Component(
    modules = { AppModule.class }
)
public interface AppComponent {
  void injectApplication(App app);

  @Named("ApplicationContext") Context getAppContext();

  Application getApplication();

  Picasso getPicasso();

  @Named("Picasso") ImageLoader getImageLoaderPicasso();
}
