package fr.m1iii.rappel.service;

import fr.m1iii.rappel.entity.User;
import fr.m1iii.rappel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll() {
        userRepository.save(new User("Michel"));
        return userRepository.findAll();
    }

    public User findById(long id) {
        return userRepository.findById(id);
    }

    public User create(User user) {
        return userRepository.save(user);
    }

    public User update(User user) {
        // TODO : manipulation
        return userRepository.save(user);
    }

    public String deleteById(long id) {
        userRepository.deleteById(id);
        return "User with id "+ id + " deleted";
    }

    public String delete(User user) {
        userRepository.delete(user);
        return "User with id "+ user.getId() + " deleted";


    }
}
