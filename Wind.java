
public abstract class Wind {
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
        System.out.println("Название ветра: "+getNameWind());
        System.out.println("Скорость ветра : "+getSpeedWind()+"км/ч");
        System.out.println("Осадки в потоке воздуха: "+getPrecipitation());
        System.out.println("Город: "+getCityWind());
    }
    

}