package com.java.exception;

public class MyProjectException extends Exception {
  private static final long serialVersionUID = 1L;

  private String errorCode;

  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public MyProjectException(String errorCode) {
    super();
    this.errorCode = errorCode;
  }

  public MyProjectException(String message, String errorCode) {
    super(message);
    this.errorCode = errorCode;
  }

  public MyProjectException(Throwable cause, String errorCode) {
    super(cause);
    this.errorCode = errorCode;
  }

  public MyProjectException(String message, Throwable cause, String errorCode) {
    super(message, cause);
    this.errorCode = errorCode;
  }
}
