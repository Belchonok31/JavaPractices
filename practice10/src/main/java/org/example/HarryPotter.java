package org.example;

import org.springframework.stereotype.Component;

@Component
public class HarryPotter implements Magican{
    @Override
    public void doMagic() {
        System.out.println("Авада Кедавра от Гарри Поттера");
    }
}
