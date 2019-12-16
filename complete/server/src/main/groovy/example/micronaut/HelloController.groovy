package example.micronaut

import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.micronaut.http.MediaType

@CompileStatic
@Controller("/")
class HelloController {
    @Get("/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    String hello(def name) {
        "Hello, $name"
    }
}
