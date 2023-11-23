package com.example.badminbook.service;

import com.example.badminbook.dto.UserDTO;
import com.example.badminbook.model.User;
import com.example.badminbook.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

//    Find all
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

//    Create a user
    public User createUser(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        return userRepository.save(user);
    }
}
