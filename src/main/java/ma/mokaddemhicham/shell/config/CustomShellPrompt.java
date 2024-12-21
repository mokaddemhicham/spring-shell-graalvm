package ma.mokaddemhicham.shell.config;

import org.jline.utils.AttributedString;
import org.springframework.context.annotation.Configuration;
import org.springframework.shell.jline.PromptProvider;

/**
 * @Author: Hicham Mokaddem
 * @Date: 2024-12-21
 * @Version: 1.0
 * @Description: This class is used to customize the shell prompt
 */
@Configuration
public class CustomShellPrompt implements PromptProvider {


    @Override
    public AttributedString getPrompt() {
        return new AttributedString("ToDo:>");
    }
}
