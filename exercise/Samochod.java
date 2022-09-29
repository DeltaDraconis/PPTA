package exercise;

public class Samochod {


        public String nazwa;
        public int predkosc;

    void wypiszInformacjeOSamochodzie(){
        System.out.println( nazwa + " " + predkosc);
        };
    void przyspieszO5kmh(){predkosc = predkosc + 5;
        System.out.println(predkosc);};

    void zwolnijO5kmh(){predkosc = predkosc - 5;
        System.out.println(predkosc);};

}
