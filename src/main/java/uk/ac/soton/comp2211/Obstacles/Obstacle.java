package uk.ac.soton.comp2211.Obstacles;

public class Obstacle {
    private String name;
    private int length;
    private int width;
    private String description;
    public Obstacle(String name, int length, int width, String description){
        this.name = name;
        this.length = length;
        this.width = width;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }
    public int getLength(){
        return this.length;
    }
    public int getWidth(){
        return this.width;
    }
    public String getDescription(){
        return this.description;
    }
}
