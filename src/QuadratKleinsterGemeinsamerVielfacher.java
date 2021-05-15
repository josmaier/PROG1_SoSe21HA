public class QuadratKleinsterGemeinsamerVielfacher {

    public static void main(String[] args) {

        int kgv = 0; //setting variable for kleinstes gemeinsames vielfaches

        for (int i = 1; i <= 10; i++) {//drawing top row
            System.out.print(i + "\t");
            for (int y = 2; y <= 10; y++) {//drawing consecutive columns

                int a = i;//declaring variables for calculation and setting them as current numbers from top row and first columns

                int b = y;


                int ah = a; //setting help variables for größter gemeinsamer teiler

                int bh = b;

                while (ah != bh) {//calculation ggT
                    if (ah > bh) {
                        ah = ah - bh;
                    } else {
                        bh = bh - ah;
                    }
                }

                kgv = (a * b) / bh;//calculating kgV


                System.out.print(kgv);//printing next entry in row
                System.out.print("\t");//adding space
            }
            System.out.println();//skipping to next row
        }
    }
}
