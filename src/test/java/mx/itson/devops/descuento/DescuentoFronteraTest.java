package mx.itson.devops.descuento;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * P2 - Pruebas de frontera.
 *
 * Un fallo por fail("TODO...") solo significa "no escribi la prueba".
 * NO es evidencia de un defecto: eso lo demuestra un fallo con
 * valor esperado y valor obtenido.
 */
class DescuentoFronteraTest {

    private final Descuento descuento = new Descuento();

    @Test
    void sinDescuentoJustoAntesDeLaFrontera() {
        // preparar / ejecutar / comparar
        int obtenido = descuento.porcentaje(99);
        assertEquals(0, obtenido);
    }

    @Test
    void diezPorCientoEnLaFrontera() {
        int obtenido = descuento.porcentaje(100);
        int esperado = 10;
        assertEquals(esperado, obtenido);
    }

    @Test
    void diezPorCientoDespuesDeLaFrontera() {
        int obtenido = descuento.porcentaje(101);
        int esperado = 10;
        assertEquals(esperado, obtenido);
    }

    @Test
    void unidadesNegativas() {
        System.out.println("Prueba de Unidades Negativas");
        assertThrows(IllegalArgumentException.class, () ->  descuento.porcentaje(-1));
    }
}
