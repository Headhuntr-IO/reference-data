package io.headhuntr.presentation;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.Getter;

@Controller("candidates")
public class CandidateAPI {

    @Get
    public CandidateSearchResults demo() {
        return new CandidateSearchResults();
    }
}

@Getter
class CandidateSearchResults {

    Long count = 0L;
    String message = "Test";
}
