package com.example.tacocloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // Создание класса контроллера
public class HomeController {

    @GetMapping("/") // Обрабатывает запросы с корневым путем
    public  String home(){
        return "home";
    }
}
