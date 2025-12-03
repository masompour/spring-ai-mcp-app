package ir.arsalan.accountMcpServer;


import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {
    @Bean
    public ToolCallbackProvider tools(AccountTools accountTools) {
        return MethodToolCallbackProvider.builder()
                .toolObjects(accountTools)
                .build();
    }
}
