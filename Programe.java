public class Programe {
    public static void main(String[] args) {
        ModerateWind objMW=new ModerateWind();
        Tornado objT=new Tornado();
        City objCity=new City();
        PowerWind objPW=new PowerWind();
        objT.setSpeedRotation(15);
        objT.showSpecificationWind("Торнадо", 15, "LosAngeles", "Снег", "Западный");
        objCity.weatherForecast(objT.getSpeedWind());
        System.out.println("-----------------");
        objMW.setCityWind("Moscow");
        objMW.setSpeedWind(5);
        objMW.setNameWind("Умеренный ветер");
        objMW.setPrecipitation("Дождь");
        objMW.showSpecificationWind();
        objCity.weatherForecast(objMW.getSpeedWind());
        System.out.println("-----------------");
        objPW.showSpecificationWind("Cильный ветер ", 10, "Екатеринбург", "Нет", "Восточный");
        objCity.weatherForecast(objPW.getSpeedWind());
        
    }
}
