
public class CityForecast implements I_WeatherForecast {
/**
 * Рекомендации для жителей города.
 */


    @Override
    public void weatherForecast(Double speedWind) {
        if (speedWind<=5) {
            System.out.println("Погода хорошая");
        }
        else if (speedWind>5 & speedWind<12) {
            System.out.println("Оставайтесь дома");
        }
        else if (speedWind>12) {
            System.out.println("Нужна эвакуация");
        }
    }

 
  
}
