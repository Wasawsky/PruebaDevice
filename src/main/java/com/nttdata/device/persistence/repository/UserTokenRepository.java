package com.nttdata.device.persistence.repository;

import com.nttdata.device.persistence.entity.UserToken;
import org.springframework.data.repository.CrudRepository;

public interface UserTokenRepository extends CrudRepository<UserToken,Long> {
}
