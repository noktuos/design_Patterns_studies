package company.structural.flywheight;

import java.util.HashMap;

public class EnemyFactory {
    private static HashMap<String,Enemy> enemies = new HashMap<>();
    public static Enemy getEnemy(String type){
        Enemy enemy = null;
        if(enemies.containsKey(type)){
            enemy= enemies.get(type);
        }else{
            switch(type){
                case "Soldier":
                    System.out.println("Un soladdo ha sido creado");
                    enemy=new Soldier();
                    break;
                case "Detective":
                    System.out.println("un detective ha sido creado");
                    enemy = new Detective();
                    break;
                default:
                    System.out.println("No se ha creado enemigo");
            }
            enemies.put(type,enemy);
        }
        return enemy;
    }
}
