public class Addition {
    public Addition(int[] random) {
            for (int i = 0; i < random.length; i++) {

                System.out.println( "№ "+ i +"  "+ random[i]);// распечатал весь массив чисел
            }
        System.out.println(" ");

        for (int i = 0; i < random.length; i++) {
            if (random[i] % 2 != 0 ) {
                random[i] += 1;
            }
            System.out.println( "№ "+ i +"  "+ random[i]);
        }



    }

    }



