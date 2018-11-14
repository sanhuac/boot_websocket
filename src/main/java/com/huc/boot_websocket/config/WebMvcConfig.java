package com.huc.boot_websocket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author hucong
 * @Description /配置WebMVC
 * @Date $ $
 **/
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter{

    @Override
    public void addViewControllers(ViewControllerRegistry P_Registry) {
       P_Registry.addViewController("/login").setViewName("/login");
        P_Registry.addViewController("/chat").setViewName("/chat");
    }
}
