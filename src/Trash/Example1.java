package Trash;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) throws IOException {
        String names = "Maqsud\tRustamov\n" +
                "Asadbek\tXudoyorov\n" +
                "Afzal\tMaxmadazimov\n" +
                "Shavkat\tSharifov\n" +
                "Javohir\tRaximberdiyev\n" +
                "Jamshid\tAkbarov\n" +
                "Elyorbek\tIkramov\n" +
                "Hakimbek\tAxmadjanov\n" +
                "Shuhratjon\tRahimjonov\n" +
                "Ulug'bek\tRaxmatullayev\n" +
                "Temurbek\tAbdullayev\n" +
                "Bobojon\tUsmonov\n" +
                "Nodirbek\tDjalilov\n" +
                "Behruz\tSarmisokov\n" +
                "Kamila\tViktorova\n" +
                "E'zoza\tAvazova\n" +
                "Madinabonu\tMansurova\n" +
                "Validaxon\tAlobidinova\n" +
                "Ulzada\tKurbanbaeva\n" +
                "Xurshida\tSayfullayeva\n" +
                "Feruzabonu\tFaridunova\n" +
                "Madina\tRajabova\n" +
                "Akbarjon\tSobitxonov\n" +
                "Sunnatullo\tJumanazarov\n";



        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Names.txt"))){
            writer.write(names);
        }
    }

}
