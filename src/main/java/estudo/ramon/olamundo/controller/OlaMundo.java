package estudo.ramon.olamundo.controller;

import org.apache.logging.log4j.message.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OlaMundo {

    @GetMapping(value = "/basic/get/olaMundo", produces = "application/json")
    public ResponseEntity getHello() {
        System.out.println("/basic/get/olaMundo");
    return new ResponseEntity("Olá Mundo", HttpStatus.OK);
    }

    @PostMapping(value = "/basic/post/olaMundo", produces = {"application/json"}, consumes = {"application/json"})
    public ResponseEntity postHello() {
        System.out.println("/basic/post/olaMundo");
        return new ResponseEntity("Olá Mundo", HttpStatus.OK);
    }

    @PutMapping(value = "/basic/put/olaMundo", produces = {"application/json"}, consumes = {"application/json"})
    public ResponseEntity putHello() {
        System.out.println("/basic/put/olaMundo");
        return new ResponseEntity("Olá Mundo", HttpStatus.OK);
    }

    @DeleteMapping(value = "/basic/delete/olaMundo", produces = {"application/json"}, consumes = {"application/json"})
    public ResponseEntity deleteHello(@Valid @RequestBody OlaMundoRequest body) {
        return new ResponseEntity("Olá Mundo", HttpStatus.OK);
    }
}
