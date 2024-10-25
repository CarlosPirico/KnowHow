package com.knowhow.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {

    public static String convertToMD5(String input) {
        try {
            // Instancia o MessageDigest com o algoritmo MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            // Converte a string de entrada para um array de bytes
            byte[] messageDigest = md.digest(input.getBytes());
            
            // Converte o array de bytes para o formato hexadecimal
            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02x", b));
            }
            
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}