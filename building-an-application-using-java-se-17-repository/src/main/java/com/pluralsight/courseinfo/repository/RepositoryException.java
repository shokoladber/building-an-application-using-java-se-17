package com.pluralsight.courseinfo.repository;

import java.sql.SQLException;

public class RepositoryException extends RuntimeException {
    public RepositoryException(String message, SQLException  error) {
        super(message, error);
    }
}
