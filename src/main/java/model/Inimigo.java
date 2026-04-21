package model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Inimigo extends Personagem{
    private int xpFornecido;

    public Inimigo(String nome, int vida, int ataque, int defesa, int xpFornecido){
        super(nome, vida, ataque, defesa); // ta chamando os atributos da classe mãe para o construtor
        this.xpFornecido = xpFornecido;
    }

    public void realizarTurno(Personagem heroi) {
        /* TODO
        ADICIONAR UM COMPORTAMENTO ALEATORIO TIPO:
           IMPORTAR A RANDOM E SORTEAR UM DADO DE 1 A 100
           SE FOR DE 1 A 60 ATACA
           SE FOR DE 61 A 95 ELE DEFENDE MAS ELE SO DEFENDE SE A VIDA DO HEROI FOR MAIOR QUE A DELE
           SE FOR DE 95 A 100 ELE FOGE MAS ELE SO FOGE SE A VIDA DELE FOR MENOR QUE A DO HEROI
         */
    }

}
