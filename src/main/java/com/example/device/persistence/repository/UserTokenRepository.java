package com.example.device.persistence.repository;

import com.example.device.persistence.entity.UserToken;
import org.springframework.data.repository.CrudRepository;

public interface UserTokenRepository extends CrudRepository<UserToken,Long> {

}
