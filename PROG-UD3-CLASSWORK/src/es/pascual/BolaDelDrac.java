package es.pascual;

import java.util.Scanner;

public class BolaDelDrac{

    public static final String NEGRE = "\u001B[30m";
    public static final String ROIG = "\u001B[31m";
    public static final String VERD = "\u001B[32m";
    public static final String GROC = "\u001B[33m";
    public static final String BLAU = "\u001B[34m";
    public static final String CIAN = "\u001B[36m";
    public static final String NORMAL = "\u001B[0m";
    public static final String BORRAR = "\\033[H\\033[2J";
    public static final String GOKU = CIAN + "\n" +
            "                   `\\-.   `\n" +
            "                      \\ `.  `\n" +
            "                       \\  \\ |\n" +
            "              __.._    |   \\.       S O N - G O K U\n" +
            "       ..---~~     ~ . |    Y\n" +
            "         ~-.          `|    |\n" +
            "            `.               `~~--.\n" +
            "              \\                    ~.\n" +
            "               \\                     \\__. . -- -  .\n" +
            "         .-~~~~~      ,    ,            ~~~~~~---...._\n" +
            "      .-~___        ,'/  ,'/ ,'\\          __...---~~~\n" +
            "            ~-.    /._\\_( ,(/_. 7,-.    ~~---...__\n" +
            "           _...>-  P\"\"6=`_/\"6\"~   6)    ___...--~~~\n" +
            "            ~~--._ \\`--') `---'   9'  _..--~~~\n" +
            "                  ~\\ ~~/_  ~~~   /`-.--~~\n" +
            "                    `.  ---    .'   \\_\n" +
            "                      `. \" _.-'     | ~-.,-------._\n" +
            "                  ..._../~~   ./       .-'    .-~~~-.\n" +
            "            ,--~~~ ,'...\\` _./.----~~.'/    /'       `-\n" +
            "        _.-(      |\\    `/~ _____..-' /    /      _.-~~`.\n" +
            "       /   |     /. ^---~~~~       ' /    /     ,'  ~.   \\\n" +
            "      (    /    (  .           _ ' /'    /    ,/      \\   )\n" +
            "      (`. |     `\\   - - - - ~   /'      (   /         .  |\n" +
            "       \\.\\|       \\            /'        \\  |`.           /\n" +
            "       /.'\\\\      `\\         /'           ~-\\         .   \\\n" +
            "      /,   (        `\\     /'                `.___..-      \\\n" +
            "     | |    \\         `\\_/'                  //      \\.     |\n" +
            "     | |     |                               /' |       |     |";
    public static final String SATANAS = ROIG + "                              ____\n" +
            "                          .-\"\"    \"\"--.\n" +
            "                        ,'             `.\n" +
            "                       /     ,'          \\\n" +
            "                    `\\/     .             |\n" +
            "                  .===:_,  |              /\n" +
            "                 / .'\"\"\".  ,:=:.         / _.,\n" +
            "                \"   `--. `|/  _\\` (    _/-\" /\n" +
            "                     |\\_b_9-\"\"  ___) -\"-\"//'\n" +
            "                     | --/`--_o\"_/'  (6_/\n" +
            "  SATANÀS COR PETIT  / ,'    -\"\"    .),-'\n" +
            "                     (  \"-__       `-(\n" +
            "                      \\ |HHH/    /    \\\n" +
            "                       \\  -   _./      `-._..._\n" +
            "                        7----\",'/     ..-\" .-- \"--.._\n" +
            "                 _.._.-/)  .-',/   .-\"  -\"           \"\"--..\n" +
            "          _..--\"|=\"\"--..--\"\"\"\"\"\"./'  .              .-\"\"\"-.\\\n" +
            "        ,' .-','     ,'       /,   /              .'       \\\\\n" +
            "     .:' ,' ,:      /      ,/'/  /'         _....' _..--\"\"\" )\n" +
            "   ,\"/  /  /(      /   _,/' / ,/'         /.    .-\"       __|\n" +
            "  / / /'  (  \"\"----\"\"\"\"   / ,/           / `:.-\"    _.--\"\"  /\n" +
            "  ||  (    \\_       __.-'  /             |`-.`:=._-\"    _.-:|\n" +
            "  \\/   \\     \"\"\"\"\"\"\"      /               \"\"-`  `-\"====\"-'   \\\n" +
            "  |     \"-.        __..-\"                    \\._.====..       `\n" +
            "  |        \"\"--\"\"\"\"                          //..---\"\"\\\\       .\n" +
            "  \\                                          /'| __...---.\\      |";
    public static final String SON_GOHAN = GROC + "         __...__\n" +
            "          \"-._  \"\"--.._     \\-.\n" +
            "              \"-.      \"-.   \\ `.\n" +
            "                 \\        `. |   \\\n" +
            "                  |   \\  \\  \\`|   \\   _.---..__\n" +
            " -..\"\"\"\"\"\"\"---..  |          \\|   |,-\" __   __..\"--\n" +
            "    \"\"--._      \"\"-|   | |  \\ |   `_.-\"  \"\"--._\n" +
            "         _`-.       `.         _.-\"         ___.\"-\n" +
            "       \"-.\"\"-`. `.    `.     -\" _-\"  ,' .-\"\"__\n" +
            "           \"-. \\  \\     _.._        / ,'     _\"-\n" +
            "          _.----\\           `.       /  =._   `\\\\\n" +
            "        ,/ _.--   /    \\,-.   \\\"\"-.     -._  :.\\\n" +
            "       /  __... / |   /\"   `. |   )          _)\\\n" +
            "      /-\"\"  /  (   `.|   ./ _\\|  ',-\"\"\\  _.-\"\n" +
            "           | .-   /|\"6=.,.=6\"/`    ,9 |-\"     S O N - G O H A N\n" +
            "           '  '\" \\|`(--')`--'      /',\\\n" +
            "                  `  \\\"/_ \"\"\"    _.-'  \\       \n" +
            "                      . .--              \\         \n" +
            "                       `.\"   .-   |      \\\n" +
            "                         \"--\"    /       |\"-.----._\n" +
            "                   ,-.---,|    ,'   ______   `.    `--..__\n" +
            "               .-\"/   .'' |   .--\"\"\"      \"\"-.|           `--.\n" +
            "              /     /' \"-. _.'                |      _.--\"\"\"`-.\n" +
            "             /    ./      /         --\"\"\"\"\",/'     ,'        \\ \\\n" +
            "           /'|/   (      |             ,/'        /           \\ \\\n" +
            "          /  /    `\\     |          ,/'          /            |  )\n" +
            "          | /       `._.- ---..__,/'            ( \\          /   /\n" +
            "           (          `.      ,/'                `.`-..__    `--._\n" +
            "          / `.          `\\_,/'                     \\      \"`\\     \\";
    public static final String TEN = BLAU + "                        ..-----..\n" +
            "                     ,-\"         \"-.\n" +
            "                   ,'               `.\n" +
            "                  /                   \\\n" +
            "                 .                     .\n" +
            "                 |                     |\n" +
            "                 |        00000        |\n" +
            "              .-.|        0···0       |,-.\n" +
            "              |(\\| ?b._   00000   _.dP |/)|\n" +
            "              |\\d`. |`\"\"=.__ __.=\"\"'| .'6/|\n" +
            "              `.\\_|  -..\"_/   \\_\"..-  |_/,'\n" +
            "                `._\\  --.. .   .---  /_,'\n" +
            "                    \\      ___      /\n" +
            "  Ten Shin Han       `-.  \"...\"  .-'\n" +
            "                 ._ .-|.`-._ _.-'.|-. _.\n" +
            "             _.-/ .' '  \\       /  ` `. \\-._\n" +
            "        ..--\"   . \\..._).\\_   _/.(_.../ .   \"--..\n" +
            "       /\\        \\ |\"\"--.._\"=\"_..--\"\"| /        /\\\n" +
            "      |  \\ .      \\ `.     \"\"\"     .' .      . /  |\n" +
            "    ./    \\ \\       . `-.       .-'         / /    \\.\n" +
            "    |_     `|         .  `-. ,-'            |'     _|\n" +
            "     /\"-.   |           .   \"               |   .-\"\\\n" +
            "    /    T-. \\      \\      ._      .--.    / .-T    \\\n" +
            "   .     |  \"-\\       .           /    |  /-\"  |     .\n" +
            "   |     `    |.        - .     .(\"    / .|    '     |\n" +
            "   \\   | ._  .'|              _.-\".-\",'  |`.  _. |   /\n" +
            "   ()  |   \"(   `._________._..________.'  )\"   |  ()\n" +
            "   (   `    \\    (========( / /)========)   /    /   )";
    public static final String BOO = BLAU + "                                                                                \n" +
            "                                       &&&%   #                                 \n" +
            "                                     &&&&%,                                     \n" +
            "                                   .&&&&&%%,                                    \n" +
            "                                (&&&&&&&&&&&%%                                  \n" +
            "                               &&&&&%&&&&&&&&%%%                                \n" +
            "                            %&&&&&&&&&&&&&&&&%%%%%                              \n" +
            "                            &&&&&&&*&&&&&..&&&%%%.                              \n" +
            "                         .(/&&&&&&&%///////&&&&&%%                              \n" +
            "                   (((((.(((&&&&&&&&&&&&&&&&&&&%%%,******.                      \n" +
            "             .(((((((,*(*((((.%&&&&&&&&&&&&&&&%%(*,(**/***,****/                \n" +
            "             #&&&&%/*(((,*((*(((/&&&&&&&&&&%%*(/(.((**.((***/,&.%.              \n" +
            "        .&&&&&&&%%&&%#***(((((/.(*((.//((((*.((((((((((/#%%&&&&&&&%*%%%,        \n" +
            "     &&&&&&&&&%%%%%*#,,,.#/&&&((*/(*/%%%/*(*,((.%##,,,...#%&&&%&&&&&&&&&%%%     \n" +
            "  ,&&&&&&&&&%%%.%*#,,,,...(#(((((/*#&&&&&**((/((( .,,,,....#/%*&%&&&&&&&&%%%,   \n" +
            " &&&&&&(%%%%/*.,,,,,,,.....((****%%%%%%%%%%%%((((( ,,,,......... /.((*#&&&&&%%  \n" +
            " &&&&&&%%/***.,,,,,,,......(#%,%%%%&&&&&&&&&%%/#(*,,, /####### ..@@@@%%#%*&%%   \n" +
            " &&#%%%%%%%%. ####//##%####.&&&&&&&&&&&&%&&&&&&&&#&%%%%%%%%%%%@@@@/%%%%%%#%     \n" +
            "  @@@@%%%%,% &&&&&%&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&#, .&@@%%%%% *%%%%,*    \n" +
            "   %@@@(%%%%%%.,,,,,...........%*./#&&&&&&&//@@@..............%%%%%%%%#%**/**   \n" +
            "   ((*@@%%%%%%,%&&%# .........@%%%%/%%%%% @%%%%%@.....*@@@@&.&@/##%.%.********  \n" +
            "  ((*/%%%%%@@@@@@@@&@@@@&@@*.@&%(%%.% % @/%%/%%%%@@@&@#@@/@@@&@@@,@@/@@@/**/***,";
    public static final String CELLULA =VERD + "\n" +
            "                                 .&##                                           \n" +
            "                                (%####                    /)                    \n" +
            "                               *%######,                   .(                   \n" +
            "                               &#.######                   ./)                  \n" +
            "                             .##,.######*           .      .*                   \n" +
            "                             (#######...#         ,       ..,                   \n" +
            "                             %###..###,###                ..,                   \n" +
            "                            ###.,###.###(#.   *,          ..*                   \n" +
            "                            #######(...##,(   .          .../                   \n" +
            "                           *##*..#*.###*### .            ...(                   \n" +
            "                           /.#(.##...####.((.....       ....,                   \n" +
            "                          .(#*..###**#(/####.... ...    ...                     \n" +
            "                           /##..##(#########/****...   ....)/                   \n" +
            "                           /#.###...####.#### ****, ... ....                    \n" +
            "                           /#.#(.#####...(###/&%%(%*....../                     \n" +
            "                           /#########.#######(/%%,%*,. . ).                     \n" +
            "                           .###(#######/######//**#*.. //,                      \n" +
            "                            /./#/(/#,..####(.#  /.*..#/,,                       \n" +
            "                          *(*.( /(//// **//##(///..#///,.                       \n" +
            "                          ,#//#,**&&&%(..,,//  ///.*,..,.                       \n" +
            "                           .//&.**&&&&(/,/(,(@ ,,(/ *,.                         \n" +
            "                            .&*&&#(%%&./,,%&&&&&&#/.,                           \n" +
            "                           *@&&&&%#&&& ,, &&%&&&&&.                             \n" +
            "                         * &@&&&&&.#&&%/,%&&&&&&%/                              \n" +
            "                     *#&&&&@@&&&&&(#(,%&&.%%&#(/                                \n" +
            "                 ((((//#&&&&&&&&&/&#&&(/(%&&#(                                  \n" +
            "          . %%#((((((((.(( #&&&&&&(&%,&&&&%#. ,*,                               \n" +
            "        %#(((((((((((((/*. *(/&&&&##&&#&&&&&#&//*/**. * , (**,*(/**,, .         \n" +
            "      %#(((((((((((((/*/**.. ***,,  (#&#/%#/#&@.#//(*. *. *.../****..*..        \n" +
            "     %/(/*/(((((((((*******.. **&%*.....*#%,**.%%&*/&(**   ...*.......*..       \n" +
            "    *%%%((*****************...****............***............ ...... ...        \n" +
            "   ,%%%%((**.**************..  ..*****............ ............                 \n" +
            "    (#(((***.....,******,.... /  .................. ............                \n" +
            "   .(%(**................     ./   ...............    ........ ,,,(#&...        \n" +
            "  *(/*.(**..............    . /,,,,,.,##%&@(      /&        (######///#,%/.*,,* \n" +
            "  ((**.. (*..    ..       , /,######(//..##%&&&&&&*,*// ##########*/,/*./ ..,   \n" +
            " /(**.......          ,,,//,.#&#.#.(####//.(###//(###############/#,*//,,,/#(..";
    public static final String FREEZER = NEGRE + "                                       *,/                                      \n" +
            "                                %&&#//////////(&*.                              \n" +
            "                             &&&&&&&&,*///////,,//(&                            \n" +
            "                           &&&&&&&&/////////////*,,//&                          \n" +
            "                         &&&.,,////,,,,,,,..*,&&/,,.,/&%                        \n" +
            "                        &&&..,,///////,,,,,,,,#&&&,..,. ,                       \n" +
            "                       ,@@@@.,&,///,,,,,,,......&&&,%%%##                       \n" +
            "                        @@@@@%&,,/,,,,,..........&&%%%%##                       \n" +
            "                        @@@@@@*,,,,,,,........... %%%%###                       \n" +
            "                        @@@@@@@@@ ,,,,........ @%%%%%%##.                       \n" +
            "                        /@@@@@@@@@@@@@@@@@%%%%%%%%%%%###/                       \n" +
            "                     .@@ @@@@@@@@@@@*#%%.%%%,#@%%%%%###%@%.                     \n" +
            "                      @@@@,@@ @@ @@@@@@%%&@@%%% @@.%##%@@,                      \n" +
            "                       ,@&..@@@@@ %. %@&*@% *   %%###(@@                        \n" +
            "                            &@@@@@@@%%&@@&%@@@@/%%##..                          \n" +
            "                              @@@,@@.@@@@.%%%.%%%##                             \n" +
            "                               &/@@@@@@&#%%%%% ((                               \n" +
            "                               @@@.% @@@@@%%/#.%#                               \n" +
            "                          .@@@%@@@@ %%%######&%%####                            \n" +
            "                       (@@&% %@@@&%@&%%%%%% &%%%##,#%%%#                        \n" +
            "              /% /  &@@%%%%%%@@@@%#/@@#%%%@@%#%%@@%%%%%%%##  @@(&&&&&&&&        \n" +
            "       &,,,#&&%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*/////////#     \n" +
            "   ,&/,,,,,,. @@@@%%%#//&&@@@@@@@@@@@@@@@@@@@@@@@@@%%%%%*%%&@@@@@ ,,,,,,,,,,..  \n" +
            "  ,&/,,,... @@@@@@(@@@@@@@@@@@@@@@@@@@@@ @@@@@@@@@@@@@@%%%%%#@@@@@@...........  \n" +
            "  &//,,,.@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%% %#%@@@@@@@@&%%%%%%%%%,@@@@@%......&..% \n" +
            " %&//,,@@@@@@@@%%%*@@@@@@@@@@@@@@@@@@@&# @@@@@@@@@@@%%%%%%%%%%%%&@@@%%% ..%%.,& \n" +
            "  /@@@@@@@@@/%%%%@@@@@@@@@@@@@@@@@@@@@%% @@@@@@@@@@%%%%%%%%%%%%####%%%%%%%*.,&  \n" +
            "  @@&@@@@@ *.#*%%%%&@@@@@@@%%%%%%%%%%%%#/%%%&@@@%%%%%%%%%%%%%#########%%%%####  \n" +
            "  (@%%%&@@&%%%#/##%%%%%%%%#########* ,/////,#####%%%%%%%%%%#### ##%%%&%%//,(##  \n" +
            " @@%/@@@@@@@@%####%,/(/#/ %%%./%&&&&&&&&%#((#%&&&/,  /####/,%##(%.@@@@@@&%%%### \n" +
            " @@&@@@@@@@@%%# .@@@@@@@@@@@& /&&&%,,..,&&*,,,,...,(%@@@@@@@%%%#% @@@@@@@@%%####";

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        String acabar = "Adeu";
        String pedre = "Malauradament, la aventura ha acabat i el món torna a ser un lloc\n" +
                "insegur. Una llàstima!";

