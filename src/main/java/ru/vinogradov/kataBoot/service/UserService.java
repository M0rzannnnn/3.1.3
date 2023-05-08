package ru.vinogradov.kataBoot.service;



import ru.vinogradov.kataBoot.model.User;

import java.util.List;

public interface UserService {
    void add (User user);

    void update (Long id, User updatedUser);

    void delete (Long id);

    List<User> getAll ();

    User show (Long id);
}
