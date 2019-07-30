import Entity.Caixa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;


public class CaixaTest{

    @Test
    public void aoTentarSacarUmRealDeveSerRetornadoUmaException(){

        //Give
        Caixa caixa = new Caixa();
        int valorSacado = 1;

        Assertions.assertThrows(NullPointerException.class, () -> caixa.sacar(valorSacado));
    }

    @Test
    public void aoTentarSacarDoisReaisDeveSerRetornadoColecaoComCedulaEQuantidade(){

        //Give
        Caixa caixa = new Caixa();
        int valorSacado = 2;

        HashMap<Integer, Integer> retorno =  new HashMap<Integer, Integer>();
        retorno = caixa.sacar(valorSacado);

        //When
       HashMap<Integer, Integer> expected =  new HashMap<Integer, Integer>();
       expected.put(2, 1);

        //Than
        Assertions.assertEquals(expected, retorno);
    }

    @Test
    public void aoTentarSacarCincoReaisDeveSerRetornadoColecaoComCedulaEQuantidade(){

        //Give
        Caixa caixa = new Caixa();
        int valorSacado = 5;

        HashMap<Integer, Integer> retorno =  new HashMap<Integer, Integer>();
        retorno = caixa.sacar(valorSacado);

        //When
        HashMap<Integer, Integer> expected =  new HashMap<Integer, Integer>();
        expected.put(5, 1);

        //Than
        Assertions.assertEquals(expected, retorno);
    }

    @Test
    public void aoTentarSacarDezReaisDeveSerRetornadoColecaoComCedulaEQuantidade(){

        //Give
        Caixa caixa = new Caixa();
        int valorSacado = 10;

        HashMap<Integer, Integer> retorno =  new HashMap<Integer, Integer>();
        retorno = caixa.sacar(valorSacado);

        //When
        HashMap<Integer, Integer> expected =  new HashMap<Integer, Integer>();
        expected.put(10, 1);

        //Than
        Assertions.assertEquals(expected, retorno);
    }

    @Test
    public void aoTentarSacarVinteReaisDeveSerRetornadoColecaoComCedulaEQuantidade(){

        //Give
        Caixa caixa = new Caixa();
        int valorSacado = 20;

        HashMap<Integer, Integer> retorno =  new HashMap<Integer, Integer>();
        retorno = caixa.sacar(valorSacado);

        //When
        HashMap<Integer, Integer> expected =  new HashMap<Integer, Integer>();
        expected.put(20, 1);

        //Than
        Assertions.assertEquals(expected, retorno);
    }

    @Test
    public void aoTentarSacarCinquentaReaisDeveSerRetornadoColecaoComCedulaEQuantidade(){

        //Give
        Caixa caixa = new Caixa();
        int valorSacado = 50;

        HashMap<Integer, Integer> retorno =  new HashMap<Integer, Integer>();
        retorno = caixa.sacar(valorSacado);

        //When
        HashMap<Integer, Integer> expected =  new HashMap<Integer, Integer>();
        expected.put(50, 1);

        //Than
        Assertions.assertEquals(expected, retorno);
    }

    @Test
    public void aoTentarSacarCemReaisDeveSerRetornadoColecaoComCedulaEQuantidade(){

        //Give
        Caixa caixa = new Caixa();
        int valorSacado = 100;

        HashMap<Integer, Integer> retorno =  new HashMap<Integer, Integer>();
        retorno = caixa.sacar(valorSacado);

        //When
        HashMap<Integer, Integer> expected =  new HashMap<Integer, Integer>();
        expected.put(100, 1);

        //Than
        Assertions.assertEquals(expected, retorno);
    }

    @Test
    public void aoTentarSacarTresReaisDeveSerRetornadoColecaoComCedulaEQuantidade(){

        //Give
        Caixa caixa = new Caixa();
        int valorSacado = 3;

        Assertions.assertThrows(NullPointerException.class, () -> caixa.sacar(valorSacado));
    }

    @Test
    public void aoTentarSacarQuatroReaisDeveSerRetornadoColecaoComCedulaEQuantidade(){

        //Give
        Caixa caixa = new Caixa();
        int valorSacado = 4;

        HashMap<Integer, Integer> retorno =  new HashMap<Integer, Integer>();
        retorno = caixa.sacar(valorSacado);

        //When
        HashMap<Integer, Integer> expected =  new HashMap<Integer, Integer>();
        expected.put(2, 2);

        //Than
        Assertions.assertEquals(expected, retorno);
    }

    @Test
    public void aoTentarSacarSeisReaisDeveSerRetornadoColecaoComCedulaEQuantidade(){

        //Give
        Caixa caixa = new Caixa();
        int valorSacado = 6;

        HashMap<Integer, Integer> retorno =  new HashMap<Integer, Integer>();
        retorno = caixa.sacar(valorSacado);

        //When
        HashMap<Integer, Integer> expected =  new HashMap<Integer, Integer>();
        expected.put(2, 3);

        //Than
        Assertions.assertEquals(expected, retorno);
    }
}
