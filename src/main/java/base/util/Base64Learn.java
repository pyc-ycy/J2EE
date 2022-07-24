package base.util;

import org.springframework.util.StringUtils;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Base64.Encoder;

public class Base64Learn {
    public static void main(String[] args) {
        Encoder encoder = Base64.getEncoder();
        byte[] str = "pyc4573".getBytes(StandardCharsets.UTF_8);
        String encodeStr1 = encoder.encodeToString(str);
        String encodeStr2 = Arrays.toString(encoder.encode(str));
        System.out.println("The different of the return value in der.encodeToString(str) and der.encodeToString(str)");
        System.out.println("encodeStr1=" + encodeStr1);
        System.out.println("encoderStr2=" + encodeStr2);
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decodeStr1 = decoder.decode(encodeStr1);
        byte[] decodeStr2 = decoder.decode(encoder.encode(str));
        System.out.println("=========================");
        System.out.println("Decoding the encodeStr1: " + encodeStr1 + ", After using the Arrays.toString: "
                + Arrays.toString(decodeStr1));
        System.out.println("Decoding the encodeStr1: " + encodeStr2 + ", After using the Arrays.toString: "
                + Arrays.toString(decodeStr2));
        System.out.println("================");
        Encoder urlEncoder = Base64.getUrlEncoder();
        byte[] url = "https://www.pyc.com/get?paarmOne=13&paramTwo=24".getBytes(StandardCharsets.UTF_8);
        String encodeUrl = urlEncoder.encodeToString(url);
        System.out.println("Using the Base64.getUrlEncoder().encodeToString to opt url: https://www.pyc.com/get?paarmOne=13&paramTwo=24"
                 + ",to " + encodeUrl);
        String encodeUrl2 = URLEncoder.encode("https://www.pyc.com/get?paarmOne=13&paramTwo=24", StandardCharsets.UTF_8);
        System.out.println("Using the java.net.URLEncoder.encode(\"https://www.pyc.com/get?paarmOne=13&paramTwo=24\", StandardCharsets.UTF_8)="
        + encodeUrl2);
        byte[] decodeByte = Base64.getUrlDecoder().decode(encodeUrl);
        String decodeStr = new String(decodeByte);

        System.out.println(decodeStr);

    }
}
