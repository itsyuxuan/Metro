package comp1110.ass2;

public class Metro {
    /**
     * Task 2
     * Determine whether a piece placement is well-formed. For a piece
     * placement to be well-formed, it must:
     * - contain exactly six characters;
     * - have as its first, second, third and fourth characters letters between
     * 'a' and 'd' inclusive (tracks); and
     * - have as its fifth and sixth characters digits between 0 and 7 inclusive
     * (column and row respectively).
     *
     * @param piecePlacement A String representing the piece to be placed
     * @return True if this string is well-formed
     */

    /**
     * Two methods used to decided whether the first four character are letters
     *  between 'a' and 'd' and the last two digits are between 0 and 7
     */

    public static boolean isFourCharacterValid(String piecePlacement)
    {
        return true;//if the first four character are letters are between 'a' and 'd'
        //false if not
    }
    public static boolean isPiecePlacementWellFormed(String piecePlacement) {
        // FIXME Task 2: determine whether a piece placement is well-formed
        /**
         * Some fields are created below which are accessible for this method
         */
        int NUMBER_OF_CHAR=6; //used to decide the string contains exactly six characters
        return false;
    }

    /**
     * Task 3
     * Determine whether a placement sequence string is well-formed.
     * For a placement sequence to be well-formed, it must satisfy the
     * following criteria:
     * - It must be composed of well-formed tile placements.
     * - For any piece x, there can exist no more instances of x on the board
     * than instances of x in the deck.
     *
     * @param placement A String representing the placement of all tiles on the
     *                  board
     * @return true if this placement sequence is well-formed
     */
    public static boolean isPlacementSequenceWellFormed(String placement) {
        // FIXME Task 3: determine whether a placement sequence is well-formed
        //will finish it later
        return false;
    }

    /**
     * Task 5
     * Draw a random tile from the deck.
     *
     * @param placementSequence a String representing the sequence of tiles
     *                          that have already been played
     * @return a random tile from the deck
     */
    public static String drawFromDeck(String placementSequence) {
        // FIXME Task 5: draw a random tile from the deck
        return "";
    }

    /**
     * Task 6
     * Determine if a given placement sequence follows the rules of the game.
     * These rules are:
     * - All tracks on all placed pieces must eventually arrive at a station.
     * - No piece can overlap another piece, or any of the central stations.
     * - If a piece is on an edge of the board, it cannot contain a track that
     * results in a station looping back to itself, UNLESS it is unavoidable.
     * - If a piece is on a corner of the board, it cannot contain a track that
     * links the two stations adjacent to that corner, UNLESS it is
     * unavoidable.
     *
     * @param placementSequence A sequence of placements on the board.
     * @return Whether this placement string is valid.
     */
    public static boolean isPlacementSequenceValid(String placementSequence) {
        // FIXME Task 6: determine whether a placement sequence is valid
        return true;
    }

    /**
     * Task 7
     * Determine the current score for the game.
     *
     * @param placementSequence a String representing the sequence of piece placements made so far in the game
     * @param numberOfPlayers   The number of players in the game
     * @return an array containing the scores for all players
     */
    public static int[] getScore(String placementSequence, int numberOfPlayers) {
        // FIXME Task 7: determine the current score for the game
        return new int[0];
    }

    /**
     * Task 9
     * Given a placement sequence string, generate a valid next move.
     *
     * @param placementSequence a String representing the sequence of piece placements made so far in the game
     * @param piece             a four-character String representing the tile just drawn
     * @param hand              A tile in the player's hand, which they can choose to play instead of the drawn tile.
     *                          If the player does not currently hold a tile, this parameter will be null.
     * @param numberOfPlayers   The number of players in the game
     * @return A valid placement of other the drawn tile or the tile from the player's hand (if it is not empty).
     */
    public static String generateMove(String placementSequence, String piece, String hand, int numberOfPlayers) {
        // FIXME Task 9: generate a valid move
        return "";
    }
}
