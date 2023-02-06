package io.shixseyidrin.realcache.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private Integer code;
    private String message;
    private T data;

    public static <T> Result<T> success(T data) {
        return new Result<>(
                Response.SUCCESS.getCode(),
                Response.SUCCESS.getMessage(),
                data
        );
    }
    public static Result<?> failed(Integer code, String msg) {
        return new Result<>(code, msg, null);
    }

}
