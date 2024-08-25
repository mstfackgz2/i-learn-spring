package com.mstfackgz2.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyController {


    //@GetMapping(path = "/message1/{message}") // tek seferli icin kullanılabılır
    @GetMapping({"/message1","/message1/{message}"}) // bu sekılde de mesaj gelmesede calısacak sekılde ayarladık
    public String getMyMessage1(@PathVariable(name = "message",
            required = false/*kullanıcı mesaj girmese bu metottan faydalanbılır */) String message) {//pathhden gelen değeri değiştirir
        return "Your Message is: " + message;
    }

    @GetMapping(path = "/message2")
    public String getMyMessage2(@RequestParam(name = "message") String message) {//message2?message= den sonra gelenler parametre olarak kabul edılır
        return "Your Message is: " + message;
    }


}
