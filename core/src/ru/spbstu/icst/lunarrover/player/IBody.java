package ru.spbstu.icst.lunarrover.player;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;

public interface IBody {
    public Body createBody(World world);
}
