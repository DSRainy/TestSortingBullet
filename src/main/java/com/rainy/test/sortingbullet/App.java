/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rainy.test.sortingbullet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Rainy
 */
public class App {

    public static void main(String[] args) {

        String[] bullets = {
            "1",
            "1.1",
            "1.2",
            "1.2.1",
            "2.5",
            "2.3.1",
            "2.3.2",
            "2.1.1",
            "2.1",
            "2.2.2.2",
            "2.2",
            "2.2.1",
            "2.2.2.1",
            "2.2.2",
            "2",
            "2.7",
            "2.4.100",
            "2."};
        
        System.out.println("\nBefore sort ***************************************\n");
        println(bullets);

        Arrays.sort(bullets);
        System.out.println("\n After sort ***************************************\n");
        println(bullets);

    }

    private static void println(String[] bullets) {
        for (String text : bullets) {
            System.out.println("-->   " + text);
        }
    }
}
