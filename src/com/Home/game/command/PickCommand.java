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
public class PickCommand extends GameCommand{

    public PickCommand(Scanner input) {
        super(input);
    }

      @Override
    public void execute(Player player,String[] param) {
        if(param.length==1){
        
            System.out.println("Sorry i don't understand what to pick");
        }else{
        System.out.println(player.getPlayerName() +" is picking " +param[1]);       
    }
    }
}
