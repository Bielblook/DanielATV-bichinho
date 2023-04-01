package model;

import java.util.Scanner;

public class Animais {

    private String nome;
    private String classe;
    private String familia;
    private int idade;
    private boolean estado;
    private int caloria;
    private int forca;

    public Animais() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o nome do animal: ");
        nome = sc.nextLine();
        System.out.print("Informe a classe do animal: ");
        classe = sc.nextLine();
        System.out.print("Informe a família do animal: ");
        familia = sc.nextLine();
        idade = 0;
        estado = true;
        caloria = 10;
        forca = 10;
        System.out.println("O animal se chama " + nome + " é da classe " + classe + " da família " + familia + ". O animal possui força de " + forca + ", caloria de " + caloria + " e idade de " + idade);
    }

    public void morrer() {
        forca = 0;
        estado = false;
        System.out.println("O animal morreu!");
    }

    public void comer() {
        if (estado && caloria < 100) {
            caloria += 10;
            forca -= 2;
            System.out.println("O animal comeu e agora sua força é de " + forca + " e suas calorias valem " + caloria);
        } else {
            System.out.println("O animal não pode comer agora!");
        }
    }

    public void correr() {
        if (estado && caloria > 0) {
            forca -= 5;
            caloria -= 5;
            System.out.println("O animal está correndo!! Agora sua força é de " + forca + " e suas calorias valem " + caloria);
        } else {
            System.out.println("O animal não pode correr agora!");
        }
    }

    public void dormir() {
        if (estado) {
            forca += 10;
            caloria -= 2;
            System.out.println("O animal está dormindo agora! Sua força aumentou para " + forca + " e suas calorias aumentaram para " + caloria);
        } else {
            System.out.println("O animal não pode dormir agora!");
        }
    }
}
