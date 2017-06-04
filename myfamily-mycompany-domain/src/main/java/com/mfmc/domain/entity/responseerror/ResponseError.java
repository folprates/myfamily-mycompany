package com.mfmc.domain.entity.responseerror;

public class ResponseError {

  private int status;

  private String message;

  public ResponseError(int status, String message) {
    this.status = status;
    this.message = message;
  }

  public int getStatus() {
    return status;
  }

  public String getMessage() {
    return message;
  }

}
