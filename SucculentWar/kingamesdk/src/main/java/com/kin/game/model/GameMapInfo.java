package com.kin.game.model;

import android.graphics.Rect;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by song on 18-3-3.
 */
public class GameMapInfo {
    static GameMapInfo instance;

    @Setter
    @Getter
    private Rect mapBounds;

    public static GameMapInfo getInstance() {
        if (instance == null) {
            instance = new GameMapInfo();
        }

        return instance;
    }


}
