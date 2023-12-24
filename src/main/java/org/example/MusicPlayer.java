package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;


@Component
@Scope("prototype")
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private Music classicalMusic;
    private Music rockMusic;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic, @Qualifier("rockMusic") Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }
//    @Autowired
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }


    public void playMusic(MusicGenre genre) {
        Random random = new Random();
        if (genre == MusicGenre.Classical) {
            System.out.println("Playing: " + classicalMusic.getSong().get(random.nextInt(5)));
        } else {
            System.out.println(rockMusic.getSong().get(random.nextInt(5)));
        }
    }

    public void getMusicList(MusicGenre genre) {
        if (genre == MusicGenre.Classical) {
            for (String i : classicalMusic.getSong()) {
                System.out.println(i);
            }
        } else {
            for (String i : rockMusic.getSong()) {
                System.out.println(i);
            }
        }
    }

}
