/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Home.game.command;

import java.util.Scanner;

/**
 *
 * @author santosh
 */
public class GameFactory {
    public static GameCommand get(String cmd,Scanner input){
    
    if(cmd.equalsIgnoreCase("walk")){
    
    return new WalkCommand(input);
    }
    else if(cmd.equalsIgnoreCase("run")){
    
    return new RunCommand(input);
    }
    else if(cmd.equalsIgnoreCase("drop")){
    
    return new DropCommand(input);
    }
    else if(cmd.equalsIgnoreCase("pick")){
    return new PickCommand(input);
    
    }
    else if(cmd.equalsIgnoreCase("exit")){
    return new ExitCommand(input);
    }
    
    return null;
    }
    
}
