package com.webnet.app.responseentityproj;

import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public interface CoreController {

    /**
     * @param responseSupplier
     * @param <T>
     * @return
     */
    default <T> ResponseEntity<Response<T>> invokeService(Supplier<T> responseSupplier) {
        T data = responseSupplier.get();

        Response<T> resp = new Response<>();
        resp.setData(data);
        resp.setStatus(Status.builder()
                .code("00")
                .message("SUCCESS")
                .correlationId(MDCUtils.getCorrelationId())
                .timestamp(LocalDateTime.now())
                .build());

        return ResponseEntity.ok(resp);
    }

}