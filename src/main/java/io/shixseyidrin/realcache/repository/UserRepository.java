package io.shixseyidrin.realcache.repository;

import io.shixseyidrin.realcache.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
