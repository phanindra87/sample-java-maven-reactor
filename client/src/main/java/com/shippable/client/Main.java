package com.shippable.client;

import com.shippable.common.MeaningOfEverythingService;
//Included line to modify for pushing changes and testing CI with VSTS
public class Main {
  public static void main () {
    MeaningOfEverythingService service = new MeaningOfEverythingService();
    App app = new App(service);
    System.out.println(app.tell());
  }
}
