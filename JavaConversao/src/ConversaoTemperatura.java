public class ConversaoTemperatura {

    float converteCelciusParaKelvin(float tempCelcius){
        float tempKelvin = tempCelcius + 273;
        return tempKelvin;
    }

    float converteCelciusParaFahrenheit(float tempCelcius){
        float tempFahrenheit = 1.8f*tempCelcius + 32;
        return tempFahrenheit;
    }
}
