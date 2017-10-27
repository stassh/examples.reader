package com.stassh.reader.di;

import android.app.Application;
import android.content.Context;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Stanislav Shabalin on 27/10/2017
 * Copyrights (c) 2017. All rights reserved.
 * Last modified 27/10/2017 14:24
 * email:slalom2001@gmail.com
 */

@Module
public class AppModule {
  private final Context context;

  public AppModule(Application application) {
    this.context = application.getApplicationContext();
  }

  @AppScope
  @Provides
  Context context() {
    return context;
  }
}
