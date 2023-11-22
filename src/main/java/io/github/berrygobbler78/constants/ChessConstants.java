package io.github.berrygobbler78.constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ChessConstants {

    /*

    * Piece values (For placing on the board)
    * Initial pos map
    * 8  9 10 11 12 10  9  8
    * 7  7  7  7  7  7  7  7  
    * 0  0  0  0  0  0  0  0 
    * 0  0  0  0  0  0  0  0  
    * 0  0  0  0  0  0  0  0  
    * 0  0  0  0  0  0  0  0  
    * 6  6  6  6  6  6  6  6
    * 1  2  3  4  5  3  2  1
    */
    public static final int WHITE_ROOK = 1;
    public static final int WHITE_KNIGHT = 2;
    public static final int WHITE_BISHOP = 3;
    public static final int WHITE_QUEEN = 4;
    public static final int WHITE_KING = 5;
    public static final int WHITE_PAWN = 6;

    public static final int BLACK_ROOK = 8;
    public static final int BLACK_KNIGHT = 9;
    public static final int BLACK_BISHOP = 10;
    public static final int BLACK_QUEEN = 11;
    public static final int BLACK_KING = 12;
    public static final int BLACK_PAWN = 7;

    public static final int EMPTY = 0;

    /*

    * Board squares by name
    * 56 57 58 59 60 61 62 63
    * 48 49 50 51 52 53 54 55  
    * 40 41 42 43 44 45 46 47 
    * 32 33 34 35 36 37 38 39  
    * 24 25 26 27 28 29 30 31  
    * 16 17 18 19 20 21 22 23  
    *  8  9 10 11 12 13 14 15
    *  0  1  2  3  4  5  6  7
    */

    // Array list of rows and columns
    public static final List<Integer> COL_A = new ArrayList<>(Arrays.asList(BoardSquareEnums.A1.pos, BoardSquareEnums.A2.pos, BoardSquareEnums.A3.pos, BoardSquareEnums.A4.pos, BoardSquareEnums.A5.pos, BoardSquareEnums.A6.pos, BoardSquareEnums.A7.pos, BoardSquareEnums.A8.pos));
    public static final List<Integer> COL_B = new ArrayList<>(Arrays.asList(BoardSquareEnums.B1.pos, BoardSquareEnums.B2.pos, BoardSquareEnums.B3.pos, BoardSquareEnums.B4.pos, BoardSquareEnums.B5.pos, BoardSquareEnums.B6.pos, BoardSquareEnums.B7.pos, BoardSquareEnums.B8.pos));
    public static final List<Integer> COL_C = new ArrayList<>(Arrays.asList(BoardSquareEnums.C1.pos, BoardSquareEnums.C2.pos, BoardSquareEnums.C3.pos, BoardSquareEnums.C4.pos, BoardSquareEnums.C5.pos, BoardSquareEnums.C6.pos, BoardSquareEnums.C7.pos, BoardSquareEnums.C8.pos));
    public static final List<Integer> COL_D = new ArrayList<>(Arrays.asList(BoardSquareEnums.D1.pos, BoardSquareEnums.D2.pos, BoardSquareEnums.D3.pos, BoardSquareEnums.D4.pos, BoardSquareEnums.D5.pos, BoardSquareEnums.D6.pos, BoardSquareEnums.D7.pos, BoardSquareEnums.D8.pos));
    public static final List<Integer> COL_E = new ArrayList<>(Arrays.asList(BoardSquareEnums.E1.pos, BoardSquareEnums.E2.pos, BoardSquareEnums.E3.pos, BoardSquareEnums.E4.pos, BoardSquareEnums.E5.pos, BoardSquareEnums.E6.pos, BoardSquareEnums.E7.pos, BoardSquareEnums.E8.pos));
    public static final List<Integer> COL_F = new ArrayList<>(Arrays.asList(BoardSquareEnums.F1.pos, BoardSquareEnums.F2.pos, BoardSquareEnums.F3.pos, BoardSquareEnums.F4.pos, BoardSquareEnums.F5.pos, BoardSquareEnums.F6.pos, BoardSquareEnums.F7.pos, BoardSquareEnums.F8.pos));
    public static final List<Integer> COL_G = new ArrayList<>(Arrays.asList(BoardSquareEnums.G1.pos, BoardSquareEnums.G2.pos, BoardSquareEnums.G3.pos, BoardSquareEnums.G4.pos, BoardSquareEnums.G5.pos, BoardSquareEnums.G6.pos, BoardSquareEnums.G7.pos, BoardSquareEnums.G8.pos));
    public static final List<Integer> COL_H = new ArrayList<>(Arrays.asList(BoardSquareEnums.H1.pos, BoardSquareEnums.H2.pos, BoardSquareEnums.H3.pos, BoardSquareEnums.H4.pos, BoardSquareEnums.H5.pos, BoardSquareEnums.H6.pos, BoardSquareEnums.H7.pos, BoardSquareEnums.H8.pos));

    public static final List<Integer> ROW_1 = new ArrayList<>(Arrays.asList(BoardSquareEnums.A1.pos, BoardSquareEnums.B1.pos, BoardSquareEnums.C1.pos, BoardSquareEnums.D1.pos, BoardSquareEnums.E1.pos, BoardSquareEnums.F1.pos, BoardSquareEnums.G1.pos, BoardSquareEnums.H1.pos));
    public static final List<Integer> ROW_2 = new ArrayList<>(Arrays.asList(BoardSquareEnums.A2.pos, BoardSquareEnums.B2.pos, BoardSquareEnums.C2.pos, BoardSquareEnums.D2.pos, BoardSquareEnums.E2.pos, BoardSquareEnums.F2.pos, BoardSquareEnums.G2.pos, BoardSquareEnums.H2.pos));
    public static final List<Integer> ROW_3 = new ArrayList<>(Arrays.asList(BoardSquareEnums.A3.pos, BoardSquareEnums.B3.pos, BoardSquareEnums.C3.pos, BoardSquareEnums.D3.pos, BoardSquareEnums.E3.pos, BoardSquareEnums.F3.pos, BoardSquareEnums.G3.pos, BoardSquareEnums.H3.pos));
    public static final List<Integer> ROW_4 = new ArrayList<>(Arrays.asList(BoardSquareEnums.A4.pos, BoardSquareEnums.B4.pos, BoardSquareEnums.C4.pos, BoardSquareEnums.D4.pos, BoardSquareEnums.E4.pos, BoardSquareEnums.F4.pos, BoardSquareEnums.G4.pos, BoardSquareEnums.H4.pos));
    public static final List<Integer> ROW_5 = new ArrayList<>(Arrays.asList(BoardSquareEnums.A5.pos, BoardSquareEnums.B5.pos, BoardSquareEnums.C5.pos, BoardSquareEnums.D5.pos, BoardSquareEnums.E5.pos, BoardSquareEnums.F5.pos, BoardSquareEnums.G5.pos, BoardSquareEnums.H5.pos));
    public static final List<Integer> ROW_6 = new ArrayList<>(Arrays.asList(BoardSquareEnums.A6.pos, BoardSquareEnums.B6.pos, BoardSquareEnums.C6.pos, BoardSquareEnums.D6.pos, BoardSquareEnums.E6.pos, BoardSquareEnums.F6.pos, BoardSquareEnums.G6.pos, BoardSquareEnums.H6.pos));
    public static final List<Integer> ROW_7 = new ArrayList<>(Arrays.asList(BoardSquareEnums.A7.pos, BoardSquareEnums.B7.pos, BoardSquareEnums.C7.pos, BoardSquareEnums.D7.pos, BoardSquareEnums.E7.pos, BoardSquareEnums.F7.pos, BoardSquareEnums.G7.pos, BoardSquareEnums.H7.pos));
    public static final List<Integer> ROW_8 = new ArrayList<>(Arrays.asList(BoardSquareEnums.A8.pos, BoardSquareEnums.B8.pos, BoardSquareEnums.C8.pos, BoardSquareEnums.D8.pos, BoardSquareEnums.E8.pos, BoardSquareEnums.F8.pos, BoardSquareEnums.G8.pos, BoardSquareEnums.H8.pos));

    private ChessConstants() {
        // Prevent parameters

    }
}
