package io.github.berrygobbler78;

import io.github.berrygobbler78.constants.ChessConstants;
import io.github.berrygobbler78.exceptions.InvalidMoveException;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 

 * The ChessBoard class contains all the programming related to the chess game 
*/
public class ChessBoard {
    /*

    * Piece Values (Initial pos)
    * 8  9 10 11 12 10  9  8
    * 7  7  7  7  7  7  7  7  
    * 0  0  0  0  0  0  0  0 
    * 0  0  0  0  0  0  0  0  
    * 0  0  0  0  0  0  0  0  
    * 0  0  0  0  0  0  0  0  
    * 6  6  6  6  6  6  6  6
    * 1  2  3  4  5  3  2  1
    */

    private int[] boardManager = new int[64];

    // <ChessConstants.boardSquare, possibleMoveList<>>
    private Map<Integer, List<Integer>> possibleRookMoves = new HashMap<>();
    private Map<Integer, List<Integer>> possibleKnightMoves = new HashMap<>();
    private Map<Integer, List<Integer>> possibleBishopMoves = new HashMap<>();
    private Map<Integer, List<Integer>> possibleQueenMoves = new HashMap<>();
    private Map<Integer, List<Integer>> possibleKingMoves = new HashMap<>();

    private static final Logger LOGGER = Logger.getLogger(ChessBoard.class.getName());
    
    
    public ChessBoard(Handler consoleHandler) {
        LOGGER.addHandler(consoleHandler);
        LOGGER.setLevel(Level.INFO);
        LOGGER.setUseParentHandlers(false);

        
        resetBoardManager();
        calculatePossibleMoves();
    }

    public void movePiece(String move) {
        LOGGER.log(Level.INFO, "Moving piece");
    }

