import java.util.Scanner;

public class SoftwarearenGarapenaEskakizunOperazionalakProgramaInformatikoa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         * Hemen menua sortu dut, while(true) jarri dut, izan ere, horrela behin eta
         * berriz terminalean agertuko da, irtetzeko agindua heman arte
         * {@link #while)}
         */
        while (true) {
            System.out.println("Aukeratu zenbaki bat:");

            System.out.println("1.ESKAKIZUN OPERAZIONALAK");
            System.out.println("2.PROGRAMA INFORMATIKOA");
            System.out.println("3.IRTEN");

            int aukera = sc.nextInt();

            /*
             * Switch erabili izan dut modu horretan zenbaki bat aukeratutakoan gauza bat
             * edo beste imprimatuko dizu {@link #switch}
             */

              

            switch (aukera) {/*Lerro honetan breakpoint bat ipini diot menuaren aukeramendua ondofuntzionatzen duela zehazteko, "step over" ematen diot eta zerbait barrutik nola funtzionatzen den ikusi nahi badut step into ematen diot.*/
                case 1:

                    System.out.println("===Hona hemen ESKAKIZUN OPERAZIONALAKREN azalpena===");

                    System.out.println(

                            /*
                             * Hemen birfaktorizazioa aplikatu egin dut "+" sinboloak ipintzen, bestela
                             * textua oso luzea denez, dena eskubira joango zen eta oso gaizki geratuko zen.
                             * Beste modu bat /n erabiltzen egin daiteke.
                             */
                            "Eskakizun operazionalak bi zatitan banatzen dira: Funtzionalak eta Ez-Funtzionalak." +

                                    "Funtzionalen aldetik esan dezakegu, gure softwarean ikusiko diren eskakizunak izango direla,"
                                    +
                                    "hau da, bezeroak zinemako webgunea eskatu badigu, eskakizun ez-funtzioanalak honakoak izango"
                                    +
                                    "ziren: saski orri bat edukitzea, nabigazio barra, estilo dinamikoa edukitzea... Aldiz, ez-funtzionalak"
                                    +
                                    "gure sofwarrea barrutik eduki behar duen eskakizunak dira, edo beste modu batera esanda ikusten"
                                    +
                                    "ez diren eskakizunak izango dira, hala nola, gure web segurua izatea, datuak ondo kudeatzea edo"
                                    +
                                    "gordetzea...");

                    break;

                case 2:
                    System.out.println("===Hona hemen PROGRAMA INFORMATIKOAREN azalpena===");

                    System.out.println(

                            /*
                             * Hemen ere aurreko iruzkinan esan bezala birfaktorizazioa aplikatu dut "+"
                             * sinboloekin, textua oso luzea ez geratzeko.
                             */
                            "Programa informatikoa aginduak hartzen eta agindu hoiek hainbat prozesu bitartez ejekutazten duen"
                                    +
                                    "sistema bat da. Hobeto esanda, programa informatiko bat hainbat pieza edo konponente bitartez eginda"
                                    +
                                    "dago eta haien artean hainbat agindu gertatzen dira momentu baten guk zerbait eskatzerakoan. Urteak"
                                    +
                                    "pasa egin dira eta geroz eta teknologia berriagoarekin orduan eta sistema hobeagoak sortu egin dira denborarekin");

                    break;

                case 3:

                /*Honek programari "itxi" esaten dio. */
                    System.exit(0);
                    break;
            }
        }

    }

}
