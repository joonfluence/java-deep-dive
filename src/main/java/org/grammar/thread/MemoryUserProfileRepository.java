package org.grammar.thread;

import java.util.*;

public class MemoryUserProfileRepository implements UserProfileRepository{
    private static Map<Long, UserProfile> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public UserProfile save(UserProfile userProfile) {
        UserProfile userProfile1 = new UserProfile();
        userProfile1.setId(sequence++);
        userProfile1.setName(userProfile.getName());
        return userProfile1;
    }

    @Override
    public List<UserProfile> findAll() {
        return new ArrayList(store.values());
    }

    @Override
    public Optional<UserProfile> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public void updateNameById(Long id, String name) {
        Optional<UserProfile> userProfile = this.findById(id);

        if(userProfile.isPresent()){
            UserProfile foundOne = userProfile.get();
            foundOne.setName(name);
            return;
        } else {
            throw new IllegalArgumentException("not existed");
        }
    }

    @Override
    public void deleteById(Long id) {

    }
}
