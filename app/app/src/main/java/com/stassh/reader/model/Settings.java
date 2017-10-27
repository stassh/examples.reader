package com.stassh.reader.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stanislav Shabalin on 27/10/2017
 * Copyrights (c) 2017. All rights reserved.
 * Last modified 27/10/2017 13:47
 * email:slalom2001@gmail.com
 */


public class Settings {
  List<Opds> opdsList;

  public Settings() {
    opdsList = new ArrayList<>();
    Opds value = new Opds();
    value.setTitle("Flibusta");
    value.setUrl("http://flibusta.is/opds/");
    opdsList.add(value);
    opdsList.add(value);
  }

  public List<Opds> getOpdsList() {
    return opdsList;
  }
}
