package tddClass.tictactoe;

public class GameChecker {

    public Result checkForWin (Marker[][] board, Player playerOne, Player  playerTwo){
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != Marker.EMPTY){
            if (board[0][0]==playerOne.getMarker()){
                return new Result(true, playerOne.getName());
            }
            else{
                return new Result(true, playerTwo.getName());
            }
        }



        else if (board[0][1] == board[1][1] && board[0][1]== board[2][1] && board[0][1] != Marker.EMPTY){

            if (board[0][1]==playerOne.getMarker()){
                return new Result(true, playerOne.getName());
            }
            else{
                return new Result(true, playerTwo.getName());
            }
        }



        else if (board[0][2] == board[1][1] && board[0][2]== board[2][0]  && board[0][2] != Marker.EMPTY){
            if (board[0][2] == playerOne.getMarker()){
                return new Result(true, playerOne.getName());
            }

            else{
                return new Result(true, playerTwo.getName());
            }
        }




        else if (board[0][2] == board[1][2] && board[0][2]== board[2][2]  && board[0][2] != Marker.EMPTY){
            if (board[0][2]==playerOne.getMarker()){
                return new Result(true, playerOne.getName());
            }
            else{
                return new Result(true, playerTwo.getName());
            }
        }





        else if (board[1][0] == board[1][1] && board[1][0]== board[1][2]  && board[1][0] != Marker.EMPTY){
            if (board[1][0]==playerOne.getMarker()){
                return new Result(true, playerOne.getName());
            }
            else{
                return new Result(true, playerTwo.getName());
            }
        }





        else if (board[2][0] == board[2][1] && board[2][0]== board[2][2]  && board[2][0] != Marker.EMPTY){
            if (board[2][0]==playerOne.getMarker()){
                return new Result(true, playerOne.getName());
            }
            else{
                return new Result(true, playerTwo.getName());
            }
        }





        else if (board[0][0] == board[0][1] && board[0][0]== board[0][2]  && board[0][0] != Marker.EMPTY){
            if (board[0][0]==playerOne.getMarker()){
                return new Result(true, playerOne.getName());
            }
            else{
                return new Result(true, playerTwo.getName());
            }
        }






        else if (board[0][0] == board[1][0] && board[0][0]== board[2][0]  && board[0][0] != Marker.EMPTY){
            if (board[0][0]==playerOne.getMarker()){
                return new Result(true, playerOne.getName());
            }
            else{
                return new Result(true, playerTwo.getName());
            }
        }





        else{
            return new Result(false, "");
        }
    }
}
