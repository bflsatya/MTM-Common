package com.fragmadata.mtm.exceptions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;


@Builder
@Data
@AllArgsConstructor
public class MtmServiceException extends RuntimeException {
    private String message;
    private HttpStatus httpStatus;

    public MtmServiceException(String message) {
        super(message);
    }
}
