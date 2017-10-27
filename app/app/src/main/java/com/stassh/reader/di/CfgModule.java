package com.stassh.reader.di;

import com.stassh.reader.model.Settings;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Stanislav Shabalin on 27/10/2017
 * Copyrights (c) 2017. All rights reserved.
 * Last modified 27/10/2017 14:31
 * email:slalom2001@gmail.com
 */

@Module
public class CfgModule {
  private final Settings settings;
  public CfgModule() {
    settings = new Settings();
  }

  @AppScope
  @Provides
  Settings settings() {
    return settings;
  }
}
