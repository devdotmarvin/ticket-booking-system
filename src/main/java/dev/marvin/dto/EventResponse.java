package dev.marvin.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EventResponse {
    private String eventName;
    private String eventDescription;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String location;
    private Byte[] imageBytes;
}
