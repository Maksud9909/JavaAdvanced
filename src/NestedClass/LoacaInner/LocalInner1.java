package NestedClass.LoacaInner;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

class Math {
    public void getResult(){



        class Delenie {
            private int delimoe;
            private int delitel;

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }
            public int getChastnoe(){
                return delimoe / delitel;
            }
            public int getOstatok(){
                return delimoe % delitel;
            }
        }

        Delenie delenie = new Delenie();
        delenie.setDelimoe(21);
        delenie.setDelitel(5);
        System.out.println("Delitel " + delenie.getDelitel());
        System.out.println("Delimoe " + delenie.getDelimoe());
        System.out.println("Chastnoe " + delenie.getChastnoe());
        System.out.println("Ostaok " + delenie.getOstatok());
    }
}
