# Практическая работа №3

Объекты и классы: абстрактные классы и интерфейсы, пакеты.

## Часть 1

Пакет `vehicles` + пакет `app`:

- Vehicle.java — абстрактный класс, поля model, license, color, year, ownerName, insuranceNumber, engineType; геттеры/сеттеры, toString(), абстрактный метод vehicleType()
- Car.java — наследует Vehicle, в конструкторе engineType = "Combustion", vehicleType() возвращает "Car"
- ElectricVehicle.java — интерфейс: getBatteryCapacity(), setBatteryCapacity()
- ElectricCar.java — наследует Car, реализует ElectricVehicle, поле batteryCapacity, engineType = "Electric"
- TestCar.java (пакет app) — создаёт Car и ElectricCar, меняет год, имя владельца, страховой номер, читает ёмкость батареи, выводит toString()

## Часть 2

Пакет `bikeproject` с добавленными интерфейсами:

- BikeParts.java — константа MAKE = "Oracle Cycles", метод printDescription(); реализован в Bike
- MountainParts.java — константа TERRAIN = "off_road", getSuspension/setSuspension, getType/setType; реализован в MountainBike
- RoadParts.java — константа terrain = "track_racing", getTyreWidth/setTyreWidth, getPostHeight/setPostHeight. Сеттеры принимают строки, а RoadBike сохраняет размеры как int.
- BikeDriver.java — в конце main у bike1 высота подседельного штыря обновлена на 20 вместо 22, значения bike1 выведены повторно

### Ответы на вопросы README

1. **Примитивный тип для полей** — `int`: NumGears в Bike, frameSize в MountainBike, tyreWidth и postHeight в RoadBike.
2. **Конкатенация строк** — в методах printDescription(), например в Bike: `"\n" + MAKE + "\n" + "Руль: " + this.handleBars + ...`.
3. **Ссылки на созданные объекты** — bike1, bike2, bike3, bike4 (в BikeDriver).
4. **Конструкторы** — Bike: 2 (по умолчанию и с параметрами); RoadBike: 3 (по умолчанию, только postHeight, полный); MountainBike: 2 (по умолчанию и полный); BikeDriver: 0 объявленных, 1 неявный конструктор без параметров.
5. **Наследование** — суперкласс Bike; подклассы RoadBike и MountainBike.
6. **Значения стандартных велосипедов** (из конструкторов по умолчанию):

| Поле | Standard RoadBike | Standard MountainBike |
|---|---|---|
| make | Oracle Cycles | Oracle Cycles |
| handleBars | drop | Bull Horn |
| frame | racing | Hardtail |
| tyres | tread less | Maxxis |
| seatType | razor | dropper |
| NumGears | 19 | 27 |
| ещё | tyreWidth = 20, postHeight = 22 | suspension = RockShox XC32, type = Pro, frameSize = 19 |

[Конспект к защите](THEORY-AND-RESULTS.md)

Подписи в консоли переведены на русский. Названия и характеристики велосипедов сохранены из исходного проекта.

## Запуск

```fish
./run.sh
```

```fish
cd part\ 1 && javac -d out src/vehicles/*.java src/app/*.java && java -cp out app.TestCar
cd ../part\ 2 && javac -d out src/bikeproject/*.java && java -cp out bikeproject.BikeDriver
```
