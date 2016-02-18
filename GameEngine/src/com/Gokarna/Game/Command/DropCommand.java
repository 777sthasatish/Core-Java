/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Gokarna.Game.Command;

import com.Gokarna.Game.Entity.Player;

/**
 *
 * @author Satish
 */
public class DropCommand extends GameCommand {

    @Override
    public void execute(Player player) {
        System.out.println(player.getName()+ "is dropping");
        
    }
    
}
