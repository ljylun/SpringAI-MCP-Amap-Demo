package com.mcp.test.mcpdemo.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;


@RestController
@RequestMapping("/llm")
public class LLMController {
    private final ChatClient chatClient;

    public LLMController(ChatClient.Builder builder) {
        this.chatClient = builder.build();;
    }

    @GetMapping(path = "/stream", produces = MediaType.TEXT_HTML_VALUE)
    public Flux<String> helloStream(@RequestParam(name = "input", defaultValue = "AI编程趋势是什么") String input) {
        return chatClient.prompt(input)
                .stream()
                .content();
    }

}
