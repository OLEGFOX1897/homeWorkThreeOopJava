class PowerWind extends Wind {
    private String windDirection;

    protected void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    protected String getWindDirection() {
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
