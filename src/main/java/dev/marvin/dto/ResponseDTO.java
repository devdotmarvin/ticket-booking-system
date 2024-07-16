package dev.marvin.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseDTO<T> {
    private Integer statusCode;
    private String status;
    private T payload;
}
