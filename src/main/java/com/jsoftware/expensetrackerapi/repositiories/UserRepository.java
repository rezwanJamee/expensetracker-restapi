package com.jsoftware.expensetrackerapi.repositiories;

import com.jsoftware.expensetrackerapi.domain.User;
import com.jsoftware.expensetrackerapi.exceptions.EtAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}