        System.out.println(VERD + "     888                                       888             888888 \n" +
                "     888                                       888             888888 \n" +
                "     888                                       888             888888 \n" +
                " .d88888888d888 8888b.  .d88b.  .d88b. 88888b. 88888b.  8888b. 888888 \n" +
                "d88\" 888888P\"      \"88bd88P\"88bd88\"\"88b888 \"88b888 \"88b    \"88b888888 \n" +
                "888  888888    .d888888888  888888  888888  888888  888.d888888888888 \n" +
                "Y88b 888888    888  888Y88b 888Y88..88P888  888888 d88P888  888888888 \n" +
                " \"Y88888888    \"Y888888 \"Y88888 \"Y88P\" 888  88888888P\" \"Y888888888888 \n" +
                "                            888                                       \n" +
                "                       Y8b d88P                                       \n" +
                "                        \"Y88P\"                               \n" + NORMAL);

        System.out.println("\tBENVINGUTS A L’AVENTURA DE DRAGON BALL");
        System.out.println("===============================================");
        System.out.println();
        System.out.println("Son-Goku es troba tranquil·lament a casa junt al seu fill Son-Gohan, a\n" +
                "qui li està ajudant a resoldre uns deures que li han manat fer a\n" +
                "l’escola, concretament son de matemàtiques. De sobte, apareix a\n" +
                "casa el Fullet Tortuga i els conta que el malvat villà Freezer està\n" +
                "planejant encontrar les 7 boles del drac per tal de demanar un desig i\n" +
                "obtindre un poder que ningú podrà mai podrà parar. El planeta està\n" +
                "en perill. El Fullet Tortuga et demana ajuda ¿Vols que Son-Goku i\n" +
                "Son-Gohan accepten el repte?");

