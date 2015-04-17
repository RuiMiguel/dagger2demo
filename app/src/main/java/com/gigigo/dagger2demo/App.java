package com.gigigo.dagger2demo;

import android.app.Application;
import com.gigigo.dagger2demo.di.AppComponent;
import com.gigigo.dagger2demo.di.AppModule;
import com.gigigo.dagger2demo.di.DaggerAppComponent;

public class App extends Application {

  private AppComponent appComponent;

  @Override public void onCreate() {
    super.onCreate();

    setupGraph();
  }

  private void setupGraph() {
    appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();

    appComponent.injectApplication(this);
  }

  public AppComponent getComponent() {
    return appComponent;
  }
}
