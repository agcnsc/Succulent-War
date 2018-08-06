package com.kin.game.control;

import com.kin.game.model.GameMapInfo;
import com.kin.game.model.SpriteBase;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by song on 18-6-3.
 */

public class SpriteController<T extends SpriteBase> {
    @Getter @Setter
    private GameMapInfo gameMapInfo = GameMapInfo.getInstance();
    private T sprite;

    public SpriteController(T sp) {
        sprite = sp;
    }



}
