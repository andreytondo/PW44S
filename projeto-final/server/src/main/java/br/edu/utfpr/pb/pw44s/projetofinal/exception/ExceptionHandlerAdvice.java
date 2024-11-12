package br.edu.utfpr.pb.pw44s.projetofinal.exception;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler({ConstraintViolationException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public RestWarnException handlerSQLException(ConstraintViolationException exception, HttpServletRequest request) {
        return new RestWarnException(HttpStatus.BAD_REQUEST.value(), "Erro ao realizar o registro no banco de dados", request.getServletPath(), null);
    }

    @ExceptionHandler({DataIntegrityViolationException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public RestWarnException handlerSQLException(DataIntegrityViolationException exception, HttpServletRequest request) {
        return new RestWarnException(HttpStatus.BAD_REQUEST.value(), "Erro na integridade dos dados", request.getServletPath(), null);
    }

    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public RestWarnException handlerValidationException(MethodArgumentNotValidException exception, HttpServletRequest request) {
        BindingResult result = exception.getBindingResult();

        Map<String, String> validationErrors = new HashMap<>();

        for(FieldError fieldError: result.getFieldErrors()) {
            validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
        }

        return new RestWarnException(HttpStatus.BAD_REQUEST.value(), "Erro ao validar as informações!", request.getServletPath(), validationErrors);
    }
}