        int aceptarRepte;


        System.out.println("\n" + "Introdueix el número(1) si vols escomençar: ");
        if (!teclat.hasNextInt()){
            System.out.println("Error! El tipus de dades introduït és incorrecte");
            return;
        }

        aceptarRepte = teclat.nextInt();
        if (aceptarRepte != 1){
            System.out.println(acabar);
            return;
        }
        //NIVELL 1
        int numCasaGoku = (int) (Math.random() * (10 + 1));
        int numeroCasaSatan = (int) (Math.random() * (30 - 20 +1) + (20));
        int endevinarAleatoriNivell1;
        int sumatori = 0;
        System.out.println();
        System.out.println("\n" + VERD +
                "███╗░░██╗██╗██╗░░░██╗███████╗██╗░░░░░██╗░░░░░  ░░███╗░░\n" +
                "████╗░██║██║██║░░░██║██╔════╝██║░░░░░██║░░░░░  ░████║░░\n" +
                "██╔██╗██║██║╚██╗░██╔╝█████╗░░██║░░░░░██║░░░░░  ██╔██║░░\n" +
                "██║╚████║██║░╚████╔╝░██╔══╝░░██║░░░░░██║░░░░░  ╚═╝██║░░\n" +
                "██║░╚███║██║░░╚██╔╝░░███████╗███████╗███████╗  ███████╗\n" +
                "╚═╝░░╚══╝╚═╝░░░╚═╝░░░╚══════╝╚══════╝╚══════╝  ╚══════╝\n" + NORMAL);
        System.out.println(GOKU);

