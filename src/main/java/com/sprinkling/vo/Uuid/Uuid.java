package com.sprinkling.vo.Uuid;

import lombok.Data;

import java.util.UUID;

@Data
public class Uuid {
    public static final int LENGTH = 30;
    private static final String INVALID_FORMAT = "Uid format is invalid.";

    private final String uuid;

    public static UUID uuidConstructor() { return new UuidConstructor().createUuid(); }
}
