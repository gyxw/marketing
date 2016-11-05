package com.iac.activity.admin.web.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iac.activity.admin.web.AbstractController;

@Controller
@RequestMapping
public class AdminController extends AbstractController {

    @RequestMapping(value="login", method=RequestMethod.GET)
    public String login() {
        return "login";
    }
}