        System.out.println(CIAN + "Son Goku" + NORMAL + ": Molt bé! Anem a buscar les boles de drac abans que\n" +
                "Freezer puga tenir-les. --va dir Son-Goku des de la seua casa en el\n" +
                "número " + NEGRE + numCasaGoku + NORMAL + " de Ciutat del Nord\n");

        if (teclat.hasNext()){
            System.out.print("\033[H\033[2J");

            System.out.flush();
        }

        System.out.println("Goku va recordar que l’última vegada que les boles van ser repartides\n" +
                "pel mon de manera aleatòria, una d’elles va anar a parar a la zona on\n" +
                "actualment viu el seu amic Satanàs Cor Petit i que probablement ell la\n" +
                "tinga en el seu poder. Van marxar doncs cap al número " + NEGRE + numeroCasaSatan + NORMAL + " de la\n" +
                "Ciutat Meravella, que és on ell viu.\n" +
                "Després d’un llarg camí, hem arribat a la casa de Satanàs, i en\n" +
                "efecte, ell té una de les boles. Però no vol donar-nos-la gratuïtament,\n" +
                "ja que li té molta estima. Ens proposa la següent lluita matemática:\n");

        System.out.println(SATANAS);
        System.out.println(ROIG + "Satanàs Cor Petit" + NORMAL + ": Sabríeu dir-me quin és el sumatori entre el\n" +
                "número de la vostra casa i el número la meua? Si l’endevineu, vos\n" +
                "donaré la bola i m’uniré al vostre equip");

