package com.company;
import java.util.Map;
import java.util.HashMap;
public class Main {

    public static void main(String[] args) {

	HashMap<MashT26,DannyeMashin> tapmash = new HashMap<MashT26,DannyeMashin>();
        tapmash.put(new MashT26(101,"Fin140" ),new DannyeMashin(2008,"АУДИ",
                "Жашыл ",5600.3));
        tapmash.put(new MashT26(102,"AIV234" ),new DannyeMashin(2014,"Volvo",
                "Кызыл ",4300.6));
        tapmash.put(new MashT26(103,"NMD543" ),new DannyeMashin(2018,"Kamri",
                "Кара ",7650.1));
        tapmash.put(new MashT26(104,"SAF642" ),new DannyeMashin(2011,"MERS",
                "Ак   ",65400.6));
        tapmash.put(new MashT26(105,"FJS176" ),new DannyeMashin(2020,"Lecsus",
                "Сары ",17600.0));
        for (Map.Entry<MashT26,DannyeMashin> item : tapmash.entrySet()){
            System.out.println(" Ключ - "+ item.getKey()+ " Модель- "+ item.getValue().getModel()+
                    "; Год выпуска  " +item.getValue().getGodvyp()+"; Цена - "+item.getValue().getZena() + "; Цвет  - " +
                    item.getValue().getZvet());



        }

        }
}
