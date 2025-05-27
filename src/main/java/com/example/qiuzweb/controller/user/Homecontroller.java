package com.example.qiuzweb.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homecontroller {

    @GetMapping("/Login")
    public String loginPage() {
        return "user/Login";
    }

    @GetMapping("/Signup")
    public String signupPage() {
        return "user/Signup";
    }

    @GetMapping("/Password")
    public String passwordPage() {
        return "user/Password";
    }
    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping("/accounts")
    public String accounts() {
        return "account-management";
    }

    @GetMapping("/quizzes")
    public String quizzes() {
        return "quiz-management";
    }

    @GetMapping("/quizzes/create")
    public String createQuiz() {
        return "create-account";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login";
    }
}
