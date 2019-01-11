package example.micronaut

import groovy.transform.CompileStatic
import io.micronaut.scheduling.annotation.Scheduled
import javax.inject.Singleton

@CompileStatic
@Singleton
class DailyEmailJob {
    protected final EmailUseCase emailUseCase

    DailyEmailJob(EmailUseCase emailUseCase) {
        this.emailUseCase = emailUseCase
    }

    @Scheduled(cron = "20 39 7 1/1 * ?")
    void execute() {
        emailUseCase.send("john.doe@micronaut.example", "Test Message")
    }
}
