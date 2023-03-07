import java.util.Scanner;
import java.util.Random;


public class Game{

    public static void printPositions() {
        System.out.println("1 2 3");
        System.out.println("4 5 6");
        System.out.println("7 8 9");
    }

// Method for checking game board status (win/loss/draw)
    public static int check(Board board){

//If it's a tie
        if(!(board.getTop_Left(board) == "-") && !(board.getTop_Center(board) == "-")
        && !(board.getTop_Right(board) == "-") && !(board.getCenter_Left(board) == "-") 
        && !(board.getCenter_Center(board) == "-") && !(board.getCenter_Right(board) == "-")
        && !(board.getBottom_Left(board) == "-") && !(board.getBottom_Center(board) == "-")
        && !(board.getBottom_Right(board) == "-")){
            return 3;
        }

//If the player won
        if(board.getTop_Left(board) == board.getTop_Center(board)
        && board.getTop_Left(board) == board.getTop_Right(board)
        && board.getTop_Left(board) == "X"){
            return 1;
        }

        if(board.getCenter_Left(board) == board.getCenter_Center(board) 
        && board.getCenter_Left(board) == board.getCenter_Right(board) 
        && board.getCenter_Left(board) == "X"){
            return 1;
        }    
        
        if(board.getBottom_Left(board) == board.getBottom_Center(board) 
        && board.getBottom_Left(board) == board.getBottom_Right(board) 
        && board.getBottom_Left(board) == "X"){
            return 1;
        }    

        if(board.getTop_Left(board) == board.getCenter_Left(board) 
        && board.getTop_Left(board) == board.getBottom_Left(board) 
        && board.getTop_Left(board) == "X"){
            return 1;
        }       

        if(board.getTop_Center(board) == board.getCenter_Center(board) 
        && board.getTop_Center(board) == board.getBottom_Center(board) 
        && board.getTop_Center(board) == "X"){
            return 1;
        }  

        if(board.getTop_Right(board) == board.getCenter_Right(board) 
        && board.getTop_Right(board) == board.getBottom_Right(board) 
        && board.getTop_Right(board) == "X"){
            return 1;
        }  

        if(board.getTop_Left(board) == board.getCenter_Center(board) 
        && board.getTop_Left(board) == board.getBottom_Right(board) 
        && board.getTop_Left(board) == "X"){
            return 1;
        }  

        if(board.getTop_Right(board) == board.getCenter_Center(board)       //I played and won by this win, and it did not trigger the player win message.
        && board.getTop_Right(board) == board.getBottom_Left(board) 
        && board.getTop_Right(board) == "X"){
            return 1;
        }  

//If the computer won
        if(board.getTop_Left(board) == board.getTop_Center(board) 
        && board.getTop_Left(board) == board.getTop_Right(board) 
        && board.getTop_Left(board) == "O"){
            return 2;
        }

        if(board.getCenter_Left(board) == board.getCenter_Center(board) 
        && board.getCenter_Left(board) == board.getCenter_Right(board) 
        && board.getCenter_Left(board) == "O"){
             return 2;
        }    

        if(board.getBottom_Left(board) == board.getBottom_Center(board) 
        && board.getBottom_Left(board) == board.getBottom_Right(board) 
        && board.getBottom_Left(board) == "O"){
             return 2;
        }    

        if(board.getTop_Left(board) == board.getCenter_Left(board) 
        && board.getTop_Left(board) == board.getBottom_Left(board) 
        && board.getTop_Left(board) == "O"){
            return 2;
        }       

        if(board.getTop_Center(board) == board.getCenter_Center(board) 
        && board.getTop_Center(board) == board.getBottom_Center(board) 
        && board.getTop_Center(board) == "O"){
            return 2;
        }  

        if(board.getTop_Right(board) == board.getCenter_Right(board) 
        && board.getTop_Right(board) == board.getBottom_Right(board) 
        && board.getTop_Right(board) == "O"){
            return 2;
        }  

        if(board.getTop_Left(board) == board.getCenter_Center(board) 
        && board.getTop_Left(board) == board.getBottom_Right(board) 
        && board.getTop_Left(board) == "O"){
            return 2;
        }  

        if(board.getTop_Right(board) == board.getCenter_Center(board) 
        && board.getTop_Right(board) == board.getBottom_Left(board) 
        && board.getTop_Right(board) == "O"){
            return 2;
        }  
//If the game is still going
    return 0;
}

// Method for player's move
    public static Board move(Board board){
    
// Take in player's input for move
        Scanner in = new Scanner(System.in);
        String square = in.nextLine();

// If that square is already taken, start the turn over. If it's open, set that square to X

        switch (square) {

            case "1":
            if(!(board.getTop_Left(board) == "-")){
                System.out.println("You can't go there! Try again");
                move(board);
                return board;
            }
            board.setTop_Left("X");
            System.out.println(board);           //Since you wrote your toString() method for the board class, you can just say you're going to print board without invoking the method directly.
            return board;

            case "2":
            if(!(board.getTop_Center(board) == "-")){
                System.out.println("You can't go there! Try again");
                move(board);
                return board;
            }            
            board.setTop_Center("X");
            System.out.println(board);
            return board;

            case "3":
            if(!(board.getTop_Right(board) == "-")){
                System.out.println("You can't go there! Try again");
                move(board);
                return board;
            }
            board.setTop_Right("X");
            System.out.println(board);
            return board;

            case "4":
            if(!(board.getCenter_Left(board) == "-")){
                System.out.println("You can't go there! Try again");
                move(board);
                return board;
            }
            board.setCenter_Left("X");
            System.out.println(board);
            return board;

            case "5":
            if(!(board.getCenter_Center(board) == "-")){
                System.out.println("You can't go there! Try again");
                move(board);
                return board;
            }
            board.setCenter_Center("X");
            System.out.println(board);
            return board;

            case "6":
            if(!(board.getCenter_Right(board) == "-")){
                System.out.println("You can't go there! Try again");
                move(board);
                return board;
            }
            board.setCenter_Right("X");
            System.out.println(board);
            return board;

            case "7":
            if(!(board.getBottom_Left(board) == "-")){
                System.out.println("You can't go there! Try again");
                move(board);
                return board;
            }
            board.setBottom_Left("X");
            System.out.println(board);
            return board;

            case "8":
            if(!(board.getBottom_Center(board) == "-")){
                System.out.println("You can't go there! Try again");
                move(board);
                return board;
            }
            board.setBottom_Center("X");
            System.out.println(board);
            return board;

            case "9":
            if(!(board.getBottom_Right(board) == "-")){
                System.out.println("You can't go there! Try again");
                move(board);
                return board;
            }
            board.setBottom_Right("X");
            System.out.println(board);
            return board;

//If the player inputs something dumb, start the turn over.
            default:
            System.out.println("Not an option, try again!");
            move(board);
            break;
        }

    return board;
    }

// Method for computer AI move
    public static Board computer(Board board){
       
// First, search for and fill any gaps. 
        if(board.getTop_Left(board) == board.getTop_Center(board)       //I'm not exactly sure if this works as intended. If I make the play 1, 9, 5, it doesn't block me. It doesn't block in a lot of situations, and it just plays down the right column, especially if I start playing from the top or bottom row.
        && board.getTop_Right(board) == "-"){                           //The computer also makes the same first move if I go on the top row, and makes the same first move for the middle and bottom rows.
            board.setTop_Right("O");                                //I think some nested for loops could help condense this a bit, especially for the checks starting with the same square.
            System.out.println(board);
            return board;
        }

        if(board.getTop_Left(board) == board.getTop_Right(board) 
        && board.getTop_Center(board) == "-"){
            board.setTop_Center("O");
            System.out.println(board);
            return board;
        }

        if(board.getTop_Center(board) == board.getTop_Right(board) 
        && board.getTop_Left(board) == "-"){
            board.setTop_Left("O");
            System.out.println(board);
            return board;
        }

        if(board.getCenter_Left(board) == board.getCenter_Center(board) 
        && board.getCenter_Right(board) == "-"){
            board.setCenter_Right("O");
            System.out.println(board);
            return board;
        }

        if(board.getCenter_Left(board) == board.getCenter_Right(board) 
        && board.getCenter_Center(board) == "-"){
            board.setCenter_Center("O");
            System.out.println(board);
            return board;
        }

        if(board.getCenter_Center(board) == board.getCenter_Right(board) 
        && board.getCenter_Left(board) == "-"){
            board.setCenter_Left("O");
            System.out.println(board);
            return board;
        }

        if(board.getBottom_Left(board) == board.getBottom_Center(board) 
        && board.getBottom_Right(board) == "-"){
            board.setBottom_Right("O");
            System.out.println(board);
            return board;
        }

        if(board.getBottom_Left(board) == board.getBottom_Right(board) 
        && board.getBottom_Center(board) == "-"){
            board.setBottom_Center("O");
            System.out.println(board);
            return board;
        }

        if(board.getBottom_Center(board) == board.getBottom_Right(board) 
        && board.getBottom_Left(board) == "-"){
            board.setBottom_Left("O");
            System.out.println(board);
            return board;
        }

        if(board.getTop_Left(board) == board.getCenter_Left(board) 
        && board.getBottom_Left(board) == "-"){
            board.setBottom_Left("O");
            System.out.println(board);
            return board;
        }

        if(board.getTop_Left(board) == board.getBottom_Left(board) 
        && board.getCenter_Left(board) == "-"){
            board.setCenter_Left("O");
            System.out.println(board);
            return board;
        }

        if(board.getCenter_Left(board) == board.getBottom_Left(board) 
        && board.getTop_Left(board) == "-"){
            board.setTop_Left("O");
            System.out.println(board);
            return board;
        }

        if(board.getTop_Center(board) == board.getCenter_Center(board) 
        && board.getBottom_Center(board) == "-"){
            board.setBottom_Center("O");
            System.out.println(board);
            return board;
        }

        if(board.getTop_Center(board) == board.getBottom_Center(board) 
        && board.getCenter_Center(board) == "-"){
            board.setCenter_Center("O");
            System.out.println(board);
            return board;
        }

        if(board.getCenter_Center(board) == board.getBottom_Center(board) 
        && board.getTop_Center(board) == "-"){
            board.setTop_Center("O");
            System.out.println(board);
            return board;
        }

        if(board.getTop_Right(board) == board.getCenter_Right(board) 
        && board.getBottom_Right(board) == "-"){
            board.setBottom_Right("O");
            System.out.println(board);
            return board;
        }

        if(board.getTop_Right(board) == board.getBottom_Right(board) 
        && board.getCenter_Right(board) == "-"){
            board.setCenter_Right("O");
            System.out.println(board);
            return board;
        }

        if(board.getCenter_Right(board) == board.getBottom_Right(board) 
        && board.getTop_Right(board) == "-"){
            board.setTop_Right("O");
            System.out.println(board);
            return board;
        }

        if(board.getTop_Left(board) == board.getCenter_Center(board) 
        && board.getBottom_Right(board) == "-"){
            board.setBottom_Right("O");
            System.out.println(board);
            return board;
        }

        if(board.getTop_Left(board) == board.getBottom_Right(board) 
        && board.getCenter_Center(board) == "-"){
            board.setCenter_Center("O");
            System.out.println(board);
            return board;
        }

        if(board.getCenter_Center(board) == board.getBottom_Right(board) 
        && board.getTop_Left(board) == "-"){
            board.setTop_Left("O");
            System.out.println(board);
            return board;
        }

        if(board.getTop_Right(board) == board.getCenter_Center(board) 
        && board.getBottom_Left(board) == "-"){
            board.setBottom_Left("O");
            System.out.println(board);
            return board;
        }

        if(board.getTop_Right(board) == board.getBottom_Left(board) 
        && board.getCenter_Center(board) == "-"){
            board.setCenter_Center("O");
            System.out.println(board);
            return board;
        }

        if(board.getCenter_Center(board) == board.getBottom_Left(board) 
        && board.getTop_Right(board) == "-"){
            board.setTop_Right("O");
            System.out.println(board);
            return board;
        }

        
// If there are no gaps, fill a random open square

        int i;
        Random rand = new Random();
        i = rand.nextInt(9);
        
        switch (i){

        case 0:
        if(board.getTop_Left(board) == "X" || board.getTop_Left(board) == "O"){
            computer(board);
            break;
        }
        board.setTop_Left("O");
        System.out.println(board);
        return board;

        case 1:
        if(board.getTop_Center(board) == "X" || board.getTop_Center(board) == "O"){
            computer(board);
            break;
        }
        board.setTop_Center("O");
        System.out.println(board);
        return board;

        case 2:
        if(board.getTop_Right(board) == "X" || board.getTop_Right(board) == "O"){
            computer(board);
            break;
        }
        board.setTop_Right("O");
        System.out.println(board);
        return board;

        case 3:
        if(board.getCenter_Left(board) == "X" || board.getCenter_Left(board) == "O"){
            computer(board);
            break;
        }
        board.setCenter_Left("O");
        System.out.println(board);
        return board;

        case 4:
        if(board.getCenter_Center(board) == "X" || board.getCenter_Center(board) == "O"){
            computer(board);
            break;
        }
        board.setCenter_Center("O");
        System.out.println(board);
        return board;

        case 5:
        if(board.getCenter_Right(board) == "X" || board.getCenter_Right(board) == "O"){
            computer(board);
            break;
        }
        board.setCenter_Right("O");
        System.out.println(board);
        return board;

        case 6:
        if(board.getBottom_Left(board) == "X" || board.getBottom_Left(board) == "O"){
            computer(board);
            break;
        }
        board.setBottom_Left("O");
        System.out.println(board);
        return board;

        case 7:
        if(board.getBottom_Center(board) == "X" || board.getBottom_Center(board) == "O"){
            computer(board);
            break;
        }
        board.setBottom_Center("O");
        System.out.println(board);
        return board;

        case 8:
        if(board.getBottom_Right(board) == "X" || board.getBottom_Right(board) == "O"){
            computer(board);
            break;
        }
        board.setBottom_Left("O");
        System.out.println(board);
        return board;
        }

    return board;
 }

