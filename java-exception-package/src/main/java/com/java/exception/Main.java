package com.java.exception;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  ArrayList<String> errorCodes = new ArrayList<>(Arrays.asList("500", "403", "400"));

  public void checkErrorCode(String errorCode) throws MyProjectException {
    // throw exception if error code already present in ArrayList
    if (errorCodes.contains(errorCode)) {
      throw new MyProjectException(errorCode + " already exists", errorCode);
    } else {
      // insert error code to ArrayList
      errorCodes.add(errorCode);
      System.out.println(errorCode + " is added to the ArrayList");
      System.out.println(errorCodes);
    }
  }

  public static void main(String[] args) {
    // create object of Main class
    Main main = new Main();

    // check if error code already present
    try {
      main.checkErrorCode("401");
    } catch (MyProjectException e) {
      e.printStackTrace();
    }
  }
}
