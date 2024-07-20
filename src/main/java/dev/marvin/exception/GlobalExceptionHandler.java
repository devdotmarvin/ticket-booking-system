package dev.marvin.exception;

import dev.marvin.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DuplicateResourceException.class)
    public ResponseEntity<ResponseDto<Object>> handleDuplicateResourceException(DuplicateResourceException e){
        ResponseDto<Object> responseDto = ResponseDto.builder()
                .statusCode(HttpStatus.CONFLICT.value())
                .status(HttpStatus.CONFLICT.getReasonPhrase())
                .payload(e.getMessage())
                .build();
        return ResponseEntity.status(HttpStatus.CONFLICT).body(responseDto);
    }
}