    public static void main(String[] args){
    

// Welcome interface
    System.out.println("Welcome to Tic-Tac-Toe! Press enter to begin.");
    Scanner in = new Scanner(System.in);
    String start_game = in.nextLine();

    Board board = new Board();
        System.out.println(board.toString());

        System.out.println("You go first, what's your move?");
        //System.out.println("Enter 1 for top left, 2 for top center, 3 for top right, 4 for center left, and so on");    //This does not make the input instructions the most clear, and is a bit cumbersome to figure out on your own.
        printPositions();
        System.out.println("Enter the corresponding number to the board positions shown");      //Here I tried to make an option for how I might show the user where their input would take them.

// Begin game
        move(board);
        System.out.println("Nice move! Now it's my turn");
        computer(board);

        while(check(board) == 0){
        System.out.println("Okay, now it's your turn");
        move(board);
        if(check(board) == 0){
            System.out.println("Nice move! Now it's my turn");
            computer(board);
        }
    }

// Once game is over, display the message corresponding to the outcome
    if(check(board) == 1){
        System.out.println("You win!! Thanks for playing");
    }
    else if(check(board) == 2){
    System.out.println("You lose!! Thanks for playing");
    }

    else if(check(board) == 3){
        System.out.println("It's a draw! Thanks for playing");
    }
}
}