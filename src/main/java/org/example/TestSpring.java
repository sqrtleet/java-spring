package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music musicBean = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(musicBean);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer == musicPlayer1);
        musicPlayer.playMusicList();
        musicPlayer1.setVolume(100);
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer1.getVolume());
        musicPlayer1.playMusicList();

        context.close();
    }
}
