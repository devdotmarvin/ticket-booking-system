package dev.marvin.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EventRequest {
    @NotBlank(message = "Event Name is required")
    private String eventName;

    @NotBlank(message = "Event Description is required")
    private String eventDescription;

    @NotBlank(message = "Event StartDate is required")
    private LocalDateTime startDate;

    @NotBlank(message = "Event EndDate is required")
    private LocalDateTime endDate;

    @NotBlank(message = "Event Location is required")
    private String location;

    @NotBlank(message = "Event Image is required")
    private String base64EncodedImage;
}
