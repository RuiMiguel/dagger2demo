package com.gigigo.dagger2demo.di;

import com.gigigo.dagger2demo.BaseActivity;
import com.gigigo.dagger2demo.ImageLoader;
import dagger.Component;
import javax.inject.Named;

/**
 * A base component upon which fragment's components may depend.  Activity-level components
 * should extend this component.
 */
@BaseActivityScope // Subtypes of ActivityComponent should be decorated with @PerActivity.
@Component(
    dependencies = { AppComponent.class },
    modules = { ActivityModule.class })
public interface ActivityComponent extends AppComponent{

  void injectActivity(BaseActivity activity);

  BaseActivity getBaseActivity();
}
