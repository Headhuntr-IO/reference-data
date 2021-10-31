package io.headhuntr.core;

public record Candidate(
        String id,
        String fullName,
        String headline
) {
    public static Candidate create(String id, String fullName) {
        return new Candidate(id, fullName, "");
    }
}
