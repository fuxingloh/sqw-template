package dev.fuxing.sqw;

import dev.fuxing.err.ErrorURL;
import dev.fuxing.err.NotFoundException;
import dev.fuxing.err.UnknownException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletResponse;

/**
 * @author Fuxing Loh
 * @since 2020-01-21 at 17:25
 */
@RestControllerAdvice
public class ServiceException {
    private static final Logger logger = LoggerFactory.getLogger(ServiceException.class);

    @ExceptionHandler(value = {NoHandlerFoundException.class})
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public ErrorURLView notFound() {
        return new ErrorURLView(new NotFoundException());
    }

    @ExceptionHandler(value = {ErrorURL.class})
    public ErrorURLView errorURL(ErrorURL errorURL, HttpServletResponse response) {
        response.setStatus(errorURL.getCode());
        return new ErrorURLView(errorURL);
    }

    @ExceptionHandler(value = {Exception.class})
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorURLView unknown(Exception exception) {
        UnknownException errorURL = new UnknownException("Unknown error.", exception);
        return new ErrorURLView(errorURL);
    }

    /**
     * Custom ErrorURL View so as not to leak any stacktrace directly
     */
    public static final class ErrorURLView {
        private final int code;
        private final String url;
        private final String message;

        public ErrorURLView(ErrorURL errorURL) {
            this.code = errorURL.getCode();
            this.url = errorURL.getUrl();
            this.message = errorURL.getMessage();
        }

        public int getCode() {
            return code;
        }

        public String getUrl() {
            return url;
        }

        public String getMessage() {
            return message;
        }
    }
}
