package com.alenasoft.urbanager.resources.Operations.service;

import com.alenasoft.urbanager.api.Result;

public interface OperationService {
    long add(int num1, int num2);

    Result getById(long id);
}

