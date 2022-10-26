package org.training.design.patterns.training.oo.structural.bridge.araba;

public class ArabaRun2 {

    public static void main(String[] args) {

        Araba araba = new SporAraba(Benzinli.builder()
                                            .litre(10)
                                            .depoLt(60)
                                            .menzil(600)
                                            .build(),
                                    new Otomatik(),
                                    "BMW",
                                    180);
    }
}
