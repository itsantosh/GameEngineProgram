/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Home.game.Engine;

import com.Home.game.command.GameCommand;
import com.Home.game.command.GameFactory;
import com.Home.game.entity.Player;
import java.util.Scanner;

/**
 *
 * @author santosh
 */
public class Engine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===============================================");
        System.out.println("*************|Welcome to Game|**************");
        System.out.println("===============================================");
        Scanner input = new Scanner(System.in);
        Player player = new Player();
        System.out.println("Enter the name of Character");
        player.setPlayerName(input.next());
        System.out.println("Your character " + player.getPlayerName() + " is ready to play");

        while (true) {

            System.out.println("Enter command");
            String cmd = input.nextLine();
            String[] params = cmd.split(" ");
            GameCommand gameCmd = GameFactory.get(params[0],input);
            if (gameCmd == null) {
                System.out.println("Invalid Command");

            } else {
                
                gameCmd.execute(player, params);
                
                

            }
        }

    }

}
