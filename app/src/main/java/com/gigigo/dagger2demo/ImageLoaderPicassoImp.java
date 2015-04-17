package com.gigigo.dagger2demo;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import javax.inject.Inject;

public class ImageLoaderPicassoImp implements ImageLoader {

  private Picasso picasso;

  @Inject
  public ImageLoaderPicassoImp(Picasso  picasso) {
    this.picasso = picasso;
  }


  @Override public void load(String url, ImageView imageView) {
    this.picasso.load(url).into(imageView);
  }

  @Override public void load(String url, ImageView imageView, Drawable placeholder) {
    this.picasso.load(url).placeholder(placeholder).into(imageView);
  }
}
