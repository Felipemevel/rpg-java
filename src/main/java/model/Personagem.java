package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Personagem {
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

}
