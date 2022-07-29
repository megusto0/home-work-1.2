public class Main {
    public static void main(String[] args) {
        // Задание 1
        short grape = 7;
        byte melon = 2;
        int apple = 500;
        long watermelon = 90L;
        double appleWeight = 0.34;
        float watermelonWeight = 4.56f;
        boolean isEnough = apple > 300;
        char t = 37;

        // Задание 2
        double firstWeight = 78.2;
        double secondWeight = 82.7;
        System.out.println("Общий вес двух боксеров = " + (firstWeight + secondWeight) + "кг.");
        System.out.println("Разница между вемаи борцов = " + Math.abs(firstWeight - secondWeight) + "кг.");

        // Задание 3
        int banana = 5;
        int milk = 200;
        int iceCreamBrick = 2;
        int egg = 4;
        int gramsWeight = banana * 80 + iceCreamBrick * 100 + milk / 100 * 105 + egg * 70;
        double kiloWeight = gramsWeight / 1000.0;
        System.out.println("Вес завтрака = " + gramsWeight + " грамм / " + kiloWeight + " килограмм.");

        //Задание 4
        int goal = 7;
        double program1 = 0.25;
        double program2 = 0.5;
        int program1Result = (int) (goal / program1);
        int program2Result = (int) (goal / program2);
        System.out.println("Теряя 250 грамм в день на похудение уйдет " + program1Result + " дней." + "\nТеряя 500 грамм в день на похудение уйдет " + program2Result + " дней.");

        //Задание 5
        int mashaIncome = 67760;
        int denisIncome = 83690;
        int kristinaIncome = 76230;
        double mashaNewIncome = mashaIncome * 1.1;
        double denisNewIncome = denisIncome * 1.1;
        double kristinaNewIncome = kristinaIncome * 1.1;
        System.out.println("Маша теперь получает " + (int)mashaNewIncome + " рублей. Годовой доход вырос на " + (int)(mashaNewIncome - mashaIncome) + " рублей.");
        System.out.println("Денис теперь получает " + (int)denisNewIncome + " рублей. Годовой доход вырос на " + (int)(denisNewIncome - denisIncome) + " рублей.");
        System.out.println("Кристина теперь получает " + (int)kristinaNewIncome + " рублей. Годовой доход вырос на " + (int)(kristinaNewIncome - kristinaIncome) + " рублей.");

    }
}