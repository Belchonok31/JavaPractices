package org.example;

import org.springframework.stereotype.Component;

@Component
public class RonWeesly implements Magican{
    @Override
    public void doMagic() {
        System.out.println("Авада Кедавра от Рона Уизли");
    }
}
