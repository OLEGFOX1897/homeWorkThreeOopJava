class PowerWind extends Wind {
    protected String windDirection;

    public PowerWind(String nameWind, String cityWind, double speedWind, String precipitation) {
        super(nameWind, cityWind, speedWind, precipitation);
    }

    protected void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    protected String getWindDirection() {
        return windDirection;
    }

    protected void showSpecificationWind (String windDirection){
        setWindDirection(windDirection);
        System.out.println("Название ветра: "+getNameWind());
        System.out.println("Скорость ветра : "+getSpeedWind()+"км/ч");
        System.out.println("Осадки в потоке воздуха: "+getPrecipitation());
        System.out.println("Город: "+getCityWind());
        System.out.println("Направление ветра: "+getWindDirection());




    }
}
