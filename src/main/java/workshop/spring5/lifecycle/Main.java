package workshop.spring5.lifecycle;

public class Main {

    public static void main(String[] args) {

    }


    /*
        TODO 1 szkielet aplikacji
                                    klasy:
                                            workshop.sc.lifecycle.LifecycleDemoBean
                                            workshop.sc.lifecycle.config.MainConfig
                                            workshop.sc.lifecycle.service.HelloService
                                            workshop.sc.lifecycle.service.processor.CustomBeanPostProcessor


     */

    /*
        TODO 2 LifecycleDemoBean
                                    implementuje InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware,
                                    ApplicationContextAware: w zaimplementowanych metodach wypisać do konsoli nazwę metody

                                    zaimplementować dodatkowo 4 metody (void, wypisują do konsoli swojąnazwę):
                                    beforeInit() i afterInit()
                                    metodę oznaczoną @PostConstruct
                                    metodę oznaczoną @PreDestroy

     */

    /*
        TODO 3 MainConfig
                                    klasa konfiguracyjna - ustawić skanowanie pakietów na workshop.sc.lifecycle

     */

    /*
        TODO 4 Main
                                    w metodzie main:
                                    utwórz ApplicationContext
                                    zamknij kontekst

                                    uruchom aplikację i prześledź komunikaty w konsoli
     */

    /*
        TODO 5 CustomBeanPostProcessor
                                    implementuje BeanPostProcessor
                                    obie metody będą procesowały tylko ziarno LifecycleDemoBean
                                    wywołają na nim odpowiednio:
                                            postProcessBeforeInitialization - beforeInit
                                            postProcessAfterInitialization - afterInit

                                    uruchom aplikację i prześledź komunikaty w konsoli - czy coś się zmieniło?
     */


    /*
        TODO 6 HelloService
                                    pole msg:String
                                    implementuje BeanFactoryPostProcessor
                                                 w implementacji postProcessBeanFactory ustawia wartość msg
                                                 wypisuje do konsoli nazwę metody

     */

    /*
        TODO 7 MainConfig
                                    konfiguracja  HelloService - ustaw msg na jakąś wartość

                                    uruchom aplikację - czy coś się zmieniło

     */

    /*
        TODO 8 eksperymenty
                                    HelloService bez implementacji BeanFactoryPostProcessor
                                    konfiguracja bez ustawienia msg
     */
}