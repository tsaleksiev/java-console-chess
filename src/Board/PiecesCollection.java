package Board;

import Pieces.Piece;

import java.util.LinkedHashMap;
import java.util.Map;

public class PiecesCollection {
    public static Map<Piece, String> whiteActivePieces = new LinkedHashMap<>();
    public static Map<Piece, String> whiteTakenPieces = new LinkedHashMap<>();
    public static Map<Piece, String> blackActivePieces = new LinkedHashMap<>();
    public static Map<Piece, String> blackTakenPieces = new LinkedHashMap<>();
}