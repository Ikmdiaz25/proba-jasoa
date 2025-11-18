import java.util.Scanner;

public class EstekakEtaScrumAzalpena {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Aukeratu zenbaki bat:");

            System.out.println("1.SCRUM AZALPENA");
            System.out.println("2.TRELLO ESTEKA");
            System.out.println("3.GITHUB ESTEKA");
            System.out.println("4.IRTEN");

            int aukera = sc.nextInt();

            switch (aukera) {
                case 1:

                    System.out.println("===Hona hemen SCRUM AZALPENA===");

                    System.out.println(
                            "Hasieran, lan egiteko modua katara modukoa zen, hau da," +
                                    "gauzak pixkanaka egiten joan lana banandu gabe eta hori bukatu " +
                                    "harte ez erakustea bezeroari, orduan feedback ez zegoen. Baina Scum izeneko metodologia sortu zen"
                                    +
                                    "eta hori lana zatitan banatzea ekarri zuen. Scrum batean rolak zehazten dira, hala nola,"
                                    +
                                    "nor izango den bozeramailea, idazkaria, dev team, Scum master... Hori bakoitzari zeregin bat"
                                    +
                                    "ematen dio eta lana modu hobe batean banantzen du. Baita ere, hasi ehgun guztietan hasi baino"
                                    +
                                    "lehen bilerak egiten dira Daily Scrum deitzen direnak eta bkoitzak bere buruari galderak egiten"
                                    +
                                    "dizkio, hala nola: Zer egin dut? Zer egin behar dut? Zer oztopo ditut hori egiteko? Baita ere, Tableroa(Trello)"
                                    +
                                    "egiterakoan Story Pointak erabiltzen dira, atzaren zailtasuna ezartzeko. Fibonnacci (1,2,3,5,8...) edo Poker teknikak erabili ahal dira. ");

                    break;

                case 2:

                    System.out.println("===Hona hemen TRELLO ESTEKA===");

                    System.out.println(
                            "https://trello.com/invite/b/691c1fa2d4d477d4dd957882/ATTIaffbab6ad885c98c64bd555baaff4f71DF7E9910/proba-garapen");

                    break;

                case 3:
                                    System.out.println("===Hona hemen GITHUB ESTEKA===");

                    System.out.println(
                            "https://github.com/Ikmdiaz25/proba-jasoa.git");


                    break;

                case 4:

                    System.exit(0);
                    break;
            }
        }

    }

}