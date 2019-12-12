package com.example.websocketdemo.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author by Lying
 * @Date 2019/12/11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Greeting {

    private String content;
}
