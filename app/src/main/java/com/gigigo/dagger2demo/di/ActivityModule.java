package com.gigigo.dagger2demo.di;

import com.gigigo.dagger2demo.BaseActivity;
import dagger.Module;
import dagger.Provides;

@Module()
public class ActivityModule {

  public BaseActivity activity;

  public ActivityModule(BaseActivity activity) {
    this.activity = activity;
  }

  @Provides @BaseActivityScope BaseActivity provideBaseActivity() {
    return activity;
  }
}
