import java.util.SplittableRandom;

class Wind {
    private String nameWind;
    private double speedWind;
    private String precipitation;
    private String cityWind;

    public String getNameWind() {
        return nameWind;
    }

    public void setNameWind(String nameWind) {
        this.nameWind = nameWind;
    }

    public double getSpeedWind() {
        return speedWind;
    }

    public String getCityWind() {
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
    void showSpecificationWind (){
        System.out.println("Характеристики ветра: ");
        System.out.println("Название ветра"+getNameWind());
        System.out.println("Скорость ветра : "+getSpeedWind()+"км/ч");
        System.out.println("Осадки в потоке воздуха: "+getPrecipitation());
        System.out.println("Город: "+getCityWind());
    }


}
class PowerWind extends Wind {
    private String windDirection;

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public String getWindDirection() {
        return windDirection;
    }

    void showSpecificationWind (String nameWind, double speed, String cityWind,
                                String precipitation, String windDirection) {
        setNameWind(nameWind);
        setSpeedWind(speed);
        setCityWind(cityWind);
        setPrecipitation(precipitation);

        showSpecificationWind();

        setWindDirection(windDirection);
        System.out.println("Направление ветра: "+getWindDirection());
    }
}
class Tornado extends PowerWind{
    private double speedRotation;

    public void setSpeedRotation(int speedRotation) {
        this.speedRotation = speedRotation;
    }

    public double getSpeedRotation() {
        return speedRotation;
    }
    void showSpeedRotation(){
        System.out.println("Скорость вращения: "+ getSpeedRotation()+"м/с");
    }
}


class TestProgram {
    public static void main(String[] args) {
        Wind objW = new Wind();
        PowerWind objPW = new PowerWind();
        Tornado objT=new Tornado();
        objW.setCityWind("Ахтубинск");
        objW.setPrecipitation("Дождь со снегом");
        objW.setNameWind("Умеренный");
        objW.setSpeedWind(6);
        objW.showSpecificationWind();
        System.out.println("__________________________");
        objPW.showSpecificationWind("Ураган",15,"Москва","Нет","Северо-Запад");
        System.out.println("__________________________");
        objT.showSpecificationWind("Торнадо",50,"Лос-Анжелес","Нет","Север");
        objT.setSpeedRotation(20);
        objT.showSpeedRotation();
    }
}