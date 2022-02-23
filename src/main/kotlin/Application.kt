import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
class Application {

    fun main(args: Array<String>) {
        runApplication<Application>(*args)
    }



}
