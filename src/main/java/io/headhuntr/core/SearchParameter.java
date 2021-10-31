package io.headhuntr.core;

import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Introspected
public class SearchParameter {

    String jobTitle;

    public static SearchParameter empty() {
        return new SearchParameter("");
    }
}
