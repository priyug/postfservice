package com.demo.postfservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostfController {

    @GetMapping(value = "/{postId}")
    public Postf getPost(@PathVariable ("postId") String postId){
       Postf post = new Postf("12","House","patanjali");
       return  post;
    }

    @GetMapping("/uersf/{userid}")
    public Postf getPostMicro(@PathVariable ("userid") String userid){
        Postf post = new Postf("15","FeiName","FGeiiTest");
        return  post;
    }


}
