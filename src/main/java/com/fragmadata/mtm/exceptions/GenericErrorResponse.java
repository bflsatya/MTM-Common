package com.fragmadata.mtm.exceptions;

import lombok.*;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GenericErrorResponse {
    private String message;
    private HttpStatus httpStatus;
    private int httpStatusValue;
}
