package io.github.berrygobbler78.constants;

public enum BoardSquareEnums {
    // Row A
    A1("a1", 0, 1), 
    A2("a2", 8, 2), 
    A3("a3", 16, 3), 
    A4("a4", 24, 4), 
    A5("a5", 32, 5), 
    A6("a6", 40, 3), 
    A7("a7", 48, 2), 
    A8("a8", 56, 1),

    // Row B
    B1("b1", 1, 6),
    B2("b2", 9, 6),
    B3("b3", 17, 6),
    B4("b4", 25, 6),
    B5("b5", 33, 6),
    B6("b6", 41, 6),
    B7("b7", 49, 6),
    B8("b8", 57, 6),

    // Row C
    C1("c1", 2, 0),
    C2("c2", 10, 0),
    C3("c3", 18, 0),
    C4("c4", 26, 0),
    C5("c5", 34, 0),
    C6("c6", 42, 0),
    C7("c7", 50, 0),
    C8("c8", 58, 0),

    // Row D
    D1("d1", 3, 0),
    D2("d2", 11, 0),
    D3("d3", 19, 0),
    D4("d4", 27, 0),
    D5("d5", 35, 0),
    D6("d6", 43, 0),
    D7("d7", 51, 0),
    D8("d8", 59, 0),
    
    // Row E
    E1("e1", 4, 0),
    E2("e2", 12, 0),
    E3("e3", 20, 0),
    E4("e4", 28, 0),
    E5("e5", 36, 0),
    E6("e6", 44, 0),
    E7("e7", 52, 0),
    E8("e8", 60, 0),

    // Row F
    F1("f1", 5, 0),
    F2("f2", 13, 0),
    F3("f3", 21, 0),
    F4("f4", 29, 0),
    F5("f5", 37, 0),
    F6("f6", 45, 0),
    F7("f7", 53, 0),
    F8("f8", 61, 0),
    
    // Row G
    G1("g1", 6, 7),
    G2("g2", 14, 7),
    G3("g3", 22, 7),
    G4("g4", 30, 7),
    G5("g5", 38, 7),
    G6("g6", 46, 7),
    G7("g7", 54, 7),
    G8("g8", 62, 7),
    
    // Row H
    H1("h1", 7, 8),
    H2("h2", 15, 9),
    H3("h3", 23, 10),
    H4("h4", 31, 11),
    H5("h5", 39, 12),
    H6("h6", 47, 10),
    H7("h7", 55, 9),
    H8("h8", 63, 8);


    final String name;
    final int pos;
    int pieceOnSquare;

    BoardSquareEnums(String name, int pos, int pieceOnSquare) {
        this.name = name;
        this.pos = pos;
        this.pieceOnSquare = pieceOnSquare;
    }
}
