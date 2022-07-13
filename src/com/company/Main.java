package com.company;
import java.util.Scanner;
import spark.spark.*;

public class Main {

    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        Chessboardprint();
        Movement();



    }

    public static void Movement() {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the row and column of the piece you want to move");
        int row=input.nextInt();
        int column=input.nextInt();
        System.out.println("Enter the row and column of the place you want to move to");
        int row2=input.nextInt();
        int column2=input.nextInt();

        if (chessBoard[row][column]=="P") {
            if (row2 == row + 1 && column2 == column) {
                ChessBoard[row2][column2] == "P"
                if ((row + column) % 2 == 0) {
                    chessBoard[row][column] = "x";
                } else {
                    chessBoard[row][column] = "*";
                }
            } else {
                System.out.println("Invalid move");
                Movement();
            }
        }




    }
    public static void Chessboardprint (){
        String[][] chessBoard = new String[8][8];

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    chessBoard[i][j] = "x";
                } else {
                    chessBoard[i][j] = "*";
                }
            }
        }

        chessBoard[0][0] = "T";
        chessBoard[7][7] = "T";
        chessBoard[7][0] = "T";
        chessBoard[0][7] = "T";

        chessBoard[0][1] = "C";
        chessBoard[0][6] = "C";
        chessBoard[7][1] = "C";
        chessBoard[7][6] = "C";

        chessBoard[0][2] = "F";
        chessBoard[0][5] = "F";
        chessBoard[7][2] = "F";
        chessBoard[7][5] = "F";

        chessBoard[0][3] = "K";
        chessBoard[7][4] = "K";

        chessBoard[7][3] = "K";
        chessBoard[0][4] = "Q";

        chessBoard[1][0] = "P";
        chessBoard[1][1] = "P";
        chessBoard[1][2] = "P";
        chessBoard[1][3] = "P";
        chessBoard[1][4] = "P";
        chessBoard[1][5] = "P";
        chessBoard[1][6] = "P";
        chessBoard[1][7] = "P";

        chessBoard[6][0] = "P";
        chessBoard[6][1] = "P";
        chessBoard[6][2] = "P";
        chessBoard[6][3] = "P";
        chessBoard[6][4] = "P";
        chessBoard[6][5] = "P";
        chessBoard[6][6] = "P";
        chessBoard[6][7] = "P";

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                System.out.print(chessBoard[i][j]);
            }
            System.out.println();
        }
    }
}





