

public class City implements WeatherForecast {

  

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
