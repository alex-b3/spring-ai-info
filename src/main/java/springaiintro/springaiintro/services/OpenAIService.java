package springaiintro.springaiintro.services;

import springaiintro.springaiintro.models.Answer;
import springaiintro.springaiintro.models.GetCapitalRequest;
import springaiintro.springaiintro.models.Question;

public interface OpenAIService {

    String getAnswer(String prompt);

    Answer getAnswer(Question question);

    Answer getCapital(GetCapitalRequest getCapitalRequest);
}
