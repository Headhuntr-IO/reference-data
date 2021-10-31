package io.headhuntr.core;

import java.util.List;

public record Page<T>(
        List<T> results,
        int page,
        int size,
        long totalCount
) {

    public static <T> Page<T> of(List<T> results) {
        return new Page<>(results, 0, results.size(), results.size());
    }
}
