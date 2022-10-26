package org.training.design.patterns.training.oo.structural.bridge.araba;

public class YakitTuru {
    int litre;
    int menzil;
    int depoLt;

    public YakitTuru() {
    }

    public YakitTuru(int litre,
                     int menzil,
                     int depoLt) {
        this.litre = litre;
        this.menzil = menzil;
        this.depoLt = depoLt;
    }

    public static YakitTuruBuilder builder() {
        return new YakitTuruBuilder();
    }

    public int calculateMenzil(){
        return menzil * litre / depoLt;
    }

    public int getLitre() {
        return this.litre;
    }

    public int getMenzil() {
        return this.menzil;
    }

    public int getDepoLt() {
        return this.depoLt;
    }

    public void setLitre(int litre) {
        this.litre = litre;
    }

    public void setMenzil(int menzil) {
        this.menzil = menzil;
    }

    public void setDepoLt(int depoLt) {
        this.depoLt = depoLt;
    }

    public static class YakitTuruBuilder {
        private int litre;
        private int menzil;
        private int depoLt;

        YakitTuruBuilder() {
        }

        public YakitTuruBuilder litre(int litre) {
            this.litre = litre;
            return this;
        }

        public YakitTuruBuilder menzil(int menzil) {
            this.menzil = menzil;
            return this;
        }

        public YakitTuruBuilder depoLt(int depoLt) {
            this.depoLt = depoLt;
            return this;
        }

        public YakitTuru build() {
            return new YakitTuru(litre,
                                 menzil,
                                 depoLt);
        }

        public String toString() {
            return "YakitTuru.YakitTuruBuilder(litre=" + this.litre + ", menzil=" + this.menzil + ", depoLt=" + this.depoLt + ")";
        }
    }
}
