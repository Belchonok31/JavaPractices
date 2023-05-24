package org.example;

import org.springframework.stereotype.Component;

@Component
public class Voldemort implements Magican{
    @Override
    public void doMagic() {
        System.out.println("Авада Кедавра от Волендеморта");
    }
}
