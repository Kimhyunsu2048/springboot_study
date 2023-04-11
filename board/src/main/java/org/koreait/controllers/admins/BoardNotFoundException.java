package org.koreait.controllers.admins;

import jakarta.servlet.http.HttpServletResponse;
import org.koreait.commons.errors.CommonException;
import org.springframework.security.core.parameters.P;

import java.util.ResourceBundle;

public class BoardNotFoundException extends CommonException {
    private static String message;
    static {
        ResourceBundle bundle = ResourceBundle.getBundle("messages.validation");
        message = bundle.getString("Validation.board.NotFound");
    }

    public BoardNotFoundException() {
        super(message, HttpServletResponse.SC_BAD_REQUEST);
    }

}
