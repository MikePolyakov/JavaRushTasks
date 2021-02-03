package com.javarush.task.task35.task3513;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private static final int FIELD_WIDTH = 4;
    private Tile[][] gameTiles;
    public int score;
    public int maxTile;

    public Model() {
        resetGameTiles();
    }

    public void resetGameTiles() {
        gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        score = 0;
        maxTile = 0;
        for (int i = 0; i < FIELD_WIDTH; i++) {
            for (int j = 0; j < FIELD_WIDTH; j++) {
                gameTiles[i][j] = new Tile();
            }
        }
        addTile();
        addTile();
    }

//    private List<Tile> getEmptyTiles() {
//        List<Tile> emptyTilesList = new ArrayList<>();
//        for (int i = 0; i < FIELD_WIDTH; i++) {
//            for (int j = 0; j < FIELD_WIDTH; j++) {
//                if (gameTiles[j][i].isEmpty()) emptyTilesList.add(gameTiles[j][i]);
//            }
//        }
//        return emptyTilesList;
//    }

    // java
    private List<Tile> getEmptyTiles() {
        return Arrays.stream(gameTiles).
                flatMap(Arrays::stream).
                filter(Tile::isEmpty).
                collect(Collectors.toList());
    }

    private void addTile() {
        List<Tile> emptyTilesList = getEmptyTiles();
        if (emptyTilesList.size() > 0) {
            int randomIndex = (int) (emptyTilesList.size() * Math.random());
            int newValue = Math.random() < 0.9 ? 2 : 4;

            Tile tile = emptyTilesList.get(randomIndex);
            tile.value = newValue;
        }
    }

    private void compressTiles(Tile[] tiles) {

        boolean repeat;
        do {
            repeat = false;
            for (int i = 0; i < tiles.length-1; i++) {
                if (tiles[i].value == 0 && tiles[i+1].value > 0) {
                    tiles[i].value = tiles[i+1].value;
                    tiles[i+1].value = 0;
                    repeat = true;
                }
            }
        } while (repeat);
    }

    private void mergeTiles(Tile[] tiles) {
        for (int i = 0; i < tiles.length-1; i++) {
            if (tiles[i].value == tiles[i + 1].value && tiles[i].value > 0) {
                tiles[i].value *= 2;
                tiles[i + 1].value = 0;
                if (tiles[i].value > maxTile) maxTile = tiles[i].value;
                score += tiles[i].value;
            }
        }
    }
}