package teste.maratonajava.javacore.Aintroducaoclasses.teste;

import teste.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {

    static void main() {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        carro1.nome = "Supra";
        carro1.modelo = "MK4";
        carro1.ano = 1994;
        carro2.nome = "Skyline GTR";
        carro2.modelo = "R34";
        carro2.ano = 2002;
        carro1 = carro2;

        System.out.println("Carro 1");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\nCarro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);


    }

}
