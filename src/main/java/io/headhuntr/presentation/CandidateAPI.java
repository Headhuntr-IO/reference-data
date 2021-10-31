package io.headhuntr.presentation;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("candidates")
public class CandidateAPI {

    @Get
    public CandidateSearchResults demo() {
        return new CandidateSearchResults(123L, "Test");
    }
}

record CandidateSearchResults(Long count, String message) {}