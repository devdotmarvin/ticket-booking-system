package dev.marvin.util;

import org.springframework.security.crypto.keygen.KeyGenerators;

public class CryptoUtil {

    public static String decodeData(String data){
        return null;
    }

    public static String encodeData(String data){

        byte[] keyBytes = KeyGenerators.secureRandom().generateKey();

        return null;
    }
}
