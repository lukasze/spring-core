package workshop.spring5.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// TODO 1 własna adnotacja - odpowiednik @Autowired w Springu
@Retention(RetentionPolicy.RUNTIME)
@interface WstrzyknijJesliMnieZnajdziesz {

}
