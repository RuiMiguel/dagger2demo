package com.gigigo.dagger2demo;

import java.util.Timer;
import java.util.TimerTask;
import javax.inject.Inject;

public class SplashPresenter {
  private static final long SPLASH_SCREEN_DELAY = 3000;

  @Inject SplashView view;

  @Inject
  public SplashPresenter() {
    int i = 1;
  }

  public void uiLoaded() {
    startTimer();
  }

  private void startTimer() {
    TimerTask task = new TimerTask() {
      @Override public void run() {
        view.finishSplash();
      }
    };

    Timer timer = new Timer();
    timer.schedule(task, SPLASH_SCREEN_DELAY);
  }
}
