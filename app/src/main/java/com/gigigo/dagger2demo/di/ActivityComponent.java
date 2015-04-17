package com.gigigo.dagger2demo.di;

import com.gigigo.dagger2demo.view.BaseActivity;
import dagger.Component;

/**
 * A base component upon which fragment's components may depend.
 */
@BaseActivityScope
@Component(
    dependencies = { AppComponent.class },
    modules = { ActivityModule.class })
public interface ActivityComponent extends AppComponent {

  void injectActivity(BaseActivity activity);

  BaseActivity getBaseActivity();
}
