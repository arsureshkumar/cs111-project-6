/*
 * Project #6
 * Source Code File: VideoGame.java
 * Programmer: Arjun Suresh Kumar
 * Due: 12/08/21
 * Description: Builds a class to represent video
 * game objects in Java. I chose this object to
 * represent because I am interested in learning
 * to code video games, and release them on my own.
 */

class VideoGame{

    //instance variables
    private String name;
    private String genre;
    private String publisher;
    private double rating;


    //constructors
    public VideoGame(){
        this.name = "";
        this.genre = "";
        this.publisher = "";
        this.rating = 0;
    }

    public VideoGame(String name, String genre, String publisher, double rating){
        this.name = name;
        this.genre = genre;
        this.publisher = publisher;
        this.rating = rating;
    }

    //getter methods
    public String getName(){
        return name;
    }

    public String getGenre(){
        return genre;
    }

    public String getPublisher(){
        return publisher;
    }

    public double getRating(){
        return rating;
    }

    //setter methods
    public void setName(String name){
        this.name = name;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public void setRating(double rating){
        this.rating = rating;
    }

    //toString method override
    public String toString(){
        return("Name: " + name + ", Genre: " + genre + ", Publisher: " + publisher + ", Rating: " + rating);
    }

}

class Main{
    public static void main(String[] args){

        VideoGame game1 = new VideoGame();
        VideoGame game2 = new VideoGame("Titanfall 2", "FPS", "Respawn", 9.0);

        game1.setName("Rainbow Six Siege");
        game1.setGenre("FPS");
        game1.setPublisher("Ubisoft");
        game1.setRating(9.4);

        if (game1.getRating() > game2.getRating()){
            System.out.println(game1.getName() + " is the better video game.");
        } else if (game2.getRating() > game1.getRating()){
            System.out.println(game2.getName() + " is the better video game.");
        } else {
            System.out.println(game1.getName() + " and " + game2.getName() + " are equally fun games.");
        }

        System.out.println(game1.toString());
        System.out.println(game2.toString());

    }
}