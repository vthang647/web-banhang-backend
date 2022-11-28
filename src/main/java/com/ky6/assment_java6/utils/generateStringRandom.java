package com.ky6.assment_java6.utils;

import lombok.Setter;
import org.springframework.stereotype.Service;

import java.nio.charset.Charset;
import java.util.Random;

@Service
public class generateStringRandom implements StringGenerateService{
    @Override
    public String givenUsingPlainJava_whenGeneratingRandomStringUnbounded_thenCorrect(){
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        return generatedString;
    }
}
