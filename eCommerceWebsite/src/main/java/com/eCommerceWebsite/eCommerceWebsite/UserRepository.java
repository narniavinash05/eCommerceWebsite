package com.eCommerceWebsite.eCommerceWebsite;

public interface UserRepository {
    String findUserById(Long id);
    String findUserStartsWithB(Long id);
}

