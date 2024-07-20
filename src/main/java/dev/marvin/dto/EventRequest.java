package dev.marvin.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.Date;

@Data
public class EventRequest {
    @NotBlank(message = "Event Name is required")
    private String eventName;

    @NotBlank(message = "Event Description is required")
    private String eventDescription;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @NotEmpty
    private Date startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @NotEmpty
    private Date endDate;

    @NotBlank(message = "Event Location is required")
    private String location;

    @NotBlank(message = "Event Image is required")
    private String base64EncodedImage;
}
