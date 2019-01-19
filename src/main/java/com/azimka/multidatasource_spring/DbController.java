package com.azimka.multidatasource_spring;

import com.azimka.multidatasource_spring.repository.ProfileRepository;
import com.azimka.multidatasource_spring.service.ProfileService;
import com.azimka.multidatasource_spring.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbController {

    @Autowired
    private ProfileService profileService;

    @Autowired
    private TaskService taskService;

    @RequestMapping("/usercount")
    public String getUserCount() {
        return profileService.getProfileCount();
    }

    @RequestMapping("/taskcount")
    public String getTaskCount() {
        return taskService.getTaskCount();
    }
}
