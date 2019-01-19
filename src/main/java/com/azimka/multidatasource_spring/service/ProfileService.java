package com.azimka.multidatasource_spring.service;

import com.azimka.multidatasource_spring.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public String getProfileCount(){
        return profileRepository.getProfileCount();
    }
}
