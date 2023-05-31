package com.codecool.elproyectegrande.service;

import com.codecool.elproyectegrande.controller.dto.NewUserDTO;
import com.codecool.elproyectegrande.controller.dto.UserDTO;
import com.codecool.elproyectegrande.dao.model.User;
import com.codecool.elproyectegrande.dao.user.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
@Service
public class UserService implements UserDAO {
    private final List<User> users;

    @Autowired
    public UserService() {
        this.users = new ArrayList<>();
    }
    @Override
    public List<UserDTO> getAllUsers(){
        return users.stream().map(this::convertUserToDTO).toList();
    }

    @Override
    public UserDTO getUserByID(int id) {
        return convertUserToDTO(users.stream().filter(user -> user.getUserID() == id).findFirst().orElseThrow(NoSuchElementException::new));
    }

    @Override
    public void addNewUser(NewUserDTO user) {
        users.add(convertDTOtoUser(user));
    }
    private User convertDTOtoUser(NewUserDTO userDTO){
        return new User(users.size(),userDTO.username(),userDTO.password());
    }
    private UserDTO convertUserToDTO(User user){
        return new UserDTO(user.getUserID(),user.getUsername(),user.getPassword());
    }
}
