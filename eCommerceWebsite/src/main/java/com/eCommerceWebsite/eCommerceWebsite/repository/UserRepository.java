package com.eCommerceWebsite.eCommerceWebsite.repository;

public interface UserRepository {
    String findUserById(Long id);
    String findUserStartsWithB(Long id);
}

