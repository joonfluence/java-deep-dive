package org.example;

import java.util.List;
import java.util.Optional;

public interface UserProfileRepository {
    UserProfile save(UserProfile userProfile);
    List<UserProfile> findAll();
    Optional<UserProfile> findById(Long id);
    void updateNameById(Long id, String name);
    void deleteById(Long id);
}
