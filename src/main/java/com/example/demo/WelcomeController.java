package com.example.demo;

import com.ydsdil.opennlp.model.RootWord;
import io.reactivex.schedulers.Schedulers;
import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSTaggerME;
import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@RestController
public class WelcomeController {
    
    @GetMapping({"/", "/home"})
    public String home() {
        return "Merhaba!";
    }

    @GetMapping("/welcome")
    public String welcome() {

        return "Welcome.";
    }
}