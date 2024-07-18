package dev.marvin.controller;

import dev.marvin.dto.EventRequest;
import dev.marvin.dto.ResponseDto;
import dev.marvin.service.EventService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/events")
@Slf4j
@RequiredArgsConstructor
public class EventController {

    private final EventService eventService;

    @PostMapping
    public ResponseEntity<ResponseDto<Object>> create(@Validated @RequestBody EventRequest eventRequest) {
        log.info("Inside create method of EventController");

        ResponseDto<Object> responseDTO = ResponseDto.
                builder()
                .statusCode(HttpStatus.CREATED.value())
                .status(HttpStatus.CREATED.getReasonPhrase())
                .message(eventService.create(eventRequest))
                .build();

        return ResponseEntity.ok(responseDTO);
    }

    @GetMapping
    public ResponseEntity<?> getAll(){
        return null;
    }
}
