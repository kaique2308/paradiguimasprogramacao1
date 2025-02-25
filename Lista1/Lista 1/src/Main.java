public class Main {
    public static void main(String[] args) {
        //criando objetos da classe
        //instaciar a classe, criado objetos
        Carro obj1 = new Carro(2020, 0, "Ferrari", "Spider");
        obj1.exibirDetalhes();
        obj1.acelerar(100);
        obj1.exibirDetalhes();

        Carro obj2 = new Carro(1979, 50, "Dogde Charger", "1979"); //chama o construtor

        obj2.exibirDetalhes();
        obj2.acelerar(30);
        obj2.frear(100);
        obj2.exibirDetalhes();

        Carro obj3 = new Carro(); //chama o construtor
        obj3.exibirDetalhes();
    }
}