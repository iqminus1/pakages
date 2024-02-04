package pdp.uz.service;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerService {
    private static EntityManagerService instance;

    private EntityManagerService() {
        factory = Persistence.createEntityManagerFactory("app_jakarta_api");
    }

    public static EntityManagerService getInstance() {
        if (instance == null) instance = new EntityManagerService();
        return instance;
    }

    private static EntityManagerFactory factory;

    public EntityManagerFactory getFactory() {
        return factory;
    }
}
