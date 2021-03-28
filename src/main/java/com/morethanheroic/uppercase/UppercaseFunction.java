package com.morethanheroic.uppercase;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.morethanheroic.uppercase.domain.UppercaseRequest;
import com.morethanheroic.uppercase.domain.UppercaseResponse;
import com.morethanheroic.uppercase.service.UppercaseService;

@Component
public class UppercaseFunction implements Function<UppercaseRequest, UppercaseResponse> {

    @Autowired private  UppercaseService uppercaseService;


    @Override
    public UppercaseResponse apply(final UppercaseRequest uppercaseRequest) {
        final UppercaseResponse result = new UppercaseResponse();

        result.setResult(uppercaseService.uppercase(uppercaseRequest.getInput()));

        return result;
    }
}
