package dev.nasyxnadeem.hotelservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import dev.nasyxnadeem.hotelservice.payloads.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse<String>> handleResourceNotFoundException(ResourceNotFoundException ex) {
        String message = ex.getMessage();
        ApiResponse<String> response = ApiResponse
                .<String>builder()
                .message(message)
                .success(false)
                .status(HttpStatus.NOT_FOUND)
                .content(null)
                .build();

        //
        // return new ResponseEntity<ApiResponse<String>>(response,
        // HttpStatus.NOT_FOUND);

        return new ResponseEntity<ApiResponse<String>>(response, HttpStatus.OK);
    }

}
