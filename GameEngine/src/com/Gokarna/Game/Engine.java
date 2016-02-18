/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Gokarna.Game;

import com.Gokarna.Game.Entity.Player;
import java.util.Scanner;

/**
 *
 * @author Satish
 */
public class Engine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("==================================");
        System.out.println("|Welcome to Text Based Game Engine|");
         System.out.println("==================================");
         
         Scanner input=new Scanner(System.in);
         Player player=new Player();
         System.out.println("Enter the name of Character");
         player.setName(input.next());
         System.out.println("Your Charater" + player.getName() + "is ready");
    }    
    
    
}
