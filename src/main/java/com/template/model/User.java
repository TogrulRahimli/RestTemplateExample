package com.template.model;

import lombok.*;

@Data
@Builder
public class User {

    private final int id;
    private final String name;
    private final int age;
}
