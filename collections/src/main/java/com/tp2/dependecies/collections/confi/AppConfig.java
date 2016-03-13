/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tp2.dependecies.collections.confi;

import com.tp2.dependecies.collections.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Roman
 */
@Configuration
public class AppConfig {
    
    @Bean(name="test")
    public Person getPerson()
    {
        return null;
    }
    
}
