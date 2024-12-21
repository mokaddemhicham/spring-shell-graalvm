package ma.mokaddemhicham.shell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.command.annotation.CommandScan;

@SpringBootApplication
@CommandScan
public class SpringShellGraalvmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringShellGraalvmApplication.class, args);
    }

}
