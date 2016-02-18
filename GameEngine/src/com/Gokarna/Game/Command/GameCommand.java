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
public abstract class GameCommand {
    public abstract void execute(Player player);
    
}