        for (int i = numCasaGoku; i <= numeroCasaSatan; i++) {
            sumatori = sumatori + i;
        }

        System.out.println(sumatori);//BORRAR

        do {
            System.out.println("\n" + "El sumatori de " + NEGRE + numCasaGoku + NORMAL + " y " + NEGRE + numeroCasaSatan + NORMAL + " es?");
            if (!teclat.hasNextInt()) {
                System.out.print("\n" + "Error! El tipus de dades introduït és incorrecte");
                return;
            }

            endevinarAleatoriNivell1 = teclat.nextInt();
            if (endevinarAleatoriNivell1 <= 0){
                System.out.println("Número incorrecte. Introduïx-lo de nou");
            }
        }while (endevinarAleatoriNivell1 < 0);

        if (endevinarAleatoriNivell1 == sumatori){
            System.out.println("Has encertat, el sumatori des d’ambdós números "
                    + numCasaGoku + " y " + NEGRE + numeroCasaSatan + NORMAL + " es " + sumatori + ". Pases al nivell 2");
        }else{
            System.out.println(pedre);
            return;
        }

        //NIVELL 2
        int bolaB1 = (int) (Math.random () * 3 + 1);
        int bolaB2 = (int) (Math.random() * (7 - 4 + 1) + 4);
        System.out.println("\n" + BLAU +
                "███╗░░██╗██╗██╗░░░██╗███████╗██╗░░░░░██╗░░░░░  ██████╗░\n" +
                "████╗░██║██║██║░░░██║██╔════╝██║░░░░░██║░░░░░  ╚════██╗\n" +
                "██╔██╗██║██║╚██╗░██╔╝█████╗░░██║░░░░░██║░░░░░  ░░███╔═╝\n" +
                "██║╚████║██║░╚████╔╝░██╔══╝░░██║░░░░░██║░░░░░  ██╔══╝░░\n" +
                "██║░╚███║██║░░╚██╔╝░░███████╗███████╗███████╗  ███████╗\n" +
                "╚═╝░░╚══╝╚═╝░░░╚═╝░░░╚══════╝╚══════╝╚══════╝  ╚══════╝\n" + NORMAL);

        System.out.println(SATANAS);

