package io.shixseyidrin.realcache.service;

import io.shixseyidrin.realcache.model.User;
import io.shixseyidrin.realcache.repository.UserRepository;
import io.shixseyidrin.realcache.response.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static io.shixseyidrin.realcache.response.Result.success;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    @CacheEvict(value = "users", allEntries = true)
    public Result<?> saveUser(User user) {
        return success(userRepository.save(user));
    }

    @Cacheable(value = "users")
    public Result<?> allUsers() {
        return success(userRepository.findAll());
    }
}
