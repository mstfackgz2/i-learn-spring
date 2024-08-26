package com.mstfackgz2.controller;

import com.mstfackgz2.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/header")
    public String getHeader(@RequestHeader("My-Header") String myHeader){//gelen istegin icersinde My-Header isminde bir bilgi yoksa bad request doner
        return "your header" + myHeader;
    }


    // request body json verilerini dogrudan bir nesneye esitler
    @PostMapping("users")
    public User saveUser(@RequestBody User user){
        user.setPassword("");
        System.out.println("user saved");
        return user;
    }

    // request body json verilerini dogrudan bir nesneye esitler
    @PostMapping("users-all")
    public List<User> saveAllUser(@RequestBody List<User> users){
        users.forEach(user -> user.setPassword(""));
        System.out.println("users saved");
        return users;
    }

    //@GetMapping(path = "/message1/{message}") // tek seferli icin kullanılabılır
    @GetMapping({"/message1","/message1/{message}"}) // bu sekılde de mesaj gelmesede calısacak sekılde ayarladık
    public String getMyMessage1(@PathVariable(name = "message",
            required = false/*kullanıcı mesaj girmese bu metottan faydalanbılır */) String message) {//pathhden gelen değeri değiştirir
        return "Your Message is: " + message;
    }

    @GetMapping(path = "/message2") //
    public String getMyMessage2(@RequestParam(name = "message",//message2?message= den sonra gelenler parametre olarak kabul edılır
                            required = false,
                            defaultValue = "default messagge") String message) {
        return "Your Message is: " + message;
    }


}
