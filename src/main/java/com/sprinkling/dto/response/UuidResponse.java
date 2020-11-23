package com.sprinkling.dto.response;

import com.sprinkling.vo.Uuid.Uuid;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@Getter
@ToString
@RequiredArgsConstructor
public class UuidResponse {
    private final UUID uid;
}
