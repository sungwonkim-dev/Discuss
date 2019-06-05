package com.haja.discuss.util;

import java.util.Base64;

public class EncodeUtils {
    public static String encodeBase64(String content){
        Base64.Encoder encoder = Base64.getEncoder();
        return String.valueOf(encoder.encode(content.getBytes()));
    }

    public static String decodeBase64(String content){
        Base64.Decoder decoder = Base64.getDecoder();
        return String.valueOf(decoder.decode(content));
    }
}
