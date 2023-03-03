public class Board{

// An attribute for each square of the game board
    private String top_Left;
    private String top_Center;
    private String top_Right;
    private String center_Left;
    private String center_Center;
    private String center_Right;
    private String bottom_Left;
    private String bottom_Center;
    private String bottom_Right;

// Default is a blank board
    public Board() {
        this.top_Left = "-";
        this.top_Center = "-";
        this.top_Right = "-";
        this.center_Left = "-";
        this.center_Center = "-";
        this.center_Right = "-";
        this.bottom_Left = "-";
        this.bottom_Center = "-";
        this.bottom_Right = "-";
    }

// Printing the game board
    public String toString(){
        return "\n" + this.top_Left + " " + this.top_Center + " " + this.top_Right + 
        "\n" + this.center_Left + " " + this.center_Center + " " + this.center_Right + 
        "\n" + this.bottom_Left + " " + this.bottom_Center + " " + this.bottom_Right + 
        "\n";
    }

// Getters and Setters
    public void setTop_Left(String move){
        this.top_Left = move;
    }

    public String getTop_Left(Board board){
        return this.top_Left;
    }

    public void setTop_Center(String move){
        this.top_Center = move;
    }

    public String getTop_Center(Board board){
        return this.top_Center;
    }

    public void setTop_Right(String move){
        this.top_Right = move;
    }

    public String getTop_Right(Board board){
        return this.top_Right;
    }

    public void setCenter_Left(String move){
        this.center_Left = move;
    }

    public String getCenter_Left(Board board){
        return this.center_Left;
    }

    public void setCenter_Center(String move){
        this.center_Center = move;
    }

    public String getCenter_Center(Board board){
        return this.center_Center;
    }

    public void setCenter_Right(String move){
        this.center_Right = move;
    }

    public String getCenter_Right(Board board){
        return this.center_Right;
    }

    public void setBottom_Left(String move){
        this.bottom_Left = move;
    }

    public String getBottom_Left(Board board){
        return this.bottom_Left;
    }

    public void setBottom_Center(String move){
        this.bottom_Center = move;
    }

    public String getBottom_Center(Board board){
        return this.bottom_Center;
    }

    public void setBottom_Right(String move){
        this.bottom_Right = move;
    }

    public String getBottom_Right(Board board){
        return this.bottom_Right;
    }

}