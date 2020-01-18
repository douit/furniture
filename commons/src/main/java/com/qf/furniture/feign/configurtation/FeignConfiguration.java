package com.qf.furniture.feign.configurtation;

import com.alibaba.fastjson.JSON;
import com.qf.furniture.entity.ResponseResult;
import com.qf.furniture.exception.CodeStatus;
import com.qf.furniture.exception.GlobalExceptions;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * @author CHAN
 * @date 2020/01/18
 */
@Configuration
public class FeignConfiguration {

    @Bean
    public FeignErrorDecoder feignErrorDecoder() {
        return new FeignErrorDecoder();
    }

    public class FeignErrorDecoder implements ErrorDecoder {

        @Override
        public Exception decode(String s, Response response) {
            try {
                ResponseResult responseResult = JSON.parseObject(response.body().asInputStream(), ResponseResult.class);
                if (CodeStatus.SUCCESS.getCode().equals(responseResult.getCode())) {
                    throw  new GlobalExceptions(responseResult.getCode(), responseResult.getMsg());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
