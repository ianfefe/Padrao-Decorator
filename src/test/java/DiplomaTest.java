import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DiplomaTest {

    @Test
    void deveRetornarDiplomaDeCurso() {
        Diploma diploma = new DiplomaCurso();

        assertEquals("Diploma de Curso", diploma.getDescricao());
        assertEquals(50.0, diploma.getCusto());
    }

    @Test
    void deveRetornarDiplomaDePalestra() {
        Diploma diploma = new DiplomaPalestra();

        assertEquals("Diploma de Palestra", diploma.getDescricao());
        assertEquals(20.0, diploma.getCusto());
    }

    @Test
    void deveAdicionarMolduraAoDiplomaDeCurso() {
        Diploma diploma = new Moldura(new DiplomaCurso());

        assertEquals("Diploma de Curso, Moldura", diploma.getDescricao());
        assertEquals(80.0, diploma.getCusto());
    }

    @Test
    void deveAdicionarAssinaturaDigitalAoDiplomaDePalestra() {
        Diploma diploma = new AssinaturaDigital(new DiplomaPalestra());

        assertEquals("Diploma de Palestra, Assinatura Digital", diploma.getDescricao());
        assertEquals(30.0, diploma.getCusto());
    }

    @Test
    void deveCombinarVariosDecorators() {
        Diploma diploma = new Traducao(new AssinaturaDigital(new Moldura(new DiplomaCurso())));

        assertEquals("Diploma de Curso, Moldura, Assinatura Digital, Tradução", diploma.getDescricao());
        assertEquals(115.0, diploma.getCusto());
    }

    @Test
    void deveAceitarMesmoDecoratorMaisDeUmaVez() {
        Diploma diploma = new Moldura(new Moldura(new DiplomaPalestra()));

        assertEquals("Diploma de Palestra, Moldura, Moldura", diploma.getDescricao());
        assertEquals(80.0, diploma.getCusto());
    }
}
