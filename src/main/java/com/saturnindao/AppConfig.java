package com.saturnindao;
/* Created by Saturnin Dao on 10/12/2021 02:52 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.saturnindao.repository.file","com.saturnindao.service","com.saturnindao.controller"})
@PropertySource("classpath:application.properties")
public class AppConfig {
}
