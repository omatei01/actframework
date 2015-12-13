package act.di;

import act.app.AppService;
import act.util.ActContext;

public interface DependencyInjector<DI extends DependencyInjector> extends AppService<DI> {
    /**
     * Create an instance of type T using the class of type T
     * @param clazz
     * @param <T>
     * @return the injector instance
     */
    <T> T create(Class<T> clazz);

    /**
     * Create an injector that is able to inject {@link ActContext} instance if the type
     * is required
     * @param context
     * @return a injector instance support injecting app context
     */
    DependencyInjector<DI> createContextAwareInjector(ActContext context);
}
