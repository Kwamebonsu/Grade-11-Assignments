/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author bonsk5852
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Karel goes to retrieve his newspaper then returns to his bed
        
        City kitchener = new City();
        
        new Wall(kitchener, 1, 1, Direction.NORTH);
        new Wall(kitchener, 1, 2, Direction.NORTH);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.SOUTH);
        new Wall(kitchener, 2, 2, Direction.SOUTH);
        new Wall(kitchener, 1, 2, Direction.EAST);
        new Wall(kitchener, 2, 2, Direction.EAST);
        
        Robot Karel = new Robot(kitchener, 0, 2, Direction.WEST);
     
        Karel.turnLeft();
        Karel.move();
        Karel.move();
        Karel.turnLeft();
        Karel.move();
        Karel.move();
        Karel.move();
        Karel.turnLeft();
        Karel.move();
        Karel.move();
        Karel.move();
        Karel.turnLeft();
        Karel.move();
        Karel.move();
        Karel.move();
        Karel.turnLeft();
        Karel.move();
        
    }
}