        System.out.println(ROIG + "Satanàs Cor Petit:" + NORMAL + " Sou uns cracks de les matemàtiques! Pensava\n" +
                "que només sabíeu lluitar. Ací teniu la bola de " + NEGRE + bolaB1 + NORMAL + " estelles. Per cert,\n" +
                "tinc el número de telèfon de Ten Shin Han, qui em va enviar un\n" +
                "WhatsApp la setmana passada per contar-me que havia trobat la bola\n" +
                "de " + bolaB2 + " esteles en el Desert de l’Oblit. Anem-hi!\n");
        System.out.println("Només arribar, trobaren a Ten Shin Han el qual no tenia el seu millor\n" +
                "dia, i no els van rebre amb bona cara. Estava molt cabrejat perquè\n" +
                "estava intentant resoldre un enigma matemàtic i no veia forma de\n" +
                "fer-ho.\n");
        System.out.println(SON_GOHAN);
        System.out.println(GROC + "Son Gohan:" + NORMAL + " Hola Ten Shin Han, necessitem que ens dones la teua\n" +
                "bola de drac.\n");
        System.out.println(TEN);
        System.out.println(BLAU + "Ten Shin Han:" + NORMAL + " Mireu, porte així com 3 hores per a saber quin és el\n" +
                "productori entre " + NEGRE + bolaB1 + NORMAL +  " i " + NEGRE + bolaB2 + NORMAL + ". La veritat que les matemàtiques no són lo\n" +
                "meu. Si m’ajudeu vos done la bola, a més, m’està criant pols a casa.\n");

        int respostaNivell2;

        int resultatNivell2 = 1;
        for (int i = bolaB1; i <= bolaB2 ; i++) {
            resultatNivell2 *= i;
        }

        System.out.println(resultatNivell2);//BORRAR

        do {
            System.out.println("El productori de " + NEGRE + bolaB1 + NORMAL + " y " + NEGRE + bolaB2 + NORMAL + " es?" );
            if (!teclat.hasNextInt()) {
                System.out.print("\nError! El tipus de dades introduït és incorrecte");
                return;
            }
            respostaNivell2 = teclat.nextInt();
            if (respostaNivell2 <= 0) {
                System.out.println("Número incorrecte. Introduïx-lo de nou");
            }
        } while (respostaNivell2 <= 0);

        if (respostaNivell2 == resultatNivell2){
            System.out.println("Has encertat, el resultat del productori de " + NEGRE
                    + bolaB1 + NORMAL + " y " + NEGRE + bolaB2 + NORMAL + " es " + NEGRE + resultatNivell2 + NORMAL + ". Pases al nivell 3");
        }else {
            System.out.println(pedre);
            return;
        }

        //NIVELL 3

        int bolaB3 = (int) (Math.random() * (7 -4 + 1) + (4));
        int factorialNivell3 = 1;
        System.out.println("\n" + CIAN +
                "███╗░░██╗██╗██╗░░░██╗███████╗██╗░░░░░██╗░░░░░  ██████╗░\n" +
                "████╗░██║██║██║░░░██║██╔════╝██║░░░░░██║░░░░░  ╚════██╗\n" +
                "██╔██╗██║██║╚██╗░██╔╝█████╗░░██║░░░░░██║░░░░░  ░█████╔╝\n" +
                "██║╚████║██║░╚████╔╝░██╔══╝░░██║░░░░░██║░░░░░  ░╚═══██╗\n" +
                "██║░╚███║██║░░╚██╔╝░░███████╗███████╗███████╗  ██████╔╝\n" +
                "╚═╝░░╚══╝╚═╝░░░╚═╝░░░╚══════╝╚══════╝╚══════╝  ╚═════╝░\n" + NORMAL);
        System.out.println(TEN);

        System.out.println(BLAU + "Ten Shin Han" + NORMAL + ": Wow! Doncs no se m’hauria ocorregut mai. Per cert,\n" +
                "vaig saber que el nostre enemic Boo va trobar una bola de drac en la\n" +
                "seua mudança a “Muntanya Perduda”. Vos guiaré a la cova de la\n" +
                "muntanya on viu. No és lluny d’ací");

        System.out.println("\nBoo es trobava descansant a la cova. Ja que va tindre molts\n" +
                "problemes en els seus anteriors enfrontaments amb Goku aquest no\n" +
                "tenia intenció de lluitar més amb ell, però al veure’l què anava a per la\n" +
                "seua estimada bola de drac de " + NEGRE + bolaB3 + NORMAL + " estelles, no va reaccionar amb\n" +
                "bones maneres.");

        System.out.println(BOO);
        System.out.println(BLAU + "Boo" + NORMAL + ": Què voleu? La meua bola de drac?");

        System.out.println(GOKU);
        System.out.println(CIAN + "Son Goku" + NORMAL + ": Necessitem reunir-les totes abans que Freezer, el món\n" +
                "corre un gran perill! Sabem que tú ja no vols fer mal al planeta. T’ho\n" +
                "demanem per favor, pel bé de tots.\n");

        System.out.println(BOO);
        System.out.println(BLAU +"Boo" + NORMAL + ": Però és meua! La vaig trobar jo! Encara que pensant-ho millor,\n" +
                "només vos la donaré si em dieu la resposta correcta a la solució de\n" +
                "quin és el factorial de " + NEGRE + bolaB3 + NORMAL + ".");

        do {
            bolaB3 = (int) (Math.random() * (7 -4 + 1) + (4));
        }while (bolaB2 == bolaB3);

        for (int i = bolaB3; i > 0; i--) {
            factorialNivell3 = factorialNivell3 * i;
        }

