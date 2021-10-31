package io.headhuntr.core.impl;

import io.headhuntr.core.Candidate;
import io.headhuntr.core.CandidateSearchEngine;
import io.headhuntr.core.Page;
import io.headhuntr.core.SearchParameter;
import jakarta.inject.Singleton;

import java.util.Collections;

@Singleton
public class DefaultCandidateSearchEngine implements CandidateSearchEngine {

    @Override
    public Page<Candidate> search(SearchParameter searchParameter) {
        var c = Candidate.create("123", "Test Test");
        return Page.of(Collections.singletonList(c));
    }
}
