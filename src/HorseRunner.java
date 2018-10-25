public class HorseRunner {

        public static void main(String[] args)
        {
            Horses horse1 = new Mustang("Secretariat", 12000);
            Horses horse2 = new Mustang("Dusty Trail", 22000);
            Horses horse3 = new Mustang("Silver", 12000);

            Horses[] horses = new Horses[6];

            horses[1] = horse1;
            horses[3] = horse2;
            horses[5] = horse3;
            HorseBarn barn = newHorseBarn(horses);

            System.out.println(barn);
            System.out.println(" Dusty Trail is in space: " + barn.findHorseSpace("Dusty Trail"));

            barn.consolidate();

            System.out.println(barn);
            System.out.println(" Dusty Trail is now in space: " + barn.findHorseSpace("Dusty Trail"));


        }

    private static HorseBarn newHorseBarn(Horses[] horses) {
    }
}

