package io.headhuntr.core;

import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Introspected
public class Page<T> {

    List<T> results;
    int page;
    int size;
    long totalCount;

    public static <T> Page<T> of(List<T> results) {
        return new Page<>(results, 0, results.size(), results.size());
    }
}
