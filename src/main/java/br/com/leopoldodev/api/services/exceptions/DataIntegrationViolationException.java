package br.com.leopoldodev.api.services.exceptions;

public class DataIntegrationViolationException extends RuntimeException {
    public DataIntegrationViolationException(String message) {
        super(message);
    }
}