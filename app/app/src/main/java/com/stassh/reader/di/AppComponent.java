package com.stassh.reader.di;

import android.content.Context;
import com.stassh.reader.MainActivity;
import com.stassh.reader.model.Settings;
import dagger.Component;
import dagger.Module;

/**
 * Created by Stanislav Shabalin on 27/10/2017
 * Copyrights (c) 2017. All rights reserved.
 * Last modified 27/10/2017 14:11
 * email:slalom2001@gmail.com
 */

@AppScope
@Component(modules = { AppModule.class, CfgModule.class } )
public interface AppComponent {
  Context context();
  Settings settings();

  void inject(MainActivity activity);
}
