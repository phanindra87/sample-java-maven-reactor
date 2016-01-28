package com.shippable.client;

import com.shippable.common.MeaningOfEverythingService;
//Including this line for testing automated build in jenkins and IntelliJ
public class App {
  private MeaningOfEverythingService service;

  public App(MeaningOfEverythingService service) {
    this.service = service;
  }
//Including this line for testing automated build in TeamCity
	public String tell() {
		return "The answer is :" + service.getMeaningofEverything();//Modified to test failed test in Team City
	}
}
