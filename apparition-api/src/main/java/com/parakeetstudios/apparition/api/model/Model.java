package com.parakeetstudios.apparition.api.model;

import java.util.UUID;

public interface Model {

    UUID getUniqueId();
    int getEntityId();

    Transform getTransformation();
    void setTransformation(Transform transformation);

    void spawn();

}
