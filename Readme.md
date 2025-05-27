# Mcpdemo Application

## 项目概述
基于Spring Boot 3.4.6构建的AI集成示例项目，演示如何通过Spring AI框架对接OpenAI模型和MCP协议服务，实现自然语言处理与工具调用功能。

## 技术栈
- **核心框架**：Spring Boot 3.4.6
- **AI框架**：Spring AI 1.0.0 (集成MCP客户端、OpenAI模型)
- **编程语言**：Java 21
- **日志组件**：Lombok + SLF4J
- **HTTP客户端**：Spring WebClient
- **测试框架**：JUnit Jupiter 5 + Reactor Test


## 功能特性
### 1. 请求日志监控
通过`WebClientCustomizer`实现：
- 拦截所有WebClient请求
- 记录请求方法/URL/Headers
- 支持调试与审计

### 2. AI对话演示
通过`CommandLineRunner`实现：
- 启动后自动执行预定义问题："昆明今天天气如何"
- 使用ChatClient调用OpenAI模型
- 输出结构化回答内容
- 自动关闭应用上下文

## 配置说明
