package com.company.hello;

import com.company.hello.Story.Player;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
        public static Player player;
        public static Story story;

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            out.println("Как вас зовут?");
            player = new Player(in.next());
            story = new Story();
            while (true) {
                if (story.isEnd() || player.isDead()) {
                    out.println("====================the end!===================");
                    out.println("=====\nОчки:" + player.exp);
                    return;
                }
                out.println("=====\nОчки:" + player.exp);
                out.println(story.currgame.question);
                if(story.getAnsw(in.nextInt())){
                    player.exp+=story.currgame.dx;
                }
                else player.health+=story.currgame.dh;
            }

        }

}

