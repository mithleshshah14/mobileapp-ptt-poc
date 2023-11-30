package com.nike.mobileapppttpoc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class UserChannel {

  @Id
  private int usedId;

  private String channelId;

  private String pttToken;

}
