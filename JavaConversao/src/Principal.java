public class Principal {

    public static void main(String[] args) {
        ConversaoTemperatura ct = new ConversaoTemperatura();
        float temperaturaF = ct.converteCelciusParaFahrenheit(25);
        System.out.println("A temperatura em Fahrenheit é " + temperaturaF);

        float temperaturaK = ct.converteCelciusParaKelvin(25);
        System.out.println("A temperatura em Kelvin é " + temperaturaK);

    }
}
