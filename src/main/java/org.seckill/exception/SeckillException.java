package org.seckill.exception;

import org.seckill.entity.SuccessKilled;
import org.seckill.enums.SeckillStatEnum;

/**
 * 秒杀相关业务异常
 */
public class SeckillException extends RuntimeException {

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }


    public SeckillException(long seckillId, SeckillStatEnum success, SuccessKilled successKilled) {
    }
}
