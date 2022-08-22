public class Main {
    public static void main(String[] args) {

        byte a = 100; // объявляем типы переменных
        short b = 10000;
        int c = 314124142;
        long d = -1111778914;
        float e = 0.2f;
        double f = 0.2;
        char g = 1;
        boolean t = true;

        double firstBoxer = 78.2; // задача с двумя боксёрами
        double secondBoxer = 82.7;
        var bothWeight = firstBoxer + secondBoxer;
        var differenceWeight = secondBoxer - firstBoxer;
        System.out.println("Вес обоих боксёров составляет: " + bothWeight + " кг!");
        System.out.println("Разница в весе составляет: " + differenceWeight + " кг!");

        var bananaWeight = 80; // задача с завтраком
        var milkWeight = 105;
        var iceCreamWeight = 100;
        var eggWeight = 70;
        float finalWeight = bananaWeight*5 + milkWeight*2 + iceCreamWeight*2 + eggWeight*4;
        float kgWeight = finalWeight / 1000;
        System.out.println("Общий вес завтрака составляет: " + kgWeight + " кг!");

        var weight = 7000; // необходимый вес сразу переведен в граммы
        var minWeightDay = 250;
        var maxWeightDay = 500;
        var dayMax = weight / maxWeightDay; // высчитываем максимальный сброс веса в день
        var dayMin = weight / minWeightDay; // высчитываем минимальный сброс веса в день
        System.out.println("Похудение на 7 кг займёт от " + dayMax + " до " + dayMin + " дней.");

        var mashaPay = 67760; // гении не ищут простых путей.
        var denisPay = 83690;
        var kristinaPay = 76230;
        var mashaPlusPay = mashaPay / 100 * 10;
        var denisPlusPay = denisPay / 100 * 10;
        var kristinaPlusPay = kristinaPay / 100 * 10;
        var newMashaPay = mashaPay + mashaPlusPay;
        var newDenisPay = denisPay + denisPlusPay;
        var newKristinaPay = kristinaPay + kristinaPlusPay;
        System.out.println("Маша теперь получает " + newMashaPay + " рублей. Годовой доход вырос на " + mashaPlusPay + " рублей.");
        System.out.println("Денис теперь получает " + newDenisPay + " рублей. Годовой доход вырос на " + denisPlusPay + " рублей.");
        System.out.println("Кристина теперь получает " + newKristinaPay + " рублей. Годовой доход вырос на " + kristinaPlusPay + " рублей.");








    }
}