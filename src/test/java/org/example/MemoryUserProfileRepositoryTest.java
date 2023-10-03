package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class MemoryUserProfileRepositoryTest {
    private MemoryUserProfileRepository memoryUserProfileRepository;
    private static long sequence = 0L;

    @AfterEach
    void delete(){

    }


    @Test
    void save() {
        UserProfile userProfile = new UserProfile();
        Long id = sequence++;
        userProfile.setId(id);
        userProfile.setName("홍길동");

        System.out.println(userProfile.getId());
        System.out.println(userProfile.getName());

        Optional<UserProfile> userProfile1 = memoryUserProfileRepository.findById(id);
        System.out.println(userProfile1);

        Assertions.assertEquals(userProfile1.get(), userProfile);
    }

    @Test
    void findAll() {
        UserProfile userProfile = new UserProfile();
        userProfile.setName("홍길동");
        memoryUserProfileRepository.save(userProfile);

        UserProfile userProfile1 = memoryUserProfileRepository.findAll().get(0);
        Assertions.assertEquals(userProfile.getName(), userProfile1.getName());
    }

    @Test
    void findById() {
    }

    @Test
    void updateNameById() {
    }

    @Test
    void deleteById() {
    }
}