public class CarDemo {
    public static void main(String[] args) {
        double fuelPrice = 0;                 //Цена топлива
        double sumOfTrip = 0;                                               //Определяет сумму всей поездки
        final int startPoint = 0;                                           //Начальная позиция
        final int krOz = 178;                                               //Расстояние от Одессы до Кривого Озера
        final int zhashkow = 153;                                           //Расстояние от Кривого Озера до Жашкова
        final int kiyv = 148;                                               //Расстояние от Жашкова до Киева

        Car zaporozhec = new Car(60, 30, 8); //создаёт экземпляр класса Car под названием zaporozhec

        if (args.length != 0) {
            fuelPrice = Integer.parseInt(args[0]);
        }

        System.out.println("Начало поездки. Заправка в Одессе");
        zaporozhec.getFuelBalanceAfterRide(startPoint);
        sumOfTrip += zaporozhec.Refuel(fuelPrice);

        System.out.println();

        System.out.println("Первая остановка - Кривое Озеро.");
        zaporozhec.getFuelBalanceAfterRide(krOz);
        sumOfTrip += zaporozhec.Refuel(fuelPrice);

        System.out.println();

        System.out.println("Вторая остановка - Жашков.");
        zaporozhec.getFuelBalanceAfterRide(zhashkow);
        sumOfTrip += zaporozhec.Refuel(fuelPrice);

        System.out.println();

        System.out.println("Пункт прибытия - Киев.");
        zaporozhec.getFuelBalanceAfterRide(kiyv);

        System.out.println("Расходы на топливо - " + sumOfTrip + " у.е.");
    }
}
