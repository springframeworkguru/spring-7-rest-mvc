package guru.springframework.spring6restmvc.controller;

<<<<<<< Updated upstream
=======
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
>>>>>>> Stashed changes
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.TransactionSystemException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

<<<<<<< Updated upstream
/**
 * Created by jt, Spring Framework Guru.
 */
=======
>>>>>>> Stashed changes
@ControllerAdvice
public class CustomErrorController {

    @ExceptionHandler
    ResponseEntity handleJPAViolations(TransactionSystemException exception){
<<<<<<< Updated upstream
        return ResponseEntity.badRequest().build();
=======
        ResponseEntity.BodyBuilder responseEntity = ResponseEntity.badRequest();

        if (exception.getCause().getCause() instanceof ConstraintViolationException){
            ConstraintViolationException ve = (ConstraintViolationException) exception.getCause()
                                                                                        .getCause();

            List errors = ve.getConstraintViolations().stream()
                    .map(constraintViolation -> {
                        Map<String, String> errMap = new HashMap<>();
                        errMap.put(constraintViolation.getPropertyPath().toString(),
                                constraintViolation.getMessage());

                        return errMap;
                    }).toList();

            return responseEntity.body(errors);
        }

        return responseEntity.build();
>>>>>>> Stashed changes
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    ResponseEntity handleBindErrors(MethodArgumentNotValidException exception){

        List errorList = exception.getFieldErrors().stream()
                .map(fieldError -> {
                    Map<String, String > errorMap = new HashMap<>();
                    errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
                    return errorMap;
                }).collect(Collectors.toList());

        return ResponseEntity.badRequest().body(errorList);
    }
<<<<<<< Updated upstream
}
=======
}
>>>>>>> Stashed changes
