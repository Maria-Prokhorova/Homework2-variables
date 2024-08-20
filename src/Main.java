public class Main {
    public static void main(String[] args) {

        //задача 1
        System.out.println();
        System.out.println("Результат выполнения задачи 1:");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Значение dog = " + dog);
        System.out.println("Значение cat = " + cat);
        System.out.println("Значение paper = " + paper);

        //задача 2
        System.out.println();
        System.out.println("Результат выполнения задачи 2:");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Значение dog = " + dog);
        System.out.println("Значение cat = " + cat);
        System.out.println("Значение paper = " + paper);

        //задача 3
        System.out.println();
        System.out.println("Результат выполнения задачи 3:");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Значение dog = " + dog);
        System.out.println("Значение cat = " + cat);
        System.out.println("Значение paper = " + paper);

        //задача 4
        System.out.println();
        System.out.println("Результат выполнения задачи 4:");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);

        //задача 5
        System.out.println();
        System.out.println("Результат выполнения задачи 5:");
        var frog = 3.5;
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);

        //задача 6
        System.out.println();
        System.out.println("Результат выполнения задачи 6:");
        var weightOneBoxer = 78.2;
        var weightTwoBoxer = 82.7;
        var totalMass = weightOneBoxer + weightTwoBoxer;
        System.out.println("Общая масса двух боксеров = " + totalMass + " кг.");
        var differenceMass = weightOneBoxer - weightTwoBoxer;
        System.out.println("Разница между массами боксеров = " + differenceMass + " кг.");

        //задача 7
        System.out.println();
        System.out.println("Результат выполнения задачи 7:");
        var differenceMass1 = weightTwoBoxer % weightOneBoxer;
        System.out.println("Остаток от деления между весами = " + differenceMass1);

        //задача 8
        System.out.println();
        System.out.println("Результат выполнения задачи 8:");
        var hoursWork = 640;
        var numberHoursOnePeople = 8;
        var numberPeople = hoursWork/numberHoursOnePeople;
        System.out.println("Всего работников в компании - " + numberPeople + " человек.");
        numberPeople = numberPeople + 94;
        hoursWork = numberPeople * numberHoursOnePeople;
        System.out.println("Если в компании работает " + numberPeople + " человек, то всего " + hoursWork + " часов работы может быть поделено между сотрудниками.");

    }
}