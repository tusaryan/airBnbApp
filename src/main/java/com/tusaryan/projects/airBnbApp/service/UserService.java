package com.tusaryan.projects.airBnbApp.service;

import com.tusaryan.projects.airBnbApp.dto.ProfileUpdateRequestDto;
import com.tusaryan.projects.airBnbApp.dto.UserDto;
import com.tusaryan.projects.airBnbApp.entity.User;

public interface UserService {

    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}
