import java.util.Iterator;

public abstract class Wind implements Iterator<String> {
    private String nameWind;
    private double speedWind;
    private String precipitation;
    private String cityWind;
    static int countObj=0; // для подсчета количества объетов

    int index;

    public String getNameWind() {
        /**
         * Метод получения названия ветра
         */
        return nameWind;
    }

    public void setNameWind(String nameWind) {
        this.nameWind = nameWind;
    }

    public double getSpeedWind() {
        /**
         * Метод получения скорости ветра
         */
        return speedWind;
    }


    public String getCityWind() {
        /*
        * Метод получения названия города
        */
        return cityWind;
    }

    public String getPrecipitation() {
        return precipitation;
    }

    public void setCityWind(String cityWind) {
        this.cityWind = cityWind;
    }

    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
    }

    public void setSpeedWind(double speedWind) {
        this.speedWind = speedWind;
    }

    protected Wind (String nameWind, String cityWind, double speedWind, String precipitation){
        /**
         * Инициализация объекта Wind и подсчет созданных объектов
         */

        setSpeedWind(speedWind);
        setNameWind(nameWind);
        setCityWind(cityWind);
        setPrecipitation(precipitation);
        this.index=0;
        countObj++;

    }

    static void countObj() {
        System.out.println("На базе абстрактного класса Wind создано: "+countObj+" объета(ов)");
    }

    @Override
    public boolean hasNext() {
        return index++<3;
    }

    @Override
    public String next() {
        switch (index){
            case 1:
                return String.format("Название ветра: %s", getNameWind());
            case 2:
                return String.format("Город: %s", getCityWind());
            case 3:
                return String.format("Скорость ветра: %.2f", getSpeedWind());
            default:
                return String.format("Скорость ветра: %s", getPrecipitation());
        }

    }
}