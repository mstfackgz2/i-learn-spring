package com.mstfackgz2.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api") //localhost:8080/api/ oldu genelde class seviyesinde kullanılır
public class HelloController {

    /*
        GET    : Verileri görüntülemek icin kullanılır      @GetMapping
        POST   : Verileri kaydetmek icin kullanılır         @PostMapping
        PUT    : Verileri güncellemek icin kullanılır       @PutMapping
        PATCH  : Verilerin bir bölümünü gücelllemek icin    @PatchMapping
                 kullanılır parola güncellemek gibi
        DELETE : Verileri silmek icin kullanılır            @DeleteMapping
    */

    //@GetMapping(path = "/hello")//localhost:8080/api/hello
    @RequestMapping(path = "/hello",method = RequestMethod.GET)// üstteki ile aynı get islemi icin kullanılır ama üstteki daha okunur
    public String sayHello(){
        return "Hello World";
    }

    @PostMapping(path ="/save" )
    public String save(){
        return "Data Saved";
    }

    @DeleteMapping(path ="/delete" )
    public String delete(){
        return "Data Deleted";
    }


}
