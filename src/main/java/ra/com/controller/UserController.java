package ra.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.com.model.User;
import ra.com.service.UserService;

import javax.validation.Valid;

@Controller
@RequestMapping("/userController")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/initLogin")
    public String initLogin() {
        return "login";
    }

    @GetMapping("/initRegister")
    public String initRegisterUser(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "register";
        }
        boolean result = userService.save(user);
        if (result) {
            return "login";
        }
        return "error";
    }
}
