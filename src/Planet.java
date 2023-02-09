public enum Planet {
    URANUS(30687),
    VENUS(225),
    EARTH(365),
    MARS(687),
    JUPITER(4333),
    SATURN(10759),
    PLUTO(90530),
    NEPTUNE(60200),
    MERCURY(88);
    private int dayOfYear;

    Planet(int dayOfYear) {
        this.dayOfYear = dayOfYear;
    }
    public static void minDay(Planet []planets){
        int san=Planet.PLUTO.dayOfYear;
        for (int i = 0; i < planets.length; i++) {
            if(san>Planet.values()[i].dayOfYear){
                san=Math.min(san, planets[i].dayOfYear);
            }
        }
        System.out.println(san);
    }
    public static void maxDay(Planet[] planets){
        int san=0;
        for (int i = 0; i < planets.length; i++) {
            if(san<Planet.values()[i].dayOfYear){
                san=Math.max(san, planets[i].dayOfYear);
            }
        }
        System.out.println(san);
    }

    public int getDayOfYear() {
        return dayOfYear;
    }
}
