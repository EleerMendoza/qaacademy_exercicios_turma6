package tests;

import exercicios_easy.Exec2;
import exercicios_easy.Exec_3;
import exercicios_easy.Exec_4;
import exercicios_easy.Exec_5;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exec2EasyTest {
    @Test
    public void testenome() {
        Exec_3 exec3 = new Exec_3();
        String s = "nome" + "sobreNome";
        assertEquals(" Eleer Mendoza", " Eleer Mendoza");
    }

    @Test
    public void testeDeJuçaoPalavra() {
        Exec2 exec2 = new Exec2();
        exec2.exibirPalavra("BolsoLula");
        assertEquals(" A palabra é: BolsoLula", exec2.exibirPalavra("BolsoLula"));

    }


    @Test
    public void testeDobro() {
        Exec_4 exec_4 = new Exec_4();
        int dobro = exec_4.exibirValor(10);
        assertEquals("O dobro é invalido", 20, dobro);

    }

    @Test
    public void testeMatematico() {
        Exec_5 exec_5 = new Exec_5();
        int matematico = exec_5.soma(40, 20, 10);
        int matemati = exec_5.sub(40, 20, 10);
        int matema = exec_5.multi(4, 1, 2);
        int mate = exec_5.media(40, 20, 10);
        assertEquals("O resultado é", 70, matematico);
        assertEquals("O resultado é",10, matemati);
        assertEquals("O resultado é",8, matema);
        assertEquals("O resultado é",23, mate);
    }
}
