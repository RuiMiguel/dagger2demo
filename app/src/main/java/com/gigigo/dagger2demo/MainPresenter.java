package com.gigigo.dagger2demo;

import javax.inject.Inject;

public class MainPresenter {
  @Inject MainView mainView;

  @Inject
  public MainPresenter() {
    int i = 1;
  }

  public void doTest() {
    mainView.doTest();
  }
}
