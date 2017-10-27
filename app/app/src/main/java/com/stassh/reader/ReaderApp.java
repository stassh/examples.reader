package com.stassh.reader;

import android.app.Activity;
import android.app.Application;
import com.stassh.reader.di.AppComponent;
import com.stassh.reader.di.AppModule;
import com.stassh.reader.di.DaggerAppComponent;


/**
 * Created by Stanislav Shabalin on 27/10/2017
 * Copyrights (c) 2017. All rights reserved.
 * Last modified 27/10/2017 15:02
 * email:slalom2001@gmail.com
 */


public class ReaderApp extends Application {

  private AppComponent component;

  @Override
  public void onCreate() {
    super.onCreate();

    component = DaggerAppComponent.builder()
        .appModule(new AppModule(this))
        .build();
  }

  public AppComponent getComponent() {
    return component;
  }

  public static ReaderApp get(Activity activity) {
    return (ReaderApp) activity.getApplication();
  }
}
