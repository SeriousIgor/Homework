public class Car {
    //fields
    double fuelVolume;
    double fuelBalance;
    double fuelConsumption;
    double fuelToRefuel;
    double sum;
    //constructor
    public Car(double volume, double balance, double consumption){
        fuelVolume = volume;
        fuelBalance = balance;
        fuelConsumption = consumption;
    }
    //methods
    void getFuelBalance(){                        //Вывод кол-во топлива в баке
        System.out.println("В баке " + fuelBalance + " литров");
    }
    public double Refuel(double price){             //заполняет бак, возвращает цену заправки
        fuelBalance += fuelToRefuel;
        sum = fuelToRefuel * price;
        System.out.println("Заправляем бак\nВж-ж-ж-ж");
        getFuelBalance();
        return sum;
    }
    public void getFuelBalanceAfterRide(int km){    //Выводит кол-во топлива в баке после N километров
        fuelBalance -= (fuelConsumption * km)/100;
        getFuelBalance();
        howMuchFuel();
    }
    public void howMuchFuel(){                      //Определяет, сколько топлива нужно до заправить
        fuelToRefuel = fuelVolume - fuelBalance;
        System.out.print("Нужно дозаправить ");
        System.out.format("%.2f",fuelToRefuel);
        System.out.println(" литров.");
    }

}
