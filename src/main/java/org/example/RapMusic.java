package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RapMusic implements Music {
    List<String> musicList = new ArrayList<>();

    {
        for (int i = 1; i <= 5; i++) {
            this.musicList.add("Rap music №" + i);
        }
    }

    @Override
    public List<String> getSong() {
        return musicList;
    }
}
