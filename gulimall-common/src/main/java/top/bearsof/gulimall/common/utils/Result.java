package top.bearsof.gulimall.common.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * @author bears
 * @since 2022/10/9
 * @email bearsof@icloud.com
 * @param <T>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;



    /**
     * 返回状态
     */
    private Integer code;

    /**
     * 返回响应状态和数据
     * @param code  响应的状态码
     * @param data  响应回的数据
     */

    public Result(Integer code, T data) {
        this.code = code;
        this.data = data;
    }

    /**
     * 返回响应状态和操作情况消息
     * @param code  响应的状态码
     * @param msg   返回操作消息
     */
    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 返回指定的数据
     */
    private T data;

    /**
     * 返回指定的消息
     */
    private String msg;

    public static <T> Result<T> success(Integer code, Object data){
        return new Result(code,data);
    }

    public static <T> Result<T> error(Integer code, String msg){
        return new Result(code,msg);
    }
}
