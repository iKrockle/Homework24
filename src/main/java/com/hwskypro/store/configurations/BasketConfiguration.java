package com.hwskypro.store.configurations;

import com.hwskypro.store.components.Basket;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class BasketConfiguration {
    @Bean
    @SessionScope
    public Basket basket(){
        return new Basket();
    }
}
