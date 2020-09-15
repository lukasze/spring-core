package workshop.spring5.event;


public class Main {

    public static void main(String[] args) {

    }
}


/*
    TODO 1 szkielet aplikacji
                                klasy
                                        Main
                                        MainConfig

                                        CustomEvent
                                        CustomListener
                                        CustomPublisher
                                        SpringEventListener

 */

/*
    TODO 2 MainConfig

                                klasa konfiguracyjna, skanowanie pakietu workshop.sc.events
 */

/*
    TODO 3 Main
                                metoda main, w niej utworzenie / zamknięcie kontekstu
 */

/*
    TODO 4 SpringEventListener

                                klasa nasłuchująca zdarzenie Springa - ContextRefreshedEvent

                                implementuje ApplicationListener
                                wypisuje do konsoli info o odświeżeniu kontekstu

 */

/*
    TODO 5 uruchom aplikację i podejrzyj, czy w konsoli pojawił się komunikat ze SpringEventListener
 */

/*
    TODO 6 CustomEvent
                                klasa zdarzenia
                                                rozszerza ApplicationEvent

                                                pole msg:String
                                                konstruktor(Object, String)
                                                getMsg:String

 */

/*
    TODO 7 CustomPublisher
                                klasa publikująca CustomEvent

                                wstrzyknięta zależność ApplicationEventPublisher
                                metoda publishCustomEvent(String):void
                                                                        wydrukuj do konsoli bieżący wątek
                                                                        wywołaj publishEvent na wstrzykniętej zależności
 */

/*
    TODO 8 CustomListener
                                klasa nasłuchująca zdarzenie CustomEvent

                                implementuje ApplicationListener
                                                                   wydrukuj do konsoli bieżący wątek
                                                                   wydrukuj do konsoli to, co zwraca getMsg z CustomEvent


 */


/*
    TODO 9 W main pobierz z kontekstu ziarno typu CustomPublisher i wywołaj na nim publishCustomEvent
                                                                  uruchom aplikację i podejrzyj komunikaty w konsoli
 */

/*
    TODO 10 MainConfig

                        asynchroniczne eventy
                                                zadeklaruj @Bean - metoda zwraca ApplicationEventMulticaster
                                                ApplicationEventMulticaster ma ustawiony SimpleTaskExecutor

 */

/*
    TODO 11 uruchom aplikację i podejrzyj komunikaty w konsoli
 */
