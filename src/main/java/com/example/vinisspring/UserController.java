package com.example.vinisspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("/")
  public String showForm(Model model) {
    model.addAttribute("user", new User());
    return "index";
  }

  @PostMapping("/save")
  public String saveUser(@ModelAttribute User user, RedirectAttributes redirectAttributes) {
    userService.saveUser(user);


    redirectAttributes.addFlashAttribute("message", "Submission Successful!");
    //redirectAttributes.addAttribute("user",new User());
    return "redirect:/";
  }

}