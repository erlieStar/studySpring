package com.makenv.po;

import java.util.Date;

public class Spittle {

    private Long id;
    private String message;
    private Date time;
    //维度
    private Double latitude;
    //经度
    private Double longitude;

    public long getId() {
      return id;
    }

    public String getMessage() {
      return message;
    }

    public Date getTime() {
      return time;
    }

    public Double getLongitude() {
      return longitude;
    }

    public Double getLatitude() {
      return latitude;
    }
  
}
