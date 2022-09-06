package com.example.springtest;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Study {
    private int limit;
    private String name;

    public Study(int limit, String name) {
        this.limit = limit;
        this.name = name;
    }

    public Study(int limit) {
        if (limit <  0) {
            throw new IllegalArgumentException("limit 은 0 보다 커야 한다.");
        }
        this.limit = limit;
    }
}
