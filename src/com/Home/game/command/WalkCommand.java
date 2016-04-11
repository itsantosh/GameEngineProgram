/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Home.game.command;

import com.Home.game.entity.Player;
import java.util.Scanner;

/**
 *
 * @author santosh
 */
public class WalkCommand extends GameCommand{

    public WalkCommand(Scanner input) {
        super(input);
    }

    @Override
    public void execute(Player player,String[] param) {
        
             if(param.length==1){
            System.out.println(player.getPlayerName() + " is walking");
        
        }else if(param.length>=1){
        System.out.println(player.getPlayerName() + " is walking " +param[1]);       
    }
        
        
     
    }   
}