    public void calculatePossibleMoves() {
        

        /*

         * Rook moves
         * Get a square, figure out pos in row and column, remove location from row and column ArrayList
        */
        LOGGER.log(Level.INFO, "Calculating possible Rook moves...");

        List<Integer> tempRow;
        List<Integer> tempCol;

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                // 63 - (i * 8 + j)

                LOGGER.log(Level.FINEST, "Calculating Rook move for square: {0}", (i * 8 + j));

                tempRow = new ArrayList<>(getRowForBoardSquare(i * 8 + j));
                LOGGER.log(Level.FINEST, "Rook row is: {0}", getRowForBoardSquare(i * 8 + j));
                
                tempCol = new ArrayList<>(getColForBoardSquare(i * 8 + j));
                LOGGER.log(Level.FINEST, "Rook col is: {0}", getColForBoardSquare(i * 8 + j));

                int k = 0;

                while(tempRow.size() == 8) {
                    if(tempRow.get(k) == i * 8 + j) {
                        tempRow.remove(k);
                    }

                    k++;
                }

                k = 0;
                while(tempCol.size() == 8) {
                    if(tempCol.get(k) == i * 8 + j) {
                        tempCol.remove(k);
                    }

                    k++;
                }

                tempRow.addAll(tempCol);

                LOGGER.log(Level.FINEST, "Rook combined is: {0}", tempRow);

                possibleRookMoves.put(63 - (i * 8 + j), tempRow);
            }
        }

        LOGGER.log(Level.FINEST, "Possible Rook Moves: {0}", possibleRookMoves);

        LOGGER.log(Level.INFO, "Rook moves calculated!!");
        LOGGER.log(Level.INFO, "Calculating possible Bishop moves...");
    }

    public List<Integer> getRowForBoardSquare(int boardSquare) {
        if(boardSquare >= 0 && boardSquare <= 7) {
            return ChessConstants.ROW_1;
        } else if(boardSquare >= 8 && boardSquare <= 15) {
            return ChessConstants.ROW_2;
        } else if(boardSquare >= 16 && boardSquare <= 23) {
            return ChessConstants.ROW_3;
        } else if(boardSquare >= 24 && boardSquare <= 31) {
            return ChessConstants.ROW_4;
        } else if(boardSquare >= 32 && boardSquare <= 39) {
            return ChessConstants.ROW_5;
        } else if(boardSquare >= 40 && boardSquare <= 47) {
            return ChessConstants.ROW_6;
        } else if(boardSquare >= 48 && boardSquare <= 55) {
            return ChessConstants.ROW_7;
        } else if(boardSquare >= 56 && boardSquare <= 63) {
            return ChessConstants.ROW_8;
        } else {
            return Collections.emptyList();
        }
    }

    public List<Integer> getColForBoardSquare(int boardSquare) {
        if((boardSquare % 8) == 0) {
            return ChessConstants.COL_A;
        } else if((boardSquare % 8) == 1) {
            return ChessConstants.COL_B;
        } else if((boardSquare % 8) == 2) {
            return ChessConstants.COL_C;
        } else if((boardSquare % 8) == 3) {
            return ChessConstants.COL_D;
        } else if((boardSquare % 8) == 4) {
            return ChessConstants.COL_E;
        } else if((boardSquare % 8) == 5) {
            return ChessConstants.COL_F;
        } else if((boardSquare % 8) == 6) {
            return ChessConstants.COL_G;
        } else if((boardSquare % 8) == 7) {
            return ChessConstants.COL_H;
        } else {
            return Collections.emptyList();
        }
    }

    public void resetBoardManager() {
        LOGGER.log(Level.INFO, "Resetting board...");
        boardManager[ChessConstants.A1] = ChessConstants.WHITE_ROOK;
        boardManager[ChessConstants.B1] = ChessConstants.WHITE_KNIGHT;
        boardManager[ChessConstants.C1] = ChessConstants.WHITE_BISHOP;
        boardManager[ChessConstants.D1] = ChessConstants.WHITE_QUEEN;
        boardManager[ChessConstants.E1] = ChessConstants.WHITE_KING;
        boardManager[ChessConstants.F1] = ChessConstants.WHITE_BISHOP;
        boardManager[ChessConstants.G1] = ChessConstants.WHITE_KNIGHT;
        boardManager[ChessConstants.H1] = ChessConstants.WHITE_ROOK;

        boardManager[ChessConstants.A2] = ChessConstants.WHITE_PAWN;
        boardManager[ChessConstants.B2] = ChessConstants.WHITE_PAWN;
        boardManager[ChessConstants.C2] = ChessConstants.WHITE_PAWN;
        boardManager[ChessConstants.D2] = ChessConstants.WHITE_PAWN;
        boardManager[ChessConstants.E2] = ChessConstants.WHITE_PAWN;
        boardManager[ChessConstants.F2] = ChessConstants.WHITE_PAWN;
        boardManager[ChessConstants.G2] = ChessConstants.WHITE_PAWN;
        boardManager[ChessConstants.H2] = ChessConstants.WHITE_PAWN;

        for(int i = ChessConstants.A3; i < ChessConstants.A7; i++) {
            boardManager[i] = ChessConstants.EMPTY;
        }

        boardManager[ChessConstants.A7] = ChessConstants.BLACK_PAWN;
        boardManager[ChessConstants.B7] = ChessConstants.BLACK_PAWN;
        boardManager[ChessConstants.C7] = ChessConstants.BLACK_PAWN;
        boardManager[ChessConstants.D7] = ChessConstants.BLACK_PAWN;
        boardManager[ChessConstants.E7] = ChessConstants.BLACK_PAWN;
        boardManager[ChessConstants.F7] = ChessConstants.BLACK_PAWN;
        boardManager[ChessConstants.G7] = ChessConstants.BLACK_PAWN;
        boardManager[ChessConstants.H7] = ChessConstants.BLACK_PAWN;

        boardManager[ChessConstants.A8] = ChessConstants.BLACK_ROOK;
        boardManager[ChessConstants.B8] = ChessConstants.BLACK_KNIGHT;
        boardManager[ChessConstants.C8] = ChessConstants.BLACK_BISHOP;
        boardManager[ChessConstants.D8] = ChessConstants.BLACK_QUEEN;
        boardManager[ChessConstants.E8] = ChessConstants.BLACK_KING;
        boardManager[ChessConstants.F8] = ChessConstants.BLACK_BISHOP;
        boardManager[ChessConstants.G8] = ChessConstants.BLACK_KNIGHT;
        boardManager[ChessConstants.H8] = ChessConstants.BLACK_ROOK;

        LOGGER.log(Level.INFO, "Board reset complete!!");

        if(LOGGER.getLevel().intValue() <= Level.FINEST.intValue()) {
            StringBuilder tempStringBuilder = new StringBuilder();

            for(int i = 0; i < 8; i++) {
                tempStringBuilder.append("\n");
                for(int j = 0; j < 8; j++) {
                    if(boardManager[63 - (i * 8 + j)] > 9) {
                        tempStringBuilder.append((boardManager[63 - (i * 8 + j)] + " "));
                    } else {
                        tempStringBuilder.append((" " + boardManager[63 - (i * 8 + j)] + " "));
                    }
                    
                }
            }
            LOGGER.log(Level.FINEST, "Chess Board: \n{0}", tempStringBuilder);
        }
    }
}
