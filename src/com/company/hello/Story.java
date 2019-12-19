package com.company.hello;

public class Story {
    private String[] quest={"Столица России:\n1)Москва\n2)СПБ",
    "Столица Франции:\n1)Париж\n2)Лион",
    "Стлолица Германии:\n1)Берлин\n2)Гамбург"};

    public Situation currgame;
    static int qcount=0;

    Story(){
        currgame=new Situation(quest[qcount],100,-100);
    }

    public boolean getAnsw(int num){
        if(num==1){
            qcount++;
            if(qcount==3) return true;
            currgame=new Situation(quest[qcount],100,-100);
            return true;
        }
        else return false;
    }

    public boolean isEnd(){
        return qcount==3;
    }

    public static class Player {
        String name;
        int exp = 0;
        public int health = 100;
        Player(String name){
            this.name=name;
        }
        public boolean isDead(){
            System.out.println("GameOver! You Died!");
            return health==0;
        }
    }

    public class Situation {
        int dx,dh;
        String question;

        public Situation (String question, int dx, int dh) {
            this.question = question;
            this.dx = dx;
            this.dh = dh;
        }
    }

}

