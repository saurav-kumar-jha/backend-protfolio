package com.protofolio.Client.data.Exception;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;

@AllArgsConstructor
@ControllerAdvice
public class GlobalException extends RuntimeException{

    public GlobalException(String message){
        super(message);
    }
}
