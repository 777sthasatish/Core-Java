/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Gokarna.Game.Command;

/**
 *
 * @author Satish
 */
public class GameCommandFactory {
    public static GameCommand get(String cmd)
    {
        if(cmd.equalsIgnoreCase("walk"))
        {
            return new WalkCommand();
        }
        else if(cmd.equalsIgnoreCase("drop"))
        {
            return new DropCommand();
        }
        else if(cmd.equalsIgnoreCase("pick"))
        {
            return new PickCommand();
        }
        else if(cmd.equalsIgnoreCase("run"))
        {
            return new RunCommand();
        }
        else
        {
            return null;
        }
    }
            
}
