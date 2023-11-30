package com.nike.mobileapppttpoc.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChannelUsers {

  private Channel channel;

  private List<User> users;

}
