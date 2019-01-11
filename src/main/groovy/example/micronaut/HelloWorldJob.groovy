package example.micronaut

import groovy.util.logging.Slf4j
import io.micronaut.scheduling.annotation.Scheduled
import javax.inject.Singleton
import java.text.SimpleDateFormat
import groovy.transform.CompileStatic

@CompileStatic
@Singleton
@Slf4j
class HelloWorldJob {


    //  	Create trigger every 10 seconds

    @Scheduled(fixedDelay = "10s")
    void executeEveryTen() {
        log.info(
                "Simple Job every 10 seconds :{}",
                new SimpleDateFormat("dd/M/yyyy hh:mm:ss").format(new Date())
        )
    }


    //  	Create another trigger every 45 seconds with an initial delay of 5 seconds (5000 millis)

    @Scheduled(fixedDelay = "45s", initialDelay = "5s")
    void executeEveryFourtyFive() {
        log.info(
                "Simple Job every 45 seconds :{}",
                new SimpleDateFormat("dd/M/yyyy hh:mm:ss").format(new Date())
        )
    }
}
