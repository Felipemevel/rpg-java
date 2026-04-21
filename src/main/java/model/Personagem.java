package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Personagem {
    //TODO REFATORAR E ADICIONAR A vidaMaxima (ISSUE: #1)
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    public void atacar(Personagem alvo) {
        int dano = this.getAtaque() - alvo.getDefesa();
        if (dano < 0) {
            dano = 0;
        }
        alvo.receberDano(dano);
    }

    public boolean isVivo() {
        return this.vida > 0;
    }

    public void receberDano(int dano) {
        this.vida -= dano;
        if (this.vida < 0) {
            this.vida = 0;
        }
    }

    public void defender() {
        this.defesa += 5;
    }

    public boolean fugir() {
        Random dado = new Random();
        int chance = dado.nextInt(100) + 1;


        return chance <= 50;
    }

}
