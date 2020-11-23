package com.sprinkling.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public abstract class UuidBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private String uuid;

    public UuidBase(UUID uuid) { this.uuid = uuid.toString(); }
}
