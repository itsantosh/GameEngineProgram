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
public class ExitCommand extends GameCommand {

    public ExitCommand(Scanner input) {
        super(input);
    }

    @Override
    public void execute(Player player,String[] param) {
        System.out.println("Do you really want to close[y/n]:");
        if(!input.next().equalsIgnoreCase("n")){
         System.out.println("Game is closeing wait please..........");
        System.exit(0);
    }
    }
    
}
