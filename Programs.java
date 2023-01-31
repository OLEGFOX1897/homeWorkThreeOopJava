import java.util.Iterator;

public class Programs {
    public static void main(String[] args) {

        ModerateWind objMW=new ModerateWind("Умеренный ветер","Волгоград",
                                            5,"Дождь");

        PowerWind objPW=new PowerWind("Сильный ветер","Ростов", 10,
                                            "Снег");

        Tornado objT=new Tornado("Торнадо","Казань",20,"Нет");
        CityForecast objCityForecast =new CityForecast();

        System.out.println("----------------------------");
        Iterator<String> specifications;
        specifications=objMW;
        while (specifications.hasNext()){
            System.out.println(specifications.next());}

        objCityForecast.weatherForecast(objMW.getSpeedWind());

        System.out.println("----------------------------");
        objPW.showSpecificationWind("Северо-Запад");
        objCityForecast.weatherForecast(objPW.getSpeedWind());

        System.out.println("----------------------------");
        objT.showSpecificationWind("Юго-Восток");
        objCityForecast.weatherForecast(objT.getSpeedWind());

        Wind.countObj();

    }
}
