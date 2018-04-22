/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.Bug;

/**
 * A <code>DancingBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class DancingBug extends Bug
{
    private int currentTurn;
    private int[] turnList;

    /**
     * Constructs a Dancing bug 
     */
    public DancingBug(int[] turns)
    {
        turnList = new int[turns.length];
        System.arraycopy(turns, 0, turnList, 0, turns.length);
        currentTurn = 0;
    }

    /**
     *defined turn(int n) for turning right of n*45 degrees
     */
    public void turn(int times) {
        for (int i = 0; i < times; i++) {
            turn();
        }
    }

    /**
     * Moves action of the bug
     */
    public void act()
    {   
        if (currentTurn == turnList.length) {
            currentTurn = 0;
        }
        turn (turnList[currentTurn]);
        currentTurn++;
        if (canMove()) {
            move();
        } 
    }
}