        System.out.println(factorialNivell3);//BORRAR

        int endivinarBolab3;
        do {
            System.out.println("\n" + "El factorial de " + NEGRE + bolaB3 + NORMAL + " es?");
            if (!teclat.hasNextInt()){
                System.out.println("\n" + "Error! El tipus de dades introduït és incorrecte");
                return;
            }
            endivinarBolab3 = teclat.nextInt();
            if (endivinarBolab3 <= 0){
                System.out.println("Número incorrecte. Introduïx-lo de nou");
            }
        }while (endivinarBolab3 < 0);

        if (endivinarBolab3 == factorialNivell3){
            System.out.println("Has encertat, el resultat factorial de " + NEGRE + bolaB3 + NORMAL + " es " + NEGRE + resultatNivell2 + NORMAL + ". Pases al nivell 3");
        }else {
            System.out.println(pedre);
            return;
        }

        //NIVELL 4

        int aleatori1Nivell4 = (int) (Math.random() * (100 - 10 + 1) + 10);
        System.out.println("\n" + GROC +
                "███╗░░██╗██╗██╗░░░██╗███████╗██╗░░░░░██╗░░░░░  ░░██╗██╗\n" +
                "████╗░██║██║██║░░░██║██╔════╝██║░░░░░██║░░░░░  ░██╔╝██║\n" +
                "██╔██╗██║██║╚██╗░██╔╝█████╗░░██║░░░░░██║░░░░░  ██╔╝░██║\n" +
                "██║╚████║██║░╚████╔╝░██╔══╝░░██║░░░░░██║░░░░░  ███████║\n" +
                "██║░╚███║██║░░╚██╔╝░░███████╗███████╗███████╗  ╚════██║\n" +
                "╚═╝░░╚══╝╚═╝░░░╚═╝░░░╚══════╝╚══════╝╚══════╝  ░░░░░╚═╝\n" + NORMAL);

        System.out.println(BOO);
        System.out.println(BLAU + "Boo:" + NORMAL + " Vaja, vos ho he posat realment fácil. Ací teniu la bola. Ara bé,\n" +
                "vos adelante que encara teniu un os dur de rosegar. Cèl·lula també\n" +
                "les buscava i vaig escoltar en la tele que ja tenia unes quantes\n" +
                "recollides. Si no recorde mal, el vaig sentir a les notícies del canal\n" +
                "número " + NEGRE + aleatori1Nivell4 + NORMAL + " de la meua televisió.\n");
        System.out.println("Van sintonitzar el canal N i van confirmar que Cèl·lula es trobava en\n" +
                "“Ciutat Nova”. Ràpidament van anar a enfrontar-se amb ell i així\n" +
                "aconseguir les boles que tenia en el seu poder.\n");

        System.out.println(SON_GOHAN);
        System.out.println(GROC + "Son Gohan:" + NORMAL + " Hola Cèl·lula, no volem problemes amb tu. Per favor,\n" +
                "dona'ns les teues boles de drac i no et farem mal.");

        System.out.println(CELLULA);
        System.out.println(VERD + "Cèl·lula:" + NORMAL + " Jajaja. He entrenat des de l'última lluita i ara no podreu amb\n" +
                "mi i, per suposat, no podreu llevar-me les boles del drac que tinc\n" +
                "guardades a aquesta caixa. Juguem a un joc, la caixa té un cadenat\n" +
                "amb només la possibilitat d'introduir un 1 o un 2. Si seleccioneu el\n" +
                "número correcte, el cadenat obrirà i vos quedareu les boles, en cas\n" +
                "contrari, em donareu les vostres.. Vos done una pista, haureu\n" +
                "d’introduïr un 1 si " + NEGRE + aleatori1Nivell4 + NORMAL + " és número primer i un 2 si no ho és. Juguem?\n");

        int divisorNivell4 = 2;

        boolean isPrimo = true;
        do {
            if (aleatori1Nivell4 % divisorNivell4 == 0){
                isPrimo = false;
            }
            divisorNivell4++;
        } while (isPrimo && divisorNivell4 < aleatori1Nivell4);

        System.out.println(isPrimo);//BORRAR

        int respuestaNivell4;
        do {
            System.out.println("Introduix nombre..." );
            if (!teclat.hasNextInt()) {
                System.out.print("\nError! El tipus de dades introduït és incorrecte");
                return;
            }
            respuestaNivell4 = teclat.nextInt();
            if (respuestaNivell4 <= 0 || respuestaNivell4 > 2) {
                System.out.println("Número incorrecte. Introduïx-lo de nou");
            }
        } while (respuestaNivell4 <= 0 || respuestaNivell4 > 2);

        if (respuestaNivell4 == 1 && isPrimo){
            System.out.println("Has encertat, pases al nivell 5");
        }
        else if (respuestaNivell4 == 2 && !isPrimo){
            System.out.println("Has ensertat, pases al nivell 5");
        }else {
            System.out.println(pedre);
            return;
        }

