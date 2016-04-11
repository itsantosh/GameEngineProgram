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
public abstract class GameCommand {

    protected Scanner input;

    public GameCommand(Scanner input) {
    this.input=input;
    }

    public abstract void execute(Player player, String[] param);

}
