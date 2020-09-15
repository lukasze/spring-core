package workshop.spring5.di;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/*
    TODO 4 KlasA DI  - metoda wstrzyknij, dostarcza instancję polu o typie Colaborator, oznaczonemu @WstrzyknijJesliMnieZnajdziesz



 */
class DI {
    static void wstrzyknij(Object target) throws IllegalAccessException {
        // TODO 5 pobierz pola obiektu i przeiteruj po nich
        Field[] declaredFields = target.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            // TODO 6 Pobierz adnotacje pola i przeiteruj po nich
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                // TODO 7 jeśli pole o typie Colaborator i ma adnotację @WstrzyknijJesliMnieZnajdziesz
                //  utwórz nową instancję Colaborator'a i przypisz ją do pola
                if (isColaborator(field) && isWstrzyknijJesliMnieZnajdzieszAnnotation(annotation)) {
                    field.setAccessible(true);
                    field.set(target, new Colaborator("Wstrzyknięty Colaborator"));
                    field.setAccessible(false);
                    break;
                }

            }
        }

    }

    private static boolean isColaborator(Field field) {
        return field.getType().getSimpleName().equals(Colaborator.class.getSimpleName());
    }
    private static boolean isWstrzyknijJesliMnieZnajdzieszAnnotation(Annotation annotation) {
        return WstrzyknijJesliMnieZnajdziesz.class.getSimpleName().equals(annotation.annotationType().getSimpleName());
    }
}
