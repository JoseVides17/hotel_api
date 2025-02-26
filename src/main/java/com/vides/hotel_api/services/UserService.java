package com.vides.hotel_api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.vides.hotel_api.dao.UserRepository;
import com.vides.hotel_api.dto.Login.LoginRequest;
import com.vides.hotel_api.dto.Login.LoginResponse;
import com.vides.hotel_api.dto.User.UserRequest;
import com.vides.hotel_api.dto.User.UserResponse;
import com.vides.hotel_api.models.User;
import com.vides.hotel_api.util.JWTUtil;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private JWTUtil jwtUtil;

    public LoginResponse login(LoginRequest loginRequest) throws Exception{
        if (loginRequest == null) {
            throw new Exception("Invalid login request");
        }

        if (loginRequest.getUsername() == null || loginRequest.getPassword() == null) {
            throw new Exception("Invalid login request");
        }

        User user = userRepository.findByUsername(loginRequest.getUsername());

        if (user == null) {
            throw new Exception("Invalid login request");
        }

        if (!this.bCryptPasswordEncoder.matches(loginRequest.getPassword(), user.getPassword())) {
            throw new Exception("Invalid login request");
        }

        return new LoginResponse(this.jwtUtil.generateToken(user.getRole()), "Login exitoso");
    }

    public UserResponse create(UserRequest userRequest) throws Exception{
        if (userRequest == null) {
            throw new Exception("Invalid user request");
        }

        if (userRequest.getUsername() == null || userRequest.getPassword() == null || userRequest.getRole() == null) {
            throw new Exception("Invalid user request");
        }

        User user = new User();
        user.setUsername(userRequest.getUsername());
        user.setPassword(this.bCryptPasswordEncoder.encode(userRequest.getPassword()));
        user.setRole(userRequest.getRole());

        this.userRepository.save(user);

        return new UserResponse(user.getUsername(), user.getRole(), "Usuario creado exitosamente");
    }

}
