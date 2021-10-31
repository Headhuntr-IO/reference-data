package io.headhuntr.core;

public interface CandidateSearchEngine {

    Page<Candidate> search(SearchParameter searchParameter);
}

