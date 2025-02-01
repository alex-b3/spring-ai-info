package springaiintro.springaiintro.services;

import springaiintro.springaiintro.models.*;

public interface OpenAIService {

    String getAnswer(String prompt);

    Answer getAnswer(Question question);

    GetCapitalResponseWithInfo getCapital(GetCapitalRequest getCapitalRequest);
}
