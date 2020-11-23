package com.sprinkling.controller.v1;

import com.sprinkling.dto.request.SprinklingRequest;
import com.sprinkling.dto.response.UuidResponse;
import com.sprinkling.repo.SprinklingJpaRepo;
import com.sprinkling.service.SprinklingService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

@Api(tags = {"1. Sprinkling"})
@AllArgsConstructor
@RestController
@RequestMapping(value = "/v1/sprinkling")
public class SprinklingController {
    private final SprinklingService sprinklingService;
    private final SprinklingJpaRepo sprinklingJpaRepo;


    @PostMapping
    @ResponseBody
    public ResponseEntity<UuidResponse> createSprinkling(@RequestBody SprinklingRequest sprinklingRequest) throws HttpClientErrorException.BadRequest{
        return ResponseEntity.ok(new UuidResponse(SprinklingService.createSprinkling(sprinklingRequest.getSprinkling())));
    }
}
