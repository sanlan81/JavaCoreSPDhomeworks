package com.spduniversity.javacore.hw6.EnumPizza;

 interface Ingridients {

    enum Americano implements Ingridients{CHEESE,SOUSAGE,CORN;
    }
    enum Italliano implements Ingridients{CHEESE,OLIVE,PORK;
    }
    enum OwnPizza implements Ingridients{CHEESE,SOUSAGE,CORN,PORK,OLIVE,SEAFOOD;
    }

}
