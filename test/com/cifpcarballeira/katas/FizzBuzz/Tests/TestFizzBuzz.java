/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifpcarballeira.katas.FizzBuzz.Tests;

import com.cifpcarballeira.katas.FizzBuzz.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author janeiro
 */
public class TestFizzBuzz {
    
    public TestFizzBuzz() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void test1devuelve1() {
         FizzBuzz fb = new FizzBuzz();
         String result = fb.getFizzBuzz(1);
         assertEquals("1", result);
     }
}
