package com.gigigo.dagger2demo;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public interface ImageLoader {

  public void load(String url, ImageView imageView);

  public void load(String url, ImageView imageView, Drawable placeholder);
}
