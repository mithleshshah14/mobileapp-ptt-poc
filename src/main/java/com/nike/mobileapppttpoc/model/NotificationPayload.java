package com.nike.mobileapppttpoc.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationPayload {

  private String channelName;

  private String userName;

  private String channelUuid;

  private String audioUrl;

  private String message;

}
