package dev.marvin.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EventRequest {
    @NotBlank(message = "Event Name is required")
    private String eventName;

    @NotBlank(message = "Event Description is required")
    private String eventDescription;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy hh:mm a")
    @NotEmpty
    private LocalDateTime startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy hh:mm a")
    @NotEmpty
    private LocalDateTime endDate;

    @NotBlank(message = "Event Location is required")
    private String location;

    @NotBlank(message = "Event Image is required")
    private String base64EncodedImage;
}
