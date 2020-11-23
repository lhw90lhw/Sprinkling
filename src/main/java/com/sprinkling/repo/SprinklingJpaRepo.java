package com.sprinkling.repo;

import com.sprinkling.entity.SprinklingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SprinklingJpaRepo extends JpaRepository<SprinklingEntity, Long> {
}
