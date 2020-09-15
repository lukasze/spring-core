package workshop.spring5.di;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class DITest {

    @SneakyThrows
    @Test
    void wstrzyknij() {
        // given
        KlasaZPolamiDoWstrzykniecia klasaZPolamiDoWstrzykniecia = new KlasaZPolamiDoWstrzykniecia();
        assertAll(
                () -> assertNull(klasaZPolamiDoWstrzykniecia.getColaboratorBezAdnotacji()),
                () -> assertNull(klasaZPolamiDoWstrzykniecia.getColaboratorZAdnotacja())
        );

        // when
        DI.wstrzyknij(klasaZPolamiDoWstrzykniecia);
        // then
        assertAll(
                () -> assertNull(klasaZPolamiDoWstrzykniecia.getColaboratorBezAdnotacji()),
                () -> assertNotNull(klasaZPolamiDoWstrzykniecia.getColaboratorZAdnotacja())
        );

    }
}