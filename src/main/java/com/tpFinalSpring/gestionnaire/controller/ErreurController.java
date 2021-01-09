package com.tpFinalSpring.gestionnaire.controller;

import com.tpFinalSpring.gestionnaire.exceptions.ClientIntrouvableException;
import com.tpFinalSpring.gestionnaire.exceptions.GestionnaireErreurException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class ErreurController extends ResponseEntityExceptionHandler {

    @Value("${api_doc_url}")
    private String details;

    @ExceptionHandler(ClientIntrouvableException.class)
    public ResponseEntity<GestionnaireErreurException> gestionClientIntrouvableException
            (ClientIntrouvableException exception, WebRequest webRequest){

        GestionnaireErreurException erreur = new GestionnaireErreurException();
        erreur.setCode(101);
        erreur.setMessage(exception.getMessage());
        erreur.setDetails(details);

        return new ResponseEntity<>(erreur, HttpStatus.NOT_FOUND);
    }

}
