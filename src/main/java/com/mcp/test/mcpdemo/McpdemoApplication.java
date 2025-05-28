package com.mcp.test.mcpdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.reactive.function.client.WebClientCustomizer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 主应用程序类，使用Spring Boot的@SpringBootApplication注解
 */
@SpringBootApplication
@Slf4j
public class McpdemoApplication {

    /**
     * 主程序入口
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        SpringApplication.run(McpdemoApplication.class, args);
    }





}

