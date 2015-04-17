package com.gigigo.dagger2demo.presenter;

import javax.inject.Inject;

public class MainPresenter {
  @Inject MainView mainView;

  @Inject
  public MainPresenter() {
  }

  public void doTest() {
    mainView.doTest();
  }
}
