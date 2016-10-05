package boardview;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import model.Position;

/**
 * View class for a tile on a chess board
 * A tile should be able to display a chess piece
 * as well as highlight itself during the game.
 *
 * @author <Yourname here>
 */
public class TileView implements Tile {

    /**
     * Creates a TileView with a specified position
     * @param p
     */
    public TileView(Position p) {
        // TODO
    }


    @Override
    public Position getPosition() {
        // TODO
        return null;
    }


    @Override
    public Node getRootNode() {
        // TODO
        return null;
    }

    @Override
    public void setSymbol(String symbol) {
        // TODO
    }


    @Override
    public String getSymbol() {
        // TODO
        return null;
    }

    @Override
    public void highlight(Color color) {
        // TODO
    }

    @Override
    public void clear() {
        // TODO
    }
}
