package io.github.berrygobbler78.constants;

public enum PieceEnums {
    // P = 100
    // N = 320
    // B = 330
    // R = 500
    // Q = 900
    // K = 20000

    KING_WHITE(),
    QUEEN_WHITE(),
    BISHOP_WHITE(),
    KNIGHT_WHITE(),
    ROOK_WHITE(),
    PAWN_WHITE(),

    KING_BLACK(),
    QUEEN_BLACK(),
    BISHOP_BLACK(),
    KNIGHT_BLACK(),
    ROOK_BLACK(),
    PAWN_BLACK();

    final String name;
    final int num;
    final int value;

    PieceEnums(String name, int num, int value) {

    }
}
