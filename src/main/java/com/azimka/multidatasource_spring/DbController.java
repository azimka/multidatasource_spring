package com.azimka.multidatasource_spring;

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

    @RequestMapping("/userdbInfo")
    public String getProfileDBInfo() {
        return profileService.getProfileDBInfo();
    }

    @RequestMapping("/taskdbinfo")
    public String getTaskDBInfo() {
        return taskService.getTaskDBInfo();
    }
}
