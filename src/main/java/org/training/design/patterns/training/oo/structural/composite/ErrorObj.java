package org.training.design.patterns.training.oo.structural.composite;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class ErrorObj {

    private List<ErrorObj> subErrors;
    private ErrorObj parent;
    private String desc;
    private int cause;

    public ErrorObj addSubError(ErrorObj errorObj){
        if (subErrors == null){
            subErrors = new ArrayList<>();
        }
        subErrors.add(errorObj);
        errorObj.setParent(this);
        return this;
    }

}
