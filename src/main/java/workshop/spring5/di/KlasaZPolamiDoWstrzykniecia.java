package workshop.spring5.di;


import lombok.Data;

/*
    TODO 3 klasa, w której pole będziemy wstrzykiwali instancję Colaborator
    zwróć uwagę, że tylko jedno pole ma andotację
 */
@Data
class KlasaZPolamiDoWstrzykniecia {

    @WstrzyknijJesliMnieZnajdziesz
    private Colaborator colaboratorZAdnotacja;
    private Colaborator colaboratorBezAdnotacji;

}
