package io.headhuntr.core;

import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Introspected
public class Candidate {

    String id;
    String fullName;
    String headline;

    public static Candidate create(String id, String fullName) {
        return new Candidate(id, fullName, "");
    }
}
