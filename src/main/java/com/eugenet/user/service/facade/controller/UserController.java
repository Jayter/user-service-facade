package com.eugenet.user.service.facade.controller;

import com.eugenet.user.service.facade.entity.UserEntity;
import com.eugenet.user.service.facade.service.UserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @ResponseBody
    @GetMapping(value = "/list")
    public List<UserEntity> list() {
        return userService.listAll();
    }
}
