package com.example.starter.init;
import com.example.starter.exception.LoggingStartupException;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

public class LoggingFailureAnalyzer extends AbstractFailureAnalyzer<LoggingStartupException> {
    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, LoggingStartupException cause) {
        return new FailureAnalysis(cause.getMessage(), "В файле конфигурации вы можете выбрать нужные значения. Допустимые значения: true или false.", cause);
    }
}