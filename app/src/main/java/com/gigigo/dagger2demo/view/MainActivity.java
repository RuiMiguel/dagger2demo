package com.gigigo.dagger2demo.view;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.gigigo.dagger2demo.utils.ImageLoader;
import com.gigigo.dagger2demo.presenter.MainPresenter;
import com.gigigo.dagger2demo.presenter.MainView;
import com.gigigo.dagger2demo.R;
import com.gigigo.dagger2demo.di.DaggerMainComponent;
import com.gigigo.dagger2demo.di.MainComponent;
import com.gigigo.dagger2demo.di.MainModule;
import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends BaseActivity implements MainView {

  protected MainComponent mainComponent;

  @Inject MainPresenter presenter;

  @Inject
  @Named("Picasso") ImageLoader mImageLoader;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    presenter.doTest();
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }

  @Override protected void setupComponent() {
    mainComponent = DaggerMainComponent.builder()
        .activityComponent(getBaseComponent())
        .mainModule(new MainModule(this))
        .build();

    mainComponent.inject(this);
  }

  public MainComponent getComponent() {
    return mainComponent;
  }

  @Override public void doTest() {
    Toast.makeText(MainActivity.this, "DO_TEST", Toast.LENGTH_SHORT).show();
  }
}
