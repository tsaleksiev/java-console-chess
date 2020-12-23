package Board;

import Pieces.PieceSlot;

import java.util.LinkedHashMap;
import java.util.Map;

public class PiecesCollection {
    public static Map<PieceSlot, String> whiteActivePieces = new LinkedHashMap<>();
    public static Map<PieceSlot, String> whiteTakenPieces = new LinkedHashMap<>();
    public static Map<PieceSlot, String> blackActivePieces = new LinkedHashMap<>();
    public static Map<PieceSlot, String> blackTakenPieces = new LinkedHashMap<>();
}