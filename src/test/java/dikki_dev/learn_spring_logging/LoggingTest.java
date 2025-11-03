package dikki_dev.learn_spring_logging;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@Slf4j
@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
public class LoggingTest {

    @Test
    void testLogging(){
        log.info("Test Info - Hello Info");
        log.warn("Test Warn - Hello Warn");
        log.error("Test Error - Hello Error");

        /*
         -- Default Log Format --
        2025-11-03T13:18:19.760+07:00  INFO 16268 --- [learn-spring-logging] [           main] d.learn_spring_logging.LoggingTest       : Starting LoggingTest using Java 25 with PID 16268
        2025-11-03T13:18:19.763+07:00  INFO 16268 --- [learn-spring-logging] [           main] d.learn_spring_logging.LoggingTest       : No active profile set, falling back to 1 default profile: "default"
        2025-11-03T13:18:20.439+07:00  INFO 16268 --- [learn-spring-logging] [           main] d.learn_spring_logging.LoggingTest       : Started LoggingTest in 1.252 seconds (process running for 3.079)
        2025-11-03T13:18:21.548+07:00  INFO 16268 --- [learn-spring-logging] [           main] d.learn_spring_logging.LoggingTest       : Test Info - Hello Info
        2025-11-03T13:18:21.549+07:00  WARN 16268 --- [learn-spring-logging] [           main] d.learn_spring_logging.LoggingTest       : Test Warn - Hello Warn
        2025-11-03T13:18:21.549+07:00 ERROR 16268 --- [learn-spring-logging] [           main] d.learn_spring_logging.LoggingTest       : Test Error - Hello Error

        - Default Log Format itu di Spring Boot itu ke Console
        - Kita bisa mengganti arah output dan default level Log nya dari "application.properties" dengan prefix "logging.level.nama.package.nya=warn"
        - Atau bisa dari root "logging.level.root=info"
         */
    }

    @Test
    void testLongLogging(){
        for(int i = 0; i < 1_000; i++){
            log.warn("Log-" + i);
        }
    }
}
