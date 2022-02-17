package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("ausfluge.txt");
        Scanner sc = new Scanner(file);
        String line;
        String[] ausflug;

        List<Ausfluge> ausflugeList = new ArrayList<>();

        //a. Lesen aus der Datei
        while(sc.hasNext()){
            line = sc.nextLine();
            ausflug = line.split("&&");

            Ausfluge ausfluge = new Ausfluge(Integer.parseInt(ausflug[0]), ausflug[1], Integer.parseInt(ausflug[2]), Integer.parseInt(ausflug[3]), Integer.parseInt(ausflug[4]));

            ausflugeList.add(ausfluge);
        }

        //b. Sortieren Ausfluge nach anz_teilnehmer
        ausflugeList.sort(new Comparator<Ausfluge>() {
            @Override
            public int compare(Ausfluge o1, Ausfluge o2) {
                return o2.getAnz_teilnehmer() - o1.getAnz_teilnehmer();
            }
        });

        //c. Schreiben in der Datei ausflugesortiert.txt
        FileWriter fw1 = new FileWriter("ausflugesortiert.txt");
        for(Ausfluge a : ausflugeList){
            fw1.write(a.getId() + "&&" + a.getReiseziehl() + "&&" + a.getPreis_pro_person() + "&&" + a.getMax_anz_teilnehmer() + "&&" + a.getAnz_teilnehmer() + '\n');
        }
        fw1.close();

        //d. Statistik fur Top Orte


    }
}
