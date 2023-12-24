package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("destroying");
    }

    List<String> musicList = new ArrayList<>();

    {
        for (int i = 1; i <= 5; i++) {
            this.musicList.add("Classic music №" + i);
        }
    }

    @Override
    public List<String> getSong() {
        return musicList;
    }
}
