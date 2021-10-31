package io.headhuntr.core;

public record SearchParameter(
        String jobTitle
) {

    public static SearchParameter empty() {
        return new SearchParameter("");
    }
}
