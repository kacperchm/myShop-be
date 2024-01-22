package com.kacperchm.auth.services;

import com.kacperchm.auth.entity.User;
import com.kacperchm.auth.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.saveAndFlush(user);
    }
}
