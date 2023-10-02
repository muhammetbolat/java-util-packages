package com.bolat.util.exception;

@FunctionalInterface
public interface ISupplierCallback<R> {
    R get() throws Exception;
}
