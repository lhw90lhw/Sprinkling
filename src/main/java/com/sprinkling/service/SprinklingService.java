package com.sprinkling.service;

import com.sprinkling.repo.SprinklingJpaRepo;
import com.sprinkling.vo.Sprinkling;
import com.sprinkling.vo.Uuid.Uuid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@AllArgsConstructor
@Service
public class SprinklingService {
    private static SprinklingJpaRepo sprinklingJpaRepo;

    @Transactional
    public static UUID createSprinkling(Sprinkling sprinkling){
        UUID uuid = Uuid.uuidConstructor();
        sprinklingJpaRepo.saveAndFlush(sprinkling.mappingToEntity(sprinkling));
        return uuid;
    }
}
