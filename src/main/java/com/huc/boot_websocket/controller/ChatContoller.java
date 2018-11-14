package com.huc.boot_websocket.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;



/**
 * @Author hucong
 * @Description 前端控制器
 * @Date $ $
 **/
@Controller
public class ChatContoller {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/chat")
    public void handleChat(Principal P_Principal,String msg)
    {
        String strSendTo=P_Principal.getName().equals("pxs")?"lgp":"pxs";
        System.out.println("strSendTo:"+strSendTo);
        messagingTemplate.convertAndSendToUser(strSendTo, "/queue/notifications", P_Principal.getName()+"-Send:"+msg);
    }


}
