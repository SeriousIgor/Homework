public class CarDemo {
    public static void main(String[] args) {
        double fuelPrice = Integer.parseInt(args[0]);                 //Цена топлива
        double sumOfTrip = 0;                                         //Определяет сумму всей поездки
        int krOz = 178;                                               //Расстояние от Одессы до Кривого Озера
        int zhashkow = 153;                                           //Расстояние от Кривого Озера до Жашкова
        int kiyv = 148;                                               //Расстояние от Жашкова до Киева

        Car zaporozhec = new Car(60, 30, 8); //создаёт экземпляр класса Car под названием zaporozhec

        System.out.println("Начало поездки. Заправка в Одессе");
        zaporozhec.GetFuelBalanceAfterRide(0);
        sumOfTrip += zaporozhec.Refuel(fuelPrice);

        System.out.println();

        System.out.println("Первая остановка - Кривое Озеро.");
        zaporozhec.GetFuelBalanceAfterRide(krOz);
        sumOfTrip += zaporozhec.Refuel(fuelPrice);

        System.out.println();

        System.out.println("Вторая остановка - Жашков.");
        zaporozhec.GetFuelBalanceAfterRide(zhashkow);
        sumOfTrip += zaporozhec.Refuel(fuelPrice);

        System.out.println();

        System.out.println("Пункт прибытия - Киев.");
        zaporozhec.GetFuelBalanceAfterRide(kiyv);

        System.out.println("Расходы на топливо - " + sumOfTrip + " у.е.");
    }
}
