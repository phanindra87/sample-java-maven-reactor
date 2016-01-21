package com.shippable.client;

import com.shippable.common.MeaningOfEverythingService;
//Included line to modify for pushing changes and testing CI with Visual Studio Team Services and Jenkins
public class Main {
  public static void main () {
    MeaningOfEverythingService service = new MeaningOfEverythingService();
    App app = new App(service);
    //Output
    System.out.println(app.tell());//print app.tell()
  }
}
