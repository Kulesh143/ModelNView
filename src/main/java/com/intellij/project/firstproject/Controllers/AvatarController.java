package com.intellij.project.firstproject.Controllers;

import com.intellij.project.firstproject.Alien;
import com.intellij.project.firstproject.Avatar;
import com.intellij.project.firstproject.AvatarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AvatarController {
    @Autowired
    AvatarRepo avatarRepo;
    @RequestMapping("/")
    public String  home(){

        return "home";
    }
    @RequestMapping("/addAvatar")
    public String addAlien(Avatar avatar){
    avatarRepo.save(avatar);

        return "home";
}
}
