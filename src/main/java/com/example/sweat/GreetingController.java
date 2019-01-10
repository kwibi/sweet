package com.example.sweat;
//import com.example.sweat.domain.Message;
import com.example.sweat.domain.Register;
//import com.example.sweat.repos.MessageRepo;

import com.example.sweat.repos.RegisterDao;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class GreetingController {

   /* @Autowired
    private MessageRepo messageRepo;*/
    @Autowired
    private RegisterDao registerDao;
    @Autowired
    private Register register;


   /* @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="World") String name,
            Map<String, Object> model
    ) {

        model.put("name", name);
        return "greeting";
    }*/
    /*@GetMapping

    public String main(Map<String, Object> model) {
        Iterable<Message> messages = messageRepo.findAll();
        model.put("messages", messages);
        return "main";

    }*/
   /* @PostMapping
    public String add(@RequestParam String text, @RequestParam String tag, Map<String, Object> model) {
       // Message message = new Message(text, tag);
      //  messageRepo.save(message);
        Iterable<Message> messages = messageRepo.findAll();
        model.put("messages", messages);
        return "main";
    }*/

    /*@PostMapping("filter")
    public String filter(@RequestParam String filter, Map<String, Object> model) {
        Iterable<Message> messages;
        if (filter != null && !filter.isEmpty()) {
            messages = messageRepo.findByTag(filter);
        } else {
            messages = messageRepo.findAll();
        }
        model.put("messages", messages);
        return "main";

    }*/
    @GetMapping("register")
    public String reg (){
        return "register";
    }
  @PostMapping("register")
    public String register(String userName,String passWord,String nickName){
        Register register = new Register();
      register.setUsername(userName);
      register.setPass(passWord);
      register.setNickname(nickName);
      Long id = registerDao.userInsert(register);
        return "register";
        }
    }
