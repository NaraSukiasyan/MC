package com.company;
class Branch{
    int card;                 //banki masnachyuxi vacharac ratern en
    int t;
    int vach;


    Branch(Branch Gyumri){
        card = Gyumri.card;                 //stexcel em obektn-Gyumri masnachyux
        t = Gyumri.t;
        vach = Gyumri.vach;
    }
    Branch(){
        card = 2500;                         //konstruktor qarti spasarkman vchar 2500dram
        t = 4;                               // 4 tari jamketov
        vach = 100;                          //vacharvel e 100 hat card
    }
    int ekamut(){
        return card * t * vach;               //metod ekamut
    }
}

class HeadOffice extends Branch{               //glxamasn ir mej nerarum e masnachyuxi tvyalner@-jarangum
    int masnachyux;

    HeadOffice(){
        card = 2500;
        t = 4;
        vach = 100;
        masnachyux = 50;                   //glxamasn uni 50 masnachyux
    }

}
 class DemoHeadOffice {

    public static void main(String[] args) {
        HeadOffice Ararat = new HeadOffice();
        Branch Gyumri = new Branch();
        int income;

        income = Ararat.ekamut();
        System.out.println("Glxamasi ekamutn =" + income);

        income = Gyumri.ekamut();
        System.out.println("Masnachyuxi ekamtn =" + income);
    }
}
