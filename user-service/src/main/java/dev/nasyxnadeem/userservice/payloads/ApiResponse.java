package dev.nasyxnadeem.userservice.payloads;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class ApiResponse<T> {
    private String message;
    private boolean success;
    private HttpStatus status;
    private T content;
}
