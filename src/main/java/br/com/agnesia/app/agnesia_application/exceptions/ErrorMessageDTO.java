package br.com.agnesia.app.agnesia_application.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessageDTO {
    
    private String message;
    private String field;


}
