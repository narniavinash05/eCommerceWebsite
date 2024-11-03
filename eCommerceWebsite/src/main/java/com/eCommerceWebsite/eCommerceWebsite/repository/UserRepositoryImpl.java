package com.eCommerceWebsite.eCommerceWebsite.repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private static final Logger log = LoggerFactory.getLogger(UserRepositoryImpl.class);
    private final Map<Long, String> users = new HashMap<>();

    public UserRepositoryImpl() {
        // Sample data
        users.put(1L, "John Doe");
        users.put(2L, "Jane Doe");
        users.put(3L, "Bhavesh");
        users.put(4L, "Bhavin");
        users.put(5L, "Bhavya");
        users.put(6L, "Bhavana");
    }

    @Override
    public String findUserById(Long id) {
        return users.getOrDefault(id, "User not found");
    }

    @Override
    public String findUserStartsWithB(Long id) {
        return users.entrySet().stream()
                .filter(entry -> entry.getKey().equals(id)) // Filter by user ID
                .map(Map.Entry::getValue) // Map to user name
                .filter(name -> name.startsWith("B")) // Check if name starts with 'B'
                .map(String::toUpperCase) // Convert to uppercase
                .findFirst() // Get the first match
                .orElse("User not found"); // Default message if no match
    }
}

