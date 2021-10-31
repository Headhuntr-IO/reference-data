package io.headhuntr.presentation;

import io.headhuntr.core.Candidate;
import io.headhuntr.core.CandidateSearchEngine;
import io.headhuntr.core.Page;
import io.headhuntr.core.SearchParameter;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller("candidates")
public class CandidateAPI {

    private final CandidateSearchEngine searchEngine;

    @Get
    public Page<Candidate> demo() {
        return searchEngine.search(SearchParameter.empty());
    }
}