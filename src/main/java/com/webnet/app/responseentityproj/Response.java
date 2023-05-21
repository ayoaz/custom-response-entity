package com.webnet.app.responseentityproj;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Response<T> {
    private Status status;
    private T data;
}
