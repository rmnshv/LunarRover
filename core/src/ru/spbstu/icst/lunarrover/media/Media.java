package ru.spbstu.icst.lunarrover.media;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;

public class Media {

    private AssetManager assetManager;

    public Media(AssetManager assetManager) {
        this.assetManager = assetManager;
    }

    public void playSound(String name){
        Sound sound = assetManager.get("sounds/" + name, Sound.class);
        sound.play();
    }

    public void playMusic(String name, boolean loop){
        Music music = assetManager.get("music/" + name, Music.class);
        music.setLooping(loop);
        music.play();
    }

    public void stopMusic(String name){
        Music music = assetManager.get("music/" + name, Music.class);
        music.stop();
    }

    public void addMusic(String name){
        assetManager.load("music/" + name, Music.class);
    }

    public void removeMusic(String name){
        assetManager.unload("music/" + name);
    }

    public boolean update(){
        return assetManager.update();
    }

}
