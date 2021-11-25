import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PresidenteTest {


     @Test
     public void deveRetornarNome() {
         Presidente.getPresidente().setNome("Marco Antonio");
         assertEquals("Marco Antonio", Presidente.getPresidente().getNome());
     }


    @Test
     public void deveRetornarCPF() {
         Presidente.getPresidente().setCPF("104130696231");
         assertEquals("104130696231", Presidente.getPresidente().getCPF());
     }
 }
