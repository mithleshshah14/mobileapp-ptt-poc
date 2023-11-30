package com.nike.mobileapppttpoc.repository;

import com.nike.mobileapppttpoc.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

  @Query("select u.deviceToken from User u INNER JOIN UserChannel c on u.id=c.usedId where u.id!=?1 and c.channelId = ?2")
  public List<String> findDeviceTokenByUserId(int userId, String channelId);


  public List<User>  findAllByIdIn(List<Integer> userId);

  public List<User> findAllByIdNotIn(List<Integer> userId);

}
