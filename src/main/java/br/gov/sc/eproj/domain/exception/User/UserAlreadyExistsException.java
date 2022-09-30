package br.gov.sc.eproj.domain.exception.User;

import br.gov.sc.eproj.domain.exception.service.ServiceException;
import org.springframework.dao.DataIntegrityViolationException;

public class UserAreadyExistsException extends ServiceException {

    public UserAreadyExistsException(String message) {
        super(message);
    }

    public UserAreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserAreadyExistsException(DataIntegrityViolationException exception) {

        this(exception.getRootCause().getMessage(), exception);
    }

    public UserAreadyExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
