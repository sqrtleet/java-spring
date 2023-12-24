package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    List<String> musicList = new ArrayList<>();

    {
        for (int i = 1; i <= 5; i++) {
            this.musicList.add("Rock music №" + i);
        }
    }

    @Override
    public List<String> getSong() {
        return musicList;
    }
}
