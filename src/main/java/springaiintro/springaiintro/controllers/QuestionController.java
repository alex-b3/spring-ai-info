package springaiintro.springaiintro.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springaiintro.springaiintro.models.*;
import springaiintro.springaiintro.services.OpenAIService;

@RestController
public class QuestionController {

    private final OpenAIService openAIService;

    public QuestionController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @PostMapping("/ask")
    public Answer askQuestion(@RequestBody Question question){
        return openAIService.getAnswer(question);
    }

    @PostMapping("/capital")
    public GetCapitalResponseWithInfo getCapital(@RequestBody GetCapitalRequest getCapitalRequest){
        return openAIService.getCapital(getCapitalRequest);
    }
}
