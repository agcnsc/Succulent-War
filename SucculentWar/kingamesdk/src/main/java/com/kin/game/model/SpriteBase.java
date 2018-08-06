package com.kin.game.model;

import android.graphics.Point;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by song on 18-3-2.
 */
public class SpriteBase {

    @Getter
    @Setter
    private Point currentPosition = new Point(0, 0);
    @Getter
    @Setter
    private int visionRadius = 50;
    @Getter
    @Setter
    private int attackRadius = 20;
    @Getter
    @Setter
    private int maxHealth = 50;
    @Getter
    @Setter
    private int currentHealth = 50;
    @Getter
    @Setter
    private double physicsAPS = 1;
    @Getter
    @Setter
    private int physicsDamage = 5;
    @Getter
    @Setter
    private int movingSpeed = 100;
    @Getter
    @Setter
    private SpriteStatus status = SpriteStatus.Idle;

    public enum SpriteStatus
    {
        Idle,
        Moving,
        Attacking
    }



}
