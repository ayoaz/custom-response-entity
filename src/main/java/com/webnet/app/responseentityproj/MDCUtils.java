package com.webnet.app.responseentityproj;

import org.slf4j.MDC;

import java.util.Optional;

public class MDCUtils {
    public static String getCorrelationId() {
        return Optional.ofNullable(MDC.get(CoreConstant.CORRELATION_ID))
                .orElseGet(() -> MDC.get("X-B3-TraceId"));
    }

    public static String probeMDC(String key){
        return Optional.ofNullable(MDC.get(key)).get();
    }
}

