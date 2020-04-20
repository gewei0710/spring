package com.spring.common.util;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SuccessEntity<T> {

    public final Integer code;
    public final String message;
    public final T data;

    public static <T> SuccessEntity<T> ok() {
        return ok("成功", null);
    }
    public static <T> SuccessEntity<T> ok(T data) {
        return ok("成功", data);

    }

    public static <T> SuccessEntity<T> fail(){
        return ok("服务调用失败",null);
    }

    public static <T> SuccessEntity<T> ok(String message, T data) {
        return SuccessEntity.<T>builder()
                .code(ErrorCode.OK).message(message).data(data)
                .build();
    }
}
