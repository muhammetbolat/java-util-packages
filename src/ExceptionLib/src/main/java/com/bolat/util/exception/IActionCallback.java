package com.bolat.util.exception;

@FunctionalInterface
public interface IActionCallback {
    void run() throws Exception;
}
