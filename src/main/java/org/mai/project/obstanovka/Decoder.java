package org.mai.project.obstanovka;

import org.jetbrains.annotations.NotNull;

import java.io.InputStream;
import java.util.HashMap;

public class Decoder {
    private final short MAX_PACKET_LENGTH = 273;
    private short pck_length;
    private byte[] byteArray;
    private InputStream byteIn;

    private void dataReader(byte[] byteArray, boolean check){
        if(check){
            if(byteArray.length <= 273) {
                this.byteArray = byteArray;

            }else{
                //написать ошибку
            }
        }else{
        }
    }

    public static @NotNull String hexToBinary(String hex) {

        hex = hex.toUpperCase();
        StringBuilder binary = new StringBuilder();
        HashMap<Character, String> hashMap = new HashMap<>();

        hashMap.put('0', "0000");
        hashMap.put('1', "0001");
        hashMap.put('2', "0010");
        hashMap.put('3', "0011");
        hashMap.put('4', "0100");
        hashMap.put('5', "0101");
        hashMap.put('6', "0110");
        hashMap.put('7', "0111");
        hashMap.put('8', "1000");
        hashMap.put('9', "1001");
        hashMap.put('A', "1010");
        hashMap.put('B', "1011");
        hashMap.put('C', "1100");
        hashMap.put('D', "1101");
        hashMap.put('E', "1110");
        hashMap.put('F', "1111");

        int i;
        char ch;
        for (i = 0; i < hex.length(); i++) {
            ch = hex.charAt(i);
            if (hashMap.containsKey(ch))
                binary.append(hashMap.get(ch));
            else {
                binary = new StringBuilder("Invalid Hexadecimal String");// создать собственную ошибку
            }
        }

        return binary.toString();
    }


}