        int bolaB4;
        int bolaB5;
        int bolaB6;
        int bolaB7;
        do {
            bolaB4 = (int) (Math.random() * (7 - 4 + 1) + 4);
        }while (bolaB4 == bolaB3 || bolaB4 == bolaB2);
        do {
            bolaB5 = (int) (Math.random() * (7 - 4 + 1) + 4);
        }while (bolaB5 == bolaB3 || bolaB5 == bolaB2 || bolaB5 == bolaB4);
        do {
            bolaB6 = (int) (Math.random () * 3 + 1);
        }while (bolaB6 == bolaB1);
        do {
            bolaB7 = (int) (Math.random () * 3 + 1);
        }while (bolaB7 == bolaB6 || bolaB7 == bolaB1);

        System.out.println(bolaB1);
        System.out.println(bolaB2);
        System.out.println(bolaB3);
        System.out.println(bolaB4);
        System.out.println(bolaB5);
        System.out.println(bolaB6);
        System.out.println(bolaB7);


        System.out.println(ROIG + "\n" +
                "███╗░░██╗██╗██╗░░░██╗███████╗██╗░░░░░██╗░░░░░  ███████╗\n" +
                "████╗░██║██║██║░░░██║██╔════╝██║░░░░░██║░░░░░  ██╔════╝\n" +
                "██╔██╗██║██║╚██╗░██╔╝█████╗░░██║░░░░░██║░░░░░  ██████╗░\n" +
                "██║╚████║██║░╚████╔╝░██╔══╝░░██║░░░░░██║░░░░░  ╚════██╗\n" +
                "██║░╚███║██║░░╚██╔╝░░███████╗███████╗███████╗  ██████╔╝\n" +
                "╚═╝░░╚══╝╚═╝░░░╚═╝░░░╚══════╝╚══════╝╚══════╝  ╚═════╝░\n" +NORMAL);

        System.out.println(CELLULA);

        System.out.println(VERD + "Cèl·lula:" + NORMAL + " Maleïts sigueu! L’heu endevinat. Bé, ací teniu les meues\n" +
                "boles. Però tingueu clar que tornaré a intentar fer-me amb elles més\n" +
                "endavant.\n");

        System.out.println(GOKU);
        System.out.println(CIAN + "Son Goku:" + NORMAL + " Ara només ens queda anar al planeta de Freezer a llevar\n" +
                "li les boles que resten. Esperem que surta tot bé.\n");
        System.out.println("Van volar al Planeta Infernal on Freezer esperava al seus\n" +
                "contrincants per a la lluita final.\n");

        System.out.println(GOKU);
        System.out.println(CIAN + "Son Goku:" + NORMAL + " Hola Freezer, sabem què trames. No ho permetrem.\n" +
                "Dóna'ns les boles de drac " + bolaB4 + ", " + bolaB5 + ", " + bolaB6 + ", "
                + bolaB7 + " què sabem que ja tens.\n");

        System.out.println(FREEZER);
        System.out.println(NEGRE +"Freezer:" + NORMAL + " De cap manera! Doneu-me vosaltres les vostres. Però\n" +
                "mireu, com no vull lluitar perquè ja tinc una edat, vos done la\n" +
                "possibilitat de resoldre aquest conflicte amb una lluita matemàtica. Si\n" +
                "sabeu dir-me quin és el mínim comú múltiple de " + bolaB4 + ", " + bolaB5 + ", "
                + bolaB6 + ", " + bolaB7 + " tot\n" +
                "això haurà terminat.\n");

        int respuestaNivell5;
        do {
            System.out.println("Mínim comú múltiple de " + bolaB4 + ", " + bolaB5 + ", "
                    + bolaB6 + ", " + bolaB7 + " es?" );
            if (!teclat.hasNextInt()) {
                System.out.print("\nError! El tipus de dades introduït és incorrecte");
                return;
            }
            respuestaNivell5 = teclat.nextInt();
            if (respuestaNivell5 <= 0) {
                System.out.println("Número incorrecte. Introduïx-lo de nou");
            }
        } while (respuestaNivell5 <= 0);

        int minComunMulti = 1;
        int divisorNivell5 = 2;
        while (divisorNivell5 <= bolaB4 || divisorNivell5 <= bolaB5 || divisorNivell5 <= bolaB6 || divisorNivell5 <= bolaB7){
            if (bolaB4 % divisorNivell5 == 0 || bolaB5 % divisorNivell5 ==0 || bolaB6 % divisorNivell5 == 0 || bolaB7 % divisorNivell5 == 0){
                minComunMulti *= divisorNivell5;
            }
            if (bolaB4 % divisorNivell5 == 0) {
                bolaB4 /= divisorNivell5;
            }
            if (bolaB5 % divisorNivell5 == 0) {
                bolaB5 /= divisorNivell5;
            }
            if (bolaB6 % divisorNivell5 == 0){
                bolaB6 /= divisorNivell5;
            }
            if (bolaB7 % divisorNivell5 == 0){
                bolaB7 /= divisorNivell5;
            }
            else {
                divisorNivell5++;
            }
        }
        if (respuestaNivell5 == minComunMulti){
            System.out.println("Has encertat el resultat del mínim comú múltlípe, que es " + minComunMulti+ "." );
        }else {
            System.out.println(pedre);
        }

    }

}

