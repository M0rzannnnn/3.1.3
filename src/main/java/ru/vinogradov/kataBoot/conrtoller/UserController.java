package ru.vinogradov.kataBoot.conrtoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.vinogradov.kataBoot.model.User;
import ru.vinogradov.kataBoot.service.UserService;
import ru.vinogradov.kataBoot.service.UserServiceImp;

import java.security.Principal;

@Controller
public class UserController {
    @Autowired
    UserService userService = new UserServiceImp();

    @GetMapping("/user")
    public String onlyForUser (Principal principal, ModelMap model) {
        User user = userService.findByUsername(principal.getName());
        model.addAttribute("user", user);
        return "user";
    }

}
