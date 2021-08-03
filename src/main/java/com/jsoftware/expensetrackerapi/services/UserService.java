package com.jsoftware.expensetrackerapi.services;

import com.jsoftware.expensetrackerapi.domain.User;
import com.jsoftware.expensetrackerapi.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName,
                      String email, String password) throws EtAuthException;
}